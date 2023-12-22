# Object-Oriented Programming - Lab 06

# Student information
- Name: Phạm Gia Phúc
- ID: ITCSIU22178

# Part 1: Object Elements

1. Complete the method so that it conforms to the Javadoc comments. Test to make sure that it works as expected. 
(HINT: You will need to perform some casts when you retrieve the items from the tuple.)
[Code](./code/ObjectPairTest.java)
```java
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
```
- Result:
```text
The stadium with the largest capacity: Lane Stadium
```
2. Why does this line of code compile?
```java
stadiums[0] = new ObjectPair("Bridgeforth Stadium", 25000);
```
- The reason for this is related to the autoboxing in Java. Autoboxing is a feature in Java that automatically converts primitive data types into their corresponding wrapper class objects and vice versa. 
In this case, the second parameter of the ObjectPair constructor is expecting an Object (a reference type), but you're passing an int (a primitive value).
- Autoboxing comes into play here because Java can automatically convert the primitive int value to its corresponding wrapper class Integer. 
The ObjectPair constructor likely accepts an Object as the second parameter, and since Integer is an object wrapper for int, the Java compiler automatically converts the primitive int to an Integer object using autoboxing.
- So, behind the scenes, the line of code is effectively equivalent to:
```java
stadiums[0] = new ObjectPair("Bridgeforth Stadium", Integer.valueOf(25000));
```

# Part 2: Generics
1. Create a copy of the class named `Pair`. Refactor this class to use Java generics. Your updated class should make it possible to independently specify the types of the first and second elements. 
[Code](./code/Pair.java)

2. Create a copy of the class named `PairTest`. Refactor this driver so that it uses your Pair class. The functionality should be unchanged. The resulting code should not include any cast operations.
[Code](./code/PairTest.java)

3. **BONUS QUESTION**: What happens if you re-introduce the problem that you fixed in step 1 from the previous section? Will the resulting code compile? 
Why do you think generic collection classes are sometimes called “type-safe” collections?
- The resulting code will compile. Because, generic collection classes in Java are referred to as "type-safe" because they provide compile-time type checking. 
When you use generics, you specify the type of elements that a collection can hold, and the compiler ensures that only objects of the specified type (or its subtypes) can be added to the collection. 
This helps catch type-related errors at compile time rather than at runtime.
- For example, if you have a List<String>, the compiler ensures that you can only add String objects to that list. If you try to add an object of a different type, the compiler generates an error.
This type safety makes code more robust and reduces the likelihood of runtime errors related to type mismatches.

4. **BONUS QUESTION**: List some reasons that the Pair class might be preferable to the ObjectPair class. Can you think of any situations where the ObjectPair class might be preferable?
- **Type Safety**: If you have a specific pair of types that you want to associate, using a Pair class with generic types allows for compile-time type safety. 
For example, Pair<String, Integer> ensures that the first element is a String and the second element is an Integer.
- **Readability**: The use of generics in the Pair class enhances code readability. It makes it clear what types of elements are paired without needing to inspect the implementation.
- **Code Reusability**: A generic Pair class can be reused across different parts of your codebase with different types, promoting code reusability.
- **Type Casting**: If you do not want to cast type, it is suitable to use Pair class.

# Part 3: Wildcards and Subclasses
Explanation for those lines that will not compile:
```java
Pair<String, Integer> p1;
// N
p1 = new Pair<Integer, Double>(23, 12.0);
```
- This above code is not compile because we initialize a new `Pair` but with different types of we defined. It supposes to be `<String, Integer>` not `<Integer, Double>`
- The same for this below code:
```java
Pair<String, Number> p2;
Pair<Object, Object> p3;
// N 
p2 = new Pair<String, Integer>("B", 8);
// N
p3 = new Pair<String, Integer>("C", 9);
```
- Another not compiled code:
```java
Pair<?, ?> p4;
p4 = new Pair<String, String>("House", "Car");
// N
Integer b = p4.getSecond();
```
- This code is not compiled because the type of the second variable is a string. So the `getSecond()` method will return a string value not a number
- Another not compiled code:
```java
Pair<?, ? extends Number> p5;
// N
p5 = new Pair<String, String>("E", "G");
// N
Integer d = p4.getSecond();
```
- This code is not compiled because the type of the second variable is wildcards extended the `Number` class so it must be a `number` type in the second value.
But the type we initialize is `<String, String>` which is not compatible with the defined types.
