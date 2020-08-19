import gameDisplay.*;
import java.util.concurrent.ThreadLocalRandom;

public class BouncingBalls{
    private int numberOfBalls;
    private int windowWidth;
    private int windowHeight;
    private GameDisplay display;
    private Circle Circles[];



    public BouncingBalls(int numberOfBalls){
        this.numberOfBalls = numberOfBalls;
        init();
    }

    public void init(){
        display = new GameDisplay(500, 500);
        display.setBackgroundColour("BLACK");
        windowWidth = display.getWidth();
        windowHeight = display.getHeight();
        Circles = new Circle[numberOfBalls];

        for(int i = 0; i < numberOfBalls; i++){
            Circles[i] = new Circle(30, 30, randomNumber(0, windowWidth - 30), randomNumber(0, windowHeight - 30), "RED");
            display.addElement(Circles[i]);
        }
    }

    public int randomNumber(int minNuber, int maxNumber){
        return ThreadLocalRandom.current().nextInt(minNuber, maxNumber + 1);
    }


    public static void main(String[] Args){
        BouncingBalls b = new BouncingBalls(30);
    }
}