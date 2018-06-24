import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[5];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < array1.length) {
            System.out.println("Enter element: " + (i + 1) + ":");
            array1[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Element in array 1: ", "");
        for (int a = 0; a < array1.length; a++) {
            System.out.print(array1[a] + "\t\n");
        }
        int j = 0;
        while (j < array2.length) {
            System.out.println("Enter element: " + (j + 1) + ":");
            array2[j] = scanner.nextInt();
            j++;
        }
        System.out.printf("%-20s%s", "Element in array 2: ", "");
        for (int a = 0; a < array2.length; a++) {
            System.out.print(array2[a] + "\t\n");
        }
        int[]array3;
        array3 = new int[array1.length + array2.length];
        for (int a = 0; a < array1.length; a++) {
            array3[a] = array1[a];
        }
        for (int a = 0; a < array2.length; a++) {
            array3[a + array1.length] = array2[a];
        }
        System.out.printf("%-20s%s", "Element in array 3: ", "");
        for (int a = 0; a < array3.length; a++) {
            System.out.print(array3[a] + "\t");
        }
    }
}