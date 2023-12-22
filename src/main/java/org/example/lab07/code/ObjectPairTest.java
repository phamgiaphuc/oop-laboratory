package org.example.lab07.code;

import java.util.Arrays;

public class ObjectPairTest {

  /**
   * Create several stadium pairs then print the name of the stadium with the largest capacity.
   * 
   * @param args Not used.
   */
  public static void main(String[] args) {

    ObjectPair[] stadiums = new ObjectPair[3];
    stadiums[0] = new ObjectPair("Bridgeforth Stadium", 25000);
    stadiums[1] = new ObjectPair("Michigan Stadium", 109901);
    stadiums[2] = new ObjectPair("Lane Stadium", "66233567");

    System.out.println(stadiums[0]);

    System.out.println("The stadium with the largest capacity: " + largestStadium(stadiums));
  }

  /**
   * Returns the name of the stadium with the largest capacity.
   * 
   * @param stadiums An array of ObjectPairs where each pair contains a stadium name followed by an
   *        integer capacity
   * @return The name of the stadium with the largest capacity
   */
  public static String largestStadium(ObjectPair[] stadiums) {
    int largestNum = 0;
    int oldNum;
    ObjectPair largestStadium = null;
    for (ObjectPair objectPair : stadiums) {
      int currentNum = 0;
      Object secondValue = objectPair.getSecond();
      if (objectPair.getSecond() instanceof String) {
        currentNum = Integer.parseInt((String) secondValue);
      }
      oldNum = largestNum;
      largestNum = Math.max(largestNum, currentNum);
      if (oldNum != largestNum) {
        largestStadium = objectPair;
      }
    }
    return largestStadium.getFirst().toString();
  }

}
