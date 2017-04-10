package interfaces;

/**
 * Created by Rafal on 02017-03-09.
 */
interface Game{boolean move();}
interface GameFactory{
    Game getGame();}
class Checkers implements Game{
    private int moves = 0;
    private static final int MOVES = 3; // static final in CAPITALS despite private
    public boolean move(){
        System.out.println("Warcaby: ruch " + moves);
        return ++moves != MOVES; //!!!!!!!!! E
    }
}
class CheckersFactory implements GameFactory{ //fabryk dla warcabow
    public Game getGame(){return  new Checkers();}
}
class Chess implements Game{
    private int moves = 0;
    private static final int MOVES = 4;
    public boolean move(){
        System.out.println("szachy: ruch" + moves);
        return ++moves != MOVES; //!!!! E
    }
}
class ChessFactory implements GameFactory{ // fabryka dla szachow
    public Game getGame(){return new Chess();}
}

public class Games {
    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while (s.move())
            ;//!!!!!!
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}
