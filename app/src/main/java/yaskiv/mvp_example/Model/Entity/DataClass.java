package yaskiv.mvp_example.Model.Entity;

/**
 * Created by yaski on 18.04.2017.
 */

public class DataClass {
    Integer id;
    String Name;
    String Surname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public DataClass(Integer id, String name, String surname) {

        this.id = id;
        Name = name;
        Surname = surname;
    }
}
