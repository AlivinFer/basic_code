package domain;

/**
 * @author: Alivin Fer
 * @date: 2021/2/16 1:09
 **/

public class classmates {
    private Integer id;
    private Integer age;
    private String name;
    private String sex;
    private String address;
    private Float English;
    private Float Math;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getEnglish() {
        return English;
    }

    public void setEnglish(Float english) {
        English = english;
    }

    public Float getMath() {
        return Math;
    }

    public void setMath(Float math) {
        Math = math;
    }

    @Override
    public String toString() {
        return "classmates{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", English=" + English +
                ", Math=" + Math +
                '}';
    }
}
