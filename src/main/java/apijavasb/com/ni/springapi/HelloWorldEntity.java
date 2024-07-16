package apijavasb.com.ni.springapi;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hello_world")
public class HelloWorldEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="message")
    private String message;

    @Column(name = "name", nullable = false)
    private String name = "HAKI";

    @Column(name = "age", nullable = false)
    private Integer age = 0;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMsj() {
        return message;
    }

    public void setMsj(String message) {
        this.message = message;
    } 
}
