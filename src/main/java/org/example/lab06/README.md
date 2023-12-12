# Object-Oriented Programming - Lab 06

# Student information
- Name: Phạm Gia Phúc
- ID: ITCSIU22178

# Part 1: The Employee Abstract Class

- It is valid to define an abstract class that only contains fully implemented (i.e. not abstract) methods.
And Java still let you create an instance of it and use its implemented methods. For example: [part 1](./part1)
```java
public class AbstractClass {
    private int i;
    public AbstractClass(int i) {
        this.i = i;
    }
    public void display() { // non-abstract method
        System.out.print("Hello world");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClass ab = new AbstractClass(1);
        ab.display();
    }
}
```
- The `work()` method is abstract, because from the Java class hierarchy, there are many types of employee: Executive, 
Software engineer and Software manager which are the subclasses inherited from the super-class Employee. And each type of
employee can have distinct working state. So it make sense that we can make the `work()` method is abstract, preventing
dummy implementation. Therefore, subclasses can `override` the `work()` method
```java
public abstract class Employee {
    public abstract boolean work();
}

public class SoftwareEngineer extends Employee {
    @Override
    public boolean work(boolean state) {
        return state;
    } 
}
```

# Part 2: SoftwareEngineer
- Implement toString. Prefix the result of the Employee's toString with `SoftwareManager`. Can you leverage the `SoftwareEngineer.toString()`?

The answer depends on the way you're implementing the `toString()` method in class `Employee`, `SoftwareEngineer` and `SoftwareManager`. For example:
- Our expected result: 
```shell
Software Manager: Leon Mcdonald ID: 0
```
1. Implementation method 1
```java
public abstract class Employee {
    public String toString() {
        return name + " ID: " + id;
    }
}

public class SoftwareEngineer extends Employee {
    @Override
    public String toString() {
        return "Software Engineer: " + super.toString();
    }
}

public class SoftwareManager extends SoftwareEngineer implements Manager {
    @Override
    public String toString() {
        return "Software Manager: " + super.toString();
    }
}
```
The result: `Software Manager: Software Engineer: Leon Mcdonald ID: 0`
2. Implementation method 2: Way to obtain the expected result
```java
public abstract class Employee {
    public String toString() {
        return name + " ID: " + id;
    }
}

public class SoftwareEngineer extends Employee {
    @Override
    public String toString() {
        return super.toString();
    }
}

public class SoftwareManager extends SoftwareEngineer implements Manager {
    @Override
    public String toString() {
        return "Software Manager: " + super.toString();
    }
}
```
The result: `Software Manager: Leon Mcdonald ID: 0`





