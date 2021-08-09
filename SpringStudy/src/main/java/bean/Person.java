package bean;

/**
 * @Author: xk
 * @Date: 2021/7/8 13:03
 * @Desc:
 */
public class Person {
    private String name;
    private int age;


    public Person() {
        System.out.println("Person被创建了！");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
