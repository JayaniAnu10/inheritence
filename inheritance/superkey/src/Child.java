public class Child extends Parent{

    public Child() {
        //super(); here it is there as a default
        System.out.println("default constructor of child class");
    }

    public Child(int a) {
        super(a); //here it is there as a default,we can change with a parameter
        System.out.println("parameterized constructor of child class");
    }
}
