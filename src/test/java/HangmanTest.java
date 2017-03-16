import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class HangmanTest {

  @Test
  public void Hangman_instantiatesHangman() {
    Hangman testHangman = new Hangman();
    assertEquals(true, testHangman instanceof Hangman);
  }

  // @Test
  // public void Hangman_getsRandomInt_true(){
  //   Hangman testHangman = new Hangman();
  //   assertEquals(true, testHangman.getRandomInt() instanceof Integer);
  // }

  // @Test
  // public void Hangman_pickRandomInteger_true() {
  //   Hangman testHangman = new Hangman();
  //   Integer wordIndex = testHangman.getRandomInt();
  //   assertEquals(true, wordIndex instanceof Integer);
  //  }

   @Test
   public void Hangman_pickRandomWord_true() {
     Hangman testHangman = new Hangman();
     testHangman.assignTheWordARandomWord();
     assertEquals(true, testHangman.getTheWord() instanceof String);
   }

   @Test
   public void Hangman_checkLetterNotInWord() {
     Hangman testHangman = new Hangman();
     testHangman.setTheWord("cat");
     List<Integer> expectedList = new ArrayList<Integer>();
     assertEquals(expectedList, testHangman.findPositions('g'));
   }

   @Test
   public void Hangman_checkSingleLetterInWord() {
     Hangman testHangman = new Hangman();
     testHangman.setTheWord("dog");
     List<Integer> expectedList = new ArrayList<Integer>();
     expectedList.add(1);
     assertEquals(expectedList, testHangman.findPositions('o'));
   }

   @Test
   public void Hangman_checkMultipleLettersInWord(){
     Hangman testHangman = new Hangman();
     testHangman.setTheWord("afterparty");
     List<Integer> expectedList = new ArrayList<Integer>();
     expectedList.add(0);
     expectedList.add(6);
     assertEquals(expectedList, testHangman.findPositions('a'));
   }

   @Test
   public void Hangman_checkLettersReplaceDashes_String() {
     Hangman testHangman = new Hangman();
     testHangman.setTheWord("abandon");
     String revealWord = testHangman.initializeRevealWord();
     String expectedString = "a-a----";
    //  assertEquals(true,testHangman.getCurrentRevealedWord() instanceof String);
     assertEquals(expectedString, testHangman.replacePositions('a', revealWord));
   }

   @Test
   public void Hangman_checkWhetherGameWon_true(){
     Hangman testHangman = new Hangman();
     testHangman.setTheWord("gaslight");
     String revealWord = testHangman.initializeRevealWord();
     revealWord = testHangman.replacePositions('g', revealWord);
     revealWord = testHangman.replacePositions('a', revealWord);
     revealWord = testHangman.replacePositions('s', revealWord);
     revealWord = testHangman.replacePositions('l', revealWord);
     revealWord = testHangman.replacePositions('i', revealWord);
     revealWord = testHangman.replacePositions('h', revealWord);
     revealWord = testHangman.replacePositions('t', revealWord);
     assertEquals(true, testHangman.isWon(revealWord));
   }


}
