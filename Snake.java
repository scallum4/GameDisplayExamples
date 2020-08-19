import gameDisplay.*;

public class Snake{
    private GameDisplay display;



    public Snake(){
        init();
    }

    public void init(){
        display = new GameDisplay(500, 500);
        display.setBackgroundColour("BLACK");
    }


    public static void main(String[] Args){
        Snake s = new Snake();
    }
}