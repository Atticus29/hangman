import org.junit.*;
import static org.junit.Assert.*;

public class HangmanTest {

  @Test
  public void Hangman_instantiatesHangman() {
    Hangman testHangman = new Hangman();
    assertEquals(true, testHangman instanceof Hangman);
  }

  @Test
  public void Hangman_getsRandomInt_true(){
    Hangman testHangman = new Hangman();
    assertEquals(true, testHangman.getRandomInt() instanceof Integer);
  }

  @Test
  public void Hangman_pickRandomInteger_true() {
    Hangman testHangman = new Hangman();
    Integer wordIndex = testHangman.getRandomInt();
    assertEquals(true, wordIndex instanceof Integer);
   }

   @Test
   public void Hangman_pickRandomWord_true() {
     Hangman testHangman = new Hangman();
     String word = testHangman.randomWord();
     assertEquals(true, word instanceof String);
   }

}
