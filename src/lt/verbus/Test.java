package lt.verbus;

public class Test {
    String name;
    int age;

    public Test() {

    }

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo(){
        return "My name is " + name + " and my age is " + age;
    }
}
