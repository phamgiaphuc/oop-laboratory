# Object-Oriented Programming - Lab 05

# Student information
- Name: Phạm Gia Phúc
- ID: ITCSIU22178

# Question 1
1. Implement the constructor `public Point (int x)`
- [Code](./question1/Point.java)
2. Give examples to show the difference between `count1` and `count2`
- Add this code to the main class:
```java
package org.example.lab05.question1;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1);
        Point point2 = new Point(1);
        System.out.println("Point: " + Point.count1);
        System.out.println("Point 1: " + point1.count2);
        System.out.println("Point 2: " + point2.count2);
    }
}
```
- The result of the above code:
```shell
Ctor of Point
Ctor of Point
Point: 2
Point 1: 1
Point 2: 1
```
- As we can see from the above result, when 2 objects `Point` point1 and point2 are created, the `count2` is added up to `2` but the `count1` is remained the same as `1`
. This is due to the keyword `static`. The static `keyword` in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. 
The static keyword belongs to the class than an instance of the class. Therefore, in the code, we access the `count2` by the class name not the object.
- Another reason for the result is that when variables or classes that has keyword `static` are created during the program, this data types will be only initialized only once and being reused
during the program.
3. Implement the constructor `public ThreeDPoint (int x, int y, int z)`
- [Code](./question1/ThreeDPoint.java)
4. What is the output after calling `ThreeDPoint b = new ThreeDPoint (1,2,3)`
- Output: `Ctor of ThreeDPoint`

# Question 2
- [Code](./question2/Pay.java)
```shell
Employee A earns 1000.0$ per month
Employee B earns 997.5$ per month
Employee C earns 1400.0$ per month
After modification
Employee B earns 1155.0$ per month
Employee C earns 1440.0$ per month
```
