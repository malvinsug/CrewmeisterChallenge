import static org.junit.Assert.assertEquals;

import crewmeister.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

/**
 * This class is written for running some unit tests once the candidates
 * push their code into the repository. Each test has a 2 minutes timeout.
 */
public class CrewmeisterChallengeTest {
  private String word;
  private StringBuilder wordBuilder;
  private String actual;
  private String expected;

  @Rule
  public Timeout globalTimeout= new Timeout(120000); // Timeout = 2 minutes

  @Test
  public void palindromTest() {
    word = "abcba";
    wordBuilder = new StringBuilder(word);

    actual = CrewmeisterChallenge.crewmeisterRevert(word);
    expected = wordBuilder.reverse().toString();
    assertEquals(expected,actual);

    word = "abba";
    wordBuilder = new StringBuilder(word);

    actual = CrewmeisterChallenge.crewmeisterRevert(word);
    expected = wordBuilder.reverse().toString();
    assertEquals(expected,actual);
  }

  @Test
  public void stringWithSameCharacterTest() {
    word = "AAAAA";
    wordBuilder = new StringBuilder(word);

    actual = CrewmeisterChallenge.crewmeisterRevert(word);
    expected = wordBuilder.reverse().toString();
    assertEquals(expected,actual);
  }

  @Test
  public void randomCharactersTest() {
    word = "zS6eC2sJ6k";
    wordBuilder = new StringBuilder(word);

    actual = CrewmeisterChallenge.crewmeisterRevert(word);
    expected = wordBuilder.reverse().toString();
    assertEquals(expected,actual);
  }

  @Test
  public void stringWithSpaceTest() {
    word = "zS 6e C2  sJ6   k";
    wordBuilder = new StringBuilder(word);

    actual = CrewmeisterChallenge.crewmeisterRevert(word);
    expected = wordBuilder.reverse().toString();
    assertEquals(expected,actual);
  }

  @Test
  public void stringWithEnterSymbolTest() {
    word = "zs6e\nC2sJ6k";
    wordBuilder = new StringBuilder(word);

    actual = CrewmeisterChallenge.crewmeisterRevert(word);
    expected = wordBuilder.reverse().toString();
    assertEquals(expected,actual);
  }

  @Test
  public void emptyStringTest() {
    word = "";
    wordBuilder = new StringBuilder(word);

    actual = CrewmeisterChallenge.crewmeisterRevert(word);
    expected = wordBuilder.reverse().toString();
    assertEquals(expected,actual);
  }

  @Test
  public void longestStringTest() {
    // The test will fail if it exceeds the timeout.
    word = generateLongestString();
    wordBuilder = new StringBuilder(word);
    actual = CrewmeisterChallenge.crewmeisterRevert(word);
    expected = wordBuilder.reverse().toString();
    assertEquals(expected,actual);

  }

  @Test(expected = NullPointerException.class)
  public void nullInputTest() {
    CrewmeisterChallenge.crewmeisterRevert(null);
  }

  private String generateLongestString() {
    String longestString = "";
    int maxValue = Integer.MAX_VALUE-1;
    for (int i=0;i<=maxValue;i++) {
      longestString += "a";
    }
    longestString += "b";
    return longestString;
  }
}
