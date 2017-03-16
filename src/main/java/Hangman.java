import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hangman{
  private String[] words = {"buffalo", "luxury", "oxygen", "rhythm", "scratch", "voodoo", "wizard", "zigzag", "jinx", "frizzled"};
  private Integer randomInt = new Random().nextInt(words.length);
  private String theWord = words[randomInt];
  private String currentRevealedWord = theWord.replaceAll(".","-");

  public Hangman(){

  }

  // public void setCurrentRevealedWord(String change){
  //   currentRevealedWord = change;
  // }

  public String getCurrentRevealedWord(){
    return currentRevealedWord;
  }

  public Integer getRandomInt(){
    return randomInt;
  }

  public void setTheWord(String userWord){
    theWord = userWord;
  }

  public String randomWord() {
    return words[randomInt];
  }

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

  public void replacePositions(char letter) {
    List<Integer> theIndeces = findPositions(letter);
    for (int i = 0; i< theIndeces.size(); i++){
      int index = theIndeces.get(i);
      currentRevealedWord = currentRevealedWord.substring(0, index)+letter+currentRevealedWord.substring(index+1);
    }
    // for ( Integer index : theIndeces ) {
    //   // if(index != currentRevealedWord.length()){
    //     currentRevealedWord = currentRevealedWord.substring(0, index)+letter+currentRevealedWord.substring(index+1);
    //   // } else{
    //   //   currentRevealedWord = currentRevealedWord.substring(0, index)+letter;
    //   // }
    // }
  }

}
