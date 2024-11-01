package org.example.lab07.code;

public class CompileTest {

  public static void main(String[] args) {
    Pair<String, Integer> p1;
    Pair<String, Number> p2;
    Pair<Object, Object> p3;
    Pair<?, ?> p4;
    Pair<?, ? extends Number> p5;

    // C
    p1 = new Pair<String, Integer>("A", 7);
    int a = p1.getSecond();

    // N
//    p1 = new Pair<Integer, Double>(23, 12.0);

    // N
//    p2 = new Pair<String, Integer>("B", 8);

    // N
//    p3 = new Pair<String, Integer>("C", 9);

    // C
    p4 = new Pair<String, String>("House", "Car");
    // C
    p4 = new Pair<String, Integer>("D", 10);

    // N
//    Integer b = p4.getSecond();
    Integer c = (Integer) p4.getSecond();

    // N
//    p5 = new Pair<String, String>("E", "G");
    // C
    p5 = new Pair<String, Double>("E", 11.0);
    // C
    p5 = new Pair<String, Integer>("E", 11);

//    Integer d = p4.getSecond();
    Integer e = (Integer) p4.getSecond();
  }

}
