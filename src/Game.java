import java.util.Random;

public class Game{
    
    private int marbles;
    private Human humanPlayer;
    private Computer computerPlayer;
    private int firstPlayer;
    private String winner;
    Random r = new Random();
    
    public Game(int difficulty){
        
        marbles = r.nextInt(90) + 10;
        firstPlayer = r.nextInt(2);
        humanPlayer = new Human();
        computerPlayer = new Computer(difficulty);
        
    }
     
    public void play(){
        
        if (firstPlayer == 0) {
            
            System.out.println("Computer will play the first turn.");
            
            while (marbles > 0) {
                
                System.out.println(marbles + " marbles remaining.");
                
                computerPlayer.move(marbles);
                marbles -= computerPlayer.getChoice();
                
                System.out.println("Computer has removed " + computerPlayer.getChoice() + " marbles. ");
                
                if (marbles == 0) {
                    winner = "Human";
                }
                
                if (marbles > 0) {
                    
                    System.out.println(marbles + " marbles remaining.");
                    System.out.print("How many marbles would you like to remove? ");
                    humanPlayer.move();
                    marbles -= humanPlayer.getChoice();
                    
                    System.out.println("Human has removed " + humanPlayer.getChoice() + " marbles. ");
                    
                    if (marbles == 0) {
                        winner = "Computer";
                    } 
                }
            }
            
        } else if (firstPlayer == 1) {
            
            System.out.println("Human will play the first turn.");
            
            while (marbles > 0) {
                
                System.out.println(marbles + " marbles remaining.");
                
                System.out.print("How many marbles would you like to remove? ");
                
                humanPlayer.move();
                marbles -= humanPlayer.getChoice();
                
                System.out.println("Human has removed " + humanPlayer.getChoice() + " marbles.");
                
                if (marbles == 0) {
                    winner = "Computer";
                }
                
                if (marbles > 0) {
                    
                    System.out.println(marbles + " marbles remaining.");
                    
                    computerPlayer.move(marbles);
                    marbles -= computerPlayer.getChoice();
                    
                    System.out.println("Computer has removed " + computerPlayer.getChoice() + " marbles.");
                    
                    if (marbles == 0) {
                        winner = "Human";
                    }
                    
                }
                
                
            }
        }
        
        System.out.println(winner + " has won.");
        
    }
    
    public static double logarithm(double argument, double base) {
        return (Math.log(argument)/Math.log(base));
    }


}