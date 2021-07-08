package impl;

import interfaces.Person;
import lombok.Data;


@Data
public class Abonent implements Person {
    private String name;
    private Integer age;
    private int id;
    private Phone phone;

    public Abonent(Integer age) {
        this.age = age;
    }

    public Abonent() {

    }


}
