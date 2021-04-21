##  These two programs will demostrate you exception handling and wise usage of package implementation with java

1. Write a Java application that will be able to add, subtract, multiply, divide, compare, convert to floating point, reduce to floating point, reduce to lowest terms, and 
absolute value for rational numbers. Your program should solve operations efficiently and be able to recover from bad inputs. Use exception handling mechanism so as not to crash the program. Create your own exception to handle the situation incase the number of Rational Number Objects count exceeds 50. (Filename: operations)

2. Create a package of Data structures: include data structure classes from Expt 1. Add two more Data structures i.e MinHeap and MaxHeap. Use the Heaps to sort an array of integers. (Filename:)

# PACKAGES IN JAVA
A java package is a group of similar types of classes, interfaces and sub-packages. Package in java can be categorized in two form, built-in package and user-defined package. There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.

## Advantage of Java Package
1. Java package is used to categorize the classes and interfaces so that they can be easily maintained.
2. Java package provides access protection.
3. Java package removes naming collision.

![image](https://user-images.githubusercontent.com/26967135/115543443-fd2cf500-a2be-11eb-845a-17a00d767ccf.png)

The package keyword is used to create a package in java.
### How to compile java package
If you are not using any IDE, you need to follow the syntax given below:

javac -d directory javafilename 

- For example
   javac -d . Simple.java
   
      The -d switch specifies the destination where to put the generated class file. You can use any directory name like /home (in case of Linux), d:/abc (in case of windows) etc. 
      If you want to keep the package within the same directory, you can use . (dot).

### How to run java package program
You need to use fully qualified name e.g. mypack.Simple etc to run the class.
- To Compile: javac -d . Simple.java
- To Run: java mypack.Simple

The -d is a switch that tells the compiler where to put the class file i.e. it represents destination. 
The . represents the current folder.

### How to access package from another package?
There are three ways to access the package from outside the package.
1. import package.*;
2. import package.classname;
3. fully qualified name.
#### Using packagename.*
     If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages. The import keyword is used to make the classes and interface of another package accessible to the current package.
#### Using packagename.classname
     If you import package.classname then only declared class of this package will be accessible.
#### Using fully qualified name
     If you use fully qualified name then only declared class of this package will be accessible. Now there is no need to import. But you need to use fully qualified name every time when you are accessing the class or interface. It is generally used when two packages have same class name e.g. java.util and java.sql packages contain Date class.

![image](https://user-images.githubusercontent.com/26967135/115544249-fb176600-a2bf-11eb-8241-56fa1fa62373.png)

# EXCEPTION HANDLING IN JAVA
The exception handling in java is one of the powerful mechanism to handle the runtime errors so  that normal flow of the application can be maintained. In java, exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime. Exception Handling is a mechanism to handle runtime errors such as ClassNotFound, IO, SQL, Remote etc. The core advantage of exception handling is to maintain the normal flow of the application. Exception normally disrupts the normal flow of the application that is why we use exception handling.

![image](https://user-images.githubusercontent.com/26967135/115544391-269a5080-a2c0-11eb-826f-dd576b4f550f.png)

## Types of Exception
There are mainly two types of exceptions: checked and unchecked where error is considered as unchecked exception. The sun microsystem says there are three types of exceptions:

1. Checked Exception: The classes that extend Throwable class except RuntimeException and Error are known as checked exceptions e.g.IOException, SQLException etc. Checked 
exceptions are checked at compile-time.

2. Unchecked Exception: The classes that extend RuntimeException are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, 
ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at compile-time rather they are checked at runtime.

3. Error: Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.

### Java try-catch
Java try block is used to enclose the code that might throw an exception. It must be used within the method. Java try block must be followed by either catch or finally block.
               try{ 
               //code that may throw exception 
               }catch(Exception_class_Name ref){} 

### Java finally block
Java finally block is a block that is used to execute important code such as closing connection, stream etc. Java finally block is always executed whether exception is handled or not. Java finally block follows try or catch block.

### Java throw keyword
The Java throw keyword is used to explicitly throw an exception. We can throw either checked or uncheked exception in java by throw keyword. The throw keyword is mainly used to throw custom exception.

An exception is first thrown from the top of the stack and if it is not caught, it drops down the call stack to the previous method,If not caught there, the exception again drops down to the previous method, and so on until they are caught or until they reach the very bottom of the call stack.This is called exception propagation.

### Java throws keyword
The Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception so it is better for the programmer to provide the exception handling code so that normal flow can be maintained. Exception Handling is mainly used to handle the checked exceptions. If there occurs any unchecked exception such as NullPointerException, it is programmers fault that he is not performing check up before the code being used.

![image](https://user-images.githubusercontent.com/26967135/115544839-b6d89580-a2c0-11eb-9e7e-b7ad4c490138.png)





