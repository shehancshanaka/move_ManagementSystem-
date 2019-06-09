package lk.sCs.moveManagement.dto;

public class ActorDTO {

    private int id;
    private String name;
    private String age;

    public ActorDTO() {
    }

    public ActorDTO(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String address) {
        this.age = address;
    }

    @Override
    public String toString() {
        return "ActorDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + age + '\'' +
                '}';
    }
}
