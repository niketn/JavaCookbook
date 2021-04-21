## A java program to create a Point class models 2D point at (x,y). It contains the following members:
- 2 private instance variables x and y, which maintain the location of the point.
- Constructors , getters and setters.
- A method setXY(), which sets the x and y of the point; and a method getXY(), which returns the x and y in a 2-element int array.
- A toString(), which returns “(x,y)”.
- 3 versions of overloaded distance();
   1. Distance (int x, int y) returns the distance from this instance to the given point at (x,y).
   2. Distance (Point another) returns the distance from this instance to the given Point instance.
   3. Distance() returns the distance from this instance to (0,0).
- Create a array of  Point objects and perform binary search on a particular field.(on x coordinate)

# Java is an Object-Oriented Language. As a language that has the Object-Oriented feature Java supports the following fundamental concepts −
- Polymorphism
- Inheritance
- Encapsulation
- Abstraction
- Classes
- Objects
- Instance
- Method
- Message Parsing

## Classes and Objects:
- Object − Objects have states and behaviours. Example: A dog has states - colour, name, breed as well as behaviours – wagging the tail, barking, eating. An object is an instance of a class.
- Class − A class can be defined as a template/blueprint that describes the behaviour/state that the object of its type support.
Objects in Java: If we consider the real-world, we can find many objects around us, cars, dogs, humans, etc. All these objects have a state and behaviour. If we consider a dog, then its state is - name, breed, colour, and the behaviour are - barking, wagging the tail, running. If you compare the software object with a real-world object, they have very similar characteristics. Software objects also have a state and behaviour. A software object's state is stored in fields and behaviour is shown via methods. So in software development, methods operate on the internal state of an object and the object-to-object communication is done via methods.

### Classes in Java
A class is a blueprint from which individual objects are created. A class can contain any of the following variable types.
- Local variables − Variables defined inside methods, constructors or blocks are called local variables. The variable will be declared and initialized within the method and the variable will be destroyed when the method has completed.
- Instance variables − Instance variables are variables within a class but outside any method. These variables are initialized when the class is instantiated. Instance variables can be accessed from inside any method, constructor or blocks of that particular class.
- Class variables − Class variables are variables declared within a class, outside any method, with the static keyword.

### A class can have any number of methods to access the value of various kinds of methods.
#### Constructors: When discussing about classes, one of the most important sub topic would be constructors. Every class has a constructor. If we do not explicitly write a constructor for a class, the Java compiler builds a default constructor for that class.
Each time a new object is created, at least one constructor will be invoked. The main rule of constructors is that they should have the same name as the class. A class can have more than one constructor.

### Creating an Object
As mentioned previously, a class provides the blueprints for objects. So basically, an object is created from a class. In Java, the new keyword is used to create new objects.
There are three steps when creating an object from a class −
- Declaration − A variable declaration with a variable name with an object type.
- Instantiation − The 'new' keyword is used to create the object.
- Initialization − The 'new' keyword is followed by a call to a constructor. This call initializes the new object.
