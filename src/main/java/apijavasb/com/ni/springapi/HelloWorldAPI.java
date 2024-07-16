package apijavasb.com.ni.springapi;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldAPI {
    @Autowired
    private HelloWorldRepository repository;

    @GetMapping("/hello/{name}/{age}")
    public String hello(@PathVariable String name, @PathVariable Integer age) {

        HelloWorldEntity helloworld = new HelloWorldEntity();
        // Si el nombre está vacío, asignar un valor predeterminado
        if (name == null || name.trim().isEmpty()) {
            name = helloworld.getName(); // Valor por defecto si name está vacío
        }

        String welcomeMsg = "Welcome: " + name + " Age: " + age + ": " + LocalDateTime.now();

        helloworld.setMsj(welcomeMsg);
        helloworld.setAge(age);
        helloworld.setName(name);
        repository.save(helloworld);

        return welcomeMsg;
    }

}
