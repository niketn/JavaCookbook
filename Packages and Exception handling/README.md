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
   The -d switch specifies the destination where to put the generated class file. You can use any directory name like /home (in case of Linux), d:/abc (in case of windows) etc.    If you want to keep the package within the same directory, you can use . (dot).

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
     If you use fully qualified name then only declared class of this package will be accessible. Now there is no need to import. But you need to use fully qualified name every time when you are
