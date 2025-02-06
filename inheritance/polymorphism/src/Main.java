class Bike{
    void run(){
        System.out.println("Bike is running");
    }
}

class yamaha extends Bike{
    void run(){
        System.out.println("yamaha bike is running");
    }

}

class newyamaha extends yamaha{
    void run(){
        System.out.println("newyamaha bike is running");
    }
}

public class Main {
    public static void main(String[] args) {
            Bike b1= new yamaha(); // UPCASTING
            Bike b2= new newyamaha();
            b1.run();
            b2.run();
    }
}