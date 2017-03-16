import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hangman{
  private String[] words = {"buffalo", "luxury", "oxygen", "rhythm", "scratch", "voodoo", "wizard", "zigzag", "jinx", "frizzled"};
  private Integer randomInt = new Random().nextInt(words.length);
  public Hangman(){

  }

  public Integer getRandomInt(){
    return randomInt;
  }
}
