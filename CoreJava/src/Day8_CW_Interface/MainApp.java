package Day8_CW_Interface;

public class MainApp 
{
 public static void main(String[] args) 
 {
    Bounceable b;
    b= new Ball();
    b.bounce();
    ((Ball)b).move();
    System.out.println("\n\n\n");
    Moveable m;
    m= new Car();
    m.move();
    
 }
}