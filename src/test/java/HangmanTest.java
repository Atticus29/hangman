import org.junit.*;
import static org.junit.Assert.*;

public class HangmanTest {

  @Test
  public void Hangman_instantiatesHangman() {
    Hangman testHangman = new Hangman();
    assertEquals(true, testHangman instanceof Hangman);
  }

  @Test
  public void Hangman_pickWordAtRandom_true() {
    Hangman testHangman = new Hangman();
    Integer wordIndex = testHangman.getRandomInt();
    assertEquals(true, wordIndex instanceof Integer);
   }
}
