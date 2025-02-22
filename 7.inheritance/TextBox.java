public class TextBox extends UIControl {
  public String text=""; // field 

  public TextBox() {
    super(true);
    System.out.println("TextBox");
  }

  public void setText(String text){
    this.text=text; // this. is used in when the parameter and the field name is same.
  }

  public void clear(){
    text ="";
  }
} 