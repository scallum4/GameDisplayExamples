import gameDisplay.*;
import java.util.concurrent.ThreadLocalRandom;

public class FlappyBird{
    private int windowWidth;
    private int windowHeight;
    private GameDisplay display;
    private Circle bird;
    private Text score;
    private Square tubeTop;
    private Square tubeBottom;
    private int tubeHeightGap = 130;
    private int tubeWidthGap = 100;



    public FlappyBird(){
        init();
    }

    public void init(){
        display = new GameDisplay(300, 500);
        display.setBackgroundColour("CYAN");
        windowWidth = display.getWidth();
        windowHeight = display.getHeight();
        bird = new Circle( 30, 30, (windowWidth / 2) - 15, windowHeight / 2, "YELLOW");
        score = new Text( "0", (windowWidth / 2) - 15, 50, 50, "WHITE");
        tubeTop = new Square(60, 250, (windowWidth / 2) - 30, 0 - (tubeHeightGap /2), "GREEN");
        tubeBottom = new Square(60, 250, (windowWidth / 2) - 30, 250 + (tubeHeightGap /2), "GREEN");
        display.addElement(bird);
        display.addElement(score);
        display.addElement(tubeTop);
        display.addElement(tubeBottom);
    }

    public int randomNumber(int minNuber, int maxNumber){
        return ThreadLocalRandom.current().nextInt(minNuber, maxNumber + 1);
    }

    public static void main(String[] Args){
        FlappyBird f = new FlappyBird();
    }
}