public class Parent {

    public Parent() {        // default constructor automatically calls before child class

        System.out.println("default constructor of parent class");
    }

    public Parent(int a) {        // default constructor automatically calls before child class

        System.out.println("parameterized constructor of parent class");
    }
}
