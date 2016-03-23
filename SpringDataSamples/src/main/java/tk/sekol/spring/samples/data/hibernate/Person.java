package tk.sekol.spring.samples.data.hibernate;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @author kolesnikov
 */
@Entity
@Table(name = "PERSONS")
public class Person implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}
