import java.util.Scanner;

public class Human{
   
    private int choice;
    private Scanner input;
    
    public Human(){
        input=new Scanner(System.in);
        choice = -1;
    }
    
    public void move(){
        
        choice = input.nextInt();
    }
    
    
    public int getChoice(){
        return choice;
    }
    
    
}
