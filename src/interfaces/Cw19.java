package interfaces;

import java.util.Random;

/**
 * Created by Rafal on 02017-03-09.
 */
interface ProbabilityGame{
    Random random = new Random();
    int getResult();
}
interface ProbabilityGameFactory{
    ProbabilityGame getGame();
}
class CoinFlip implements ProbabilityGame{
    public int getResult(){
        return (random.nextBoolean()) ? 0 : 1;
    }
}
class DiceThrow implements ProbabilityGame{
    public int getResult(){
        return random.nextInt(6)+1;
    }
}
class CoinFlipFactory implements ProbabilityGameFactory{
    public CoinFlip getGame(){return new CoinFlip();}
}
class DiceThrowFactory implements ProbabilityGameFactory{
    public DiceThrow getGame(){return new DiceThrow();}
}
public class Cw19 {
    public static void play(ProbabilityGameFactory pgf){
        ProbabilityGame game = pgf.getGame();
        System.out.println(game.getResult());
    }

    public static void main(String[] args) {
        play(new CoinFlipFactory());
        play(new DiceThrowFactory());
    }
}
