public interface Animal {
    void sleep();
    void eat();

    default void newmethod(){
        System.out.println("in default method");
    }

    static void staticmethod(){
        System.out.println("in static method");
    }
}
