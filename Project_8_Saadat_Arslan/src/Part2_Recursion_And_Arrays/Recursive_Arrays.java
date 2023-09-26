package Part2_Recursion_And_Arrays;

public class Recursive_Arrays {
    public static void main(String[] args) {
        //The array that the methods will operate with
        int[] TheArray = {1, 2, 3, 4, 56, 7, 8, 9, 100, 4, 4, 4, 4};
        print("Traversing an array with recursion:");
        System.out.println(printArray(TheArray, 0));
        System.out.println(" ");
        print("Finding a sum of an array with recursion:");
        System.out.println(arraySum(TheArray, 1));
        System.out.println(" ");
        print("Finding how often the given number appears in the array");
        System.out.println(findCountInArray(TheArray, 4, TheArray.length - 1));
    }

    //Part 2.1 Array printing function
    private static int printArray(int[] array, int i) {
        if (i == array.length - 1)
            return array[i];
        System.out.print(array[i] + " ");
        return
                printArray(array, i + 1);
    }

    //Part 2.2 Sum of array elements
    private static int arraySum(int[] array, int i) {
        if (i == array.length)
            return array[i - 1];
        return array[i - 1] + arraySum(array, i + 1);
    }

    //Part 2.3 Finding how many elements of the array are equal to a given number
    public static int findCountInArray(int[] array, int what, int i) {
        if (i == 0)
            return 0;
        int Count = 0;
        if (array[i] == what)
            Count++;

        return (Count + findCountInArray(array, what, i - 1));
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
