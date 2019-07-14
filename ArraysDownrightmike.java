/*************************************************************************
  *  Compilation:  javac ArraysDownrightmike.java
  *  Author: Downrightmike
  *  Date: 2/28/2019
  *************************************************************************
  *************************************************************************/
  import java.util.Scanner;

public class ArraysDownrightmike{
        // keyboard is a global variable because it is above main. Notice the static label also. 
        private static Scanner keyboard = new Scanner(System.in);
        public static void main(String[] args) {
        // 1. Declares an array of 10 ints
        int theArray [] = new int [10];
        // 2. Declares an int to hold the index of the largest array element
        int largest = 100;
        int largestIndex = 00;
        // 3. Declares an int to hold the index of the smallest array element
        int smallest = 100;
        int smallestIndex = 0;
        // 4. Declares an int to hold the sum of the array elements
        int sum = 500;
        // 5. Declares a double to hold the value of the average of the array elements
        double average = 50.0;
        // 6. Defines a method that assigns a random value from 1 to 300 to each array element
        int min = 1;
        int max = 300;
        getRandom(theArray, min, max);
        System.out.println("Before the sorting:");
        System.out.println("********************************************************************************");
        System.out.println("Array Elements");
        System.out.println("********************************************************************************");
        printArray(theArray);
        System.out.println();
        //Load the variables before the sort
        largest = largestValue(theArray, largest);
        largestIndex = largestIndexFinder(theArray, largest);
        smallest = smallestValue(theArray, smallest);
        smallestIndex = smallestIndexFinder(theArray, smallest);
        sum = sumArray(theArray, sum);
        average = averageArray(sum);
        //------------------------------------------------------
        sortArray(theArray);
        System.out.println("After the sorting:");
        System.out.println("********************************************************************************");
        System.out.println("Array Elements");
        System.out.println("********************************************************************************");
        printArray(theArray);
        System.out.println();
        System.out.println("********************************************************************************");
        System.out.println("Results of Array Processing");
        System.out.println("********************************************************************************");
        printValues(smallest, smallestIndex, largest, largestIndex, sum, average);
            }//end main
        
        // 6. Defines a method that assigns a random value from 1 to 300 to each array element
        public static void getRandom(int[] theArray, int min, int max){
        int range = min + max -1;
            for (int r = 0; r < theArray.length; r++){
                    theArray[r]  = (int)(Math.random() * range) + min;
                    }
            }//end of get random method

        // 7. Defines a method that displays all the elements in the array
        public static void printArray(int[] theArray){
            for (int r = 0; r < theArray.length; r++){
                       System.out.print(" " + theArray[r] + " ");
                    }
        }//end of printArray

        // 8. Defines a method that sorts the array using the insertion technique (the textbook provides sample code for this)
        //Based off of listing 23.1
        public static void sortArray(int[] theArray){
            insertSort(theArray);
        }//end of sortArray

        public static void insertSort(int[] list){
            for(int i =1; i < list.length; i++){
                int currentElement = list[i];
                int k;
                for(k = i - 1; k >= 0 && list[k] > currentElement; k--){
                    list[k + 1] = list[k];
                }//end of 2nd for
                list[k + 1] = currentElement;
            }//end of 1st for
        }//end insertSort

        // 9. Defines a method that identifies and returns the index of the highest value in the array
        public static int largestIndexFinder(int[] theArray, int largest){  
            largest = 1;  
            int index = 0;
            for(int i = 0; i < theArray.length ; i++){
                if(theArray[i] > largest){largest = theArray[i]; index = i;}
            }
            return index;
        }//end L I 
        
        public static int largestValue(int[] theArray, int largest){
            //System.out.println("largest " + largest);
            largest = 99;
            int index = 0;
            for(int i = 0; i < theArray.length ; i++){
                if(theArray[i] > largest){largest = theArray[i]; index = i;}                 
            }
            return largest;  
        }//end of largestValue 

        // 10. Defines a method that identifies and returns the index of the lowest value in the array
        public static int smallestIndexFinder(int[] theArray, int smallest){     
            smallest = 300;  
            int index = 0;
            for(int i = 0; i < theArray.length ; i++){
                if(theArray[i] < smallest){smallest = theArray[i];index = i;}
            }
            return index; 
        }//end of smallestValue 

        public static int smallestValue(int[] theArray, int smallest){     
            smallest = 300;  
            int index = 0;
            for(int i = 0; i < theArray.length ; i++){
                if(theArray[i] < smallest){smallest = theArray[i]; index = i;}
            }
            return smallest; 
        }//end of smallestValue 

        // 11. Defines a method that calculates the sum of the array elements
        public static int sumArray(int[] theArray, int sum){                
            for(int i = 0; i < theArray.length; i++){
                sum = sum + theArray[i];
            }
            return sum;
        }//end sumArray

        // 12. Defines a method that calculates the average of the array elements
        public static double averageArray(int sum){           
            double average = sum / 10.0; 
            return average;
        }//end averageArray

        // 13. Defines a method that displays the results calculated by the methods described in items 5 through 8.
        public static void printValues(int smallest, int smallestIndex, int largest, int largestIndex, int sum, double average){
            System.out.println("The index of the highest value is " + largestIndex + ". Its value is  " + largest + ".");
            System.out.println("The index of the lowest value is " + smallestIndex + ". Its value is  " + smallest + ".");
            System.out.println("The sum of the array elements is " + sum + ".");
            System.out.println("The average of the array elements is " + average + ".");
            
        }//end printValues
            
    }//end class
