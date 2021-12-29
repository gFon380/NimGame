import java.util.Random;

public class Computer{
    
    private int mode;
    private int choice;
    Random r = new Random();
    
    public Computer(int m){
        mode = m;
        choice = -1;
    }
    
    public void move(int marblesLeft){
        
        if (mode == 1) {
            if (marblesLeft > 3) {
                choice = r.nextInt(marblesLeft/2) + 1;
            } else if (marblesLeft <= 3) {
                choice = 1;
            }
        } else if (mode == 2) {
            if ((Game.logarithm((marblesLeft + 1), 2))%1 == 0 && marblesLeft > 3) {
                choice = r.nextInt((marblesLeft/2)) + 1;
            } else if (marblesLeft <= 3) {
                choice = 1;
            } else {
                choice = (int)(marblesLeft - (Math.pow(2, Math.floor(Game.logarithm(marblesLeft, 2))) - 1));
            }
        }
    }
    
    
    public int getChoice(){
        return choice;
    }
    
    
}
