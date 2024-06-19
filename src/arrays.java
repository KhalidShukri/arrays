import java.util.Arrays;
import java.util.List;

public class arrays {
    public static void main(String[] args) {
//        Arrays
//        Declaring and Initializing  arrays
//        it is a collction of lments of the sam data type stored in a contiguous memory locations
//        Arrays are objects that store  multiple values of the sam type
//        to declar an array you must specify the data type of the elements and th elmnts(size) tth array can hold
//        syntax for declaring an array
//        datatype[] arrayname; preffered
////        or
////        datatype arrayname[]; alternative
//        After declaring you must create an instance using the 'new' operator and specify the size
//         arrayname = new datatype[size]

//        You can declare and initialize an array in a singl line
//        datatype[] arrayname = new datatype[size];
//            Declaration
        int[] numbers;
//        initializing with size 5
        numbers = new int[5];

//        declaration and intializing in single statement
        int[] score = new int[10];

//        You can also initialize an array with explicit values using the following syntax;
//        datatype [] arrayname = {value1,value2,value3};
        char[] vowels = {'a','e','i','o','u'};
//        System.out.println(vowels[0]);
        int[] nums = {1,2,3,4,5,6,7,8,9};

//        Multidimensional Arrays
//        These arrays of arrays. a 2-d array is like a matrix with rows and columns
//        to declare an array you need to specify the number of dimensions
//        syntax
//        datatype[][]arrayname;
//        You can initialize a 2-d array in several ways;
//        3rows,4 columns
        int [][] matrix = new int[3][4];
        int [][] myNums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//        you can excess elemnts of a 2-d array using two indices;one for the row and the othr one for the column
//        Assigns 10 the first elemet (row 0,column o)
        matrix[0][0] = 10;
//        access element at row 1 , column 2
        int value = myNums[1][2];
//        prints 6
        System.out.println(value);

//        Array manipulation
//        provides several useful methods and operations for manipulating their elements and performing common tasks. Here are some examples

//        1.Accessing Elements
//        You can access individual elements of an array using their index
        int[] newNums = {10,20,30,40,50};
//        accessing first element
        int firstNum = newNums[0];
//        accessing third element
        int thirdnum = newNums[2];
        System.out.println(firstNum);
        System.out.println(thirdnum);

//        2.Modifying elements
//        you can modify array element by assigning new value to the corresponding indx
//        change the third element to 35
        newNums[2] = 35;
        System.out.println(newNums[2]);
//        3.Getting length of an item
//        you can find th numbr of elements in an array using the 'length' property
        int arrayLength = newNums.length;
        System.out.println(arrayLength);
//        4.iterate over arrays
//        you can use loops
        for (int i =0;i<newNums.length;i++) {
            System.out.println(newNums[i]);

        }
///       5.sorting arrays
//        The arrays class in java provides a sort() method in java to  sort out the elements in an array in ascending or descending order
        int[] unsortednumbers = {5,2,9,1,7};
        Arrays.sort(unsortednumbers);


        for (int i = 0;i<unsortednumbers.length;i++) {
            System.out.println(unsortednumbers[i]);

        }
//        6.Searching Arrays
//        The arrays class also provides a binarysearch() methpod to search for a spcific element in a sorted array
        int[] sortedNums = {1,3,5,7,9};
        int index = Arrays.binarySearch(sortedNums,5);
        System.out.println("The index of element 5 is: "+index);

//        7.copying Arrays
//        You can create a copy of an array using the Arrays.copyOf() or Arrays.copyOfRange()
        int [] originalArray = {10,20,30,40,50};
//        Create a complete copy of an array
        int[] copyoforiginalaarray = Arrays.copyOf(originalArray,originalArray.length);
        for (int i = 0;i<copyoforiginalaarray.length;i++) {
            System.out.println(copyoforiginalaarray[i]);

        }

        int [] subSet = Arrays.copyOfRange(originalArray,1,5);
        for (int i = 0;i<subSet.length;i++) {
            System.out.println(subSet[i]);

        }
//        8.Filling Arrays
//        The Arrays.fill() method is used to fill an array with a specific vakue
        int[] filledarray = new int[5];
        Arrays.fill(filledarray,10);
        for (int i = 0;i<filledarray.length;i++) {
            System.out.println(filledarray[i]);

        }

//        9.Comparing Arrays
//        the Arrays.equals() method can be used to check if two arrays are equal i.e. hava the sam elements in the same order
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        int[] array3 = {3,2,1};

        boolean areequal1 = Arrays.equals(array1,array2);
        boolean areequal2 = Arrays.equals(array1,array3);
        System.out.println(areequal1);
        System.out.println(areequal2);
//        10.Converting Arrays to strings
//        The Arrays.toString() method can be used to convert an array to a string representation
        int[] intnum = {10,20,30};
        String arrayString = Arrays.toString(intnum);
        System.out.println(arrayString);

//        Write a a java  program  that creates a 2-d array of integers  and prints the sum of all elements
        int [][] integers = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int m =0;
        for (int x=0;x<integers.length;x++) {
            for(int y = 0;y<integers[x].length;y++) {
                m += integers[x][y];



            }




        }
        System.out.println("The sum of the two dimensional array= "+m);
    }


}
