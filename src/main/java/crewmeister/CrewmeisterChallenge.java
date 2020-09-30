package crewmeister;

public class CrewmeisterChallenge {
  /**
   * A method to reverse a string. For example, if the input is 'abc', then it should return 'cba'.
   * @param word is a string that has to be reversed.
   * @return a reversed string.
   */
  public  static  String crewmeisterRevert(String word) {
    StringBuilder stringBuilder = new StringBuilder(word);

    return stringBuilder.reverse().toString();
  }

}
