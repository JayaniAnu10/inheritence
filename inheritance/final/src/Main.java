//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
            Employee e1= new Employee();
            e1.laps=12;

        System.out.println(e1.race);
        System.out.println(e1.laps);

        Child c= new Child(); //final methods get inherited but not overide
        c.run();

    }
}