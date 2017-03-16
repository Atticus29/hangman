import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hangman{
  private String theWord;

  public Hangman(){

  }

  // public void setCurrentRevealedWord(String change){
  //   currentRevealedWord = change;
  // }

  public void assignTheWordARandomWord(){
    String[] words = {"luxury", "oxygen", "rhythm", "scratch", "voodoo", "wizard", "zigzag", "jinx", "frizzled"};
    Integer randomInt = new Random().nextInt(words.length);
    theWord = words[randomInt];
  }

  public String initializeRevealWord(){
    String currentRevealedWord = theWord.replaceAll(".","-");
    return currentRevealedWord;
  }

  // public String getCurrentRevealedWord(){
  //   return currentRevealedWord;
  // }

  // public Integer getRandomInt(){
  //   return randomInt;
  // }

  public String getTheWord(){
    return theWord;
  }

  public void setTheWord(String userWord){
    theWord = userWord;
  }

  // public String randomWord() {
  //   return words[randomInt];
  // }

  public List<Integer> findPositions(char letter){
    List<Integer> allIndeces = new ArrayList<Integer>();
    Integer index = theWord.indexOf(letter);
    if (index == -1){
      return allIndeces;
    } else{
      while (index >= 0) {
        allIndeces.add(index);
        index = theWord.indexOf(letter, index + 1);
      }
    }
    return allIndeces;
  }

  public String replacePositions(char letter, String currentRevealedWord) {
    List<Integer> theIndeces = findPositions(letter);
    // String currentRevealedWord = initializeRevealWord();
    System.out.println("Initialized revealed word is " + currentRevealedWord);
    for (int i = 0; i < theIndeces.size(); i++){
      int index = theIndeces.get(i);
      System.out.println("Index value is: " + index);
      System.out.println("Current revealed word is " + currentRevealedWord);
      // currentRevealedWord = currentRevealedWord.substring(index) + letter;
      currentRevealedWord = currentRevealedWord.substring(0, index)+letter+currentRevealedWord.substring(index+1, currentRevealedWord.length());
      System.out.println("Current revealed word after is " + currentRevealedWord);
    }
    // for ( Integer index : theIndeces ) {
    //   // if(index != currentRevealedWord.length()){
    //     currentRevealedWord = currentRevealedWord.substring(0, index)+letter+currentRevealedWord.substring(index+1);
    //   // } else{
    //   //   currentRevealedWord = currentRevealedWord.substring(0, index)+letter;
    //   // }
    // }
    return currentRevealedWord;
  }

}
