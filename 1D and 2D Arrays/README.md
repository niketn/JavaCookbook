## This folder contains 5 java programs with respect to arrays and its operations

1. A program that reads in 11 unique numbers, if the number is already existing display it and don’t store it in the array. (Filename: unique.java)
2. A program to reverse the contents of an array.(Filename: Reverse.java)
3. A program to write a method that returns the gcd of an unspecified number of integers.(Filename: unspecified.java) The method header is as follows.  [ public static int gcd(int…numbers ]
4. A program to write a method that doubles the size of a double array with following header. [ public static double[] doublecapacity(double [] list) ] (Filename: dousize.java)
5. A program to compute the product of two matrices. (Filename: matrix.java)

### The general form of a one-dimensional array declaration is
type var-name[];
OR
type[] var-name;

- An array declaration has two components: the type and the name. type declares the element type of the array. The element type determines the data type of each element that comprises the array. Like array of int type, we can also create an array of other primitive data types like char, float, double..etc or user defined data type(objects of a class).Thus, the element type for the array determines what type of data the array will hold.

- Example:
// both are valid declarations
int intArray[]; or int[] intArray; 

- byte byteArray[];
- short shortsArray[];
- boolean booleanArray[];
- long longArray[];
- float floatArray[];
- double doubleArray[];
- char charArray[];

### Instantiating an Array in Java
When an array us declared, only a reference of array is created. To actually create or give memory to array, you create an array like this: The general form of new as it applies to one-dimensional arrays appears as follows:
- var-name = new type [size];
Here, type specifies the type of data being allocated, size specifies the number of elements in the array, and var-name is the name of array variable that is linked to the array. That is, to use new to allocate an array, you must specify the type and number of elements to allocate.
- Example:
int intArray[];    //declaring array
intArray = new int[20]; (allocating memory to array) OR int[] intArray = new int[20]; (combining both statements in one)

-Note :
1. The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), or null (for reference types).Refer Default array values in Java
2. Obtaining an array is a two-step process. First, you must declare a variable of the desired array type. Second, you must allocate the memory that will hold the array, using new, and assign it to the array variable. Thus, in Java all arrays are dynamically allocated.

### Array Literal
In a situation, where the size of the array and variables of array are already known, array literals can be used.
- int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; //Declaring array literal
- The length of this array determines the length of the created array.
- There is no need to write the new int[] part in the latest versions of Java

### Multidimensional Arrays
Multidimensional arrays are arrays of arrays with each element of the array holding the reference of other array. These are also known as Jagged Arrays. A multidimensional array is created by appending one set of square brackets ([]) per dimension. 

-Examples:
class multiDimensional
{
    public static void main(String args[])
    {
        // declaring and initializing 2D array
        int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };
 
        // printing 2D array
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(arr[i][j] + " ");
 
            System.out.println();
        }
    }
}

- int[][] intArray = new int[10][20]; (a 2D array or matrix)
- int[][][] intArray = new int[10][20][10]; (a 3D array)

#### Passing Arrays to Methods
Like variables, we can also pass arrays to methods.For example, below program pass array to method sum for calculating sum of array's values.
##### Java program to demonstrate passing of array to method
 
class Test
{   
    // Driver method
    public static void main(String args[]) 
    {
        int arr[] = {3, 1, 2, 5, 4};
         
        // passing array to method m1
        sum(arr);
     
    }
 
    public static void sum(int[] arr) 
    {
        // getting sum of array values
        int sum = 0;
         
        for (int i = 0; i < arr.length; i++)
            sum+=arr[i];
         
        System.out.println("sum of array values : " + sum);
    }
}

##### Returning Arrays from Methods
As usual, a method can also return an array. For example, below program returns an array from method m1.
// Java program to demonstrate return of array from method
 
class Test
{   
    // Driver method
    public static void main(String args[]) 
    {
        int arr[] = m1();
         
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
     
    }
 
    public static int[] m1() 
    {
        // returning  array
        return new int[]{1,2,3};
    }
}


