/**
 * Java 1. Homework 3
 *
 * @author Polina Trusova
 *
 * @version 19.04.2022
 */
 import java.util.Arrays;
 
 class TretiiLesson {
    public static void main (String[] args) {
        replacement();
        hundred ();
        multiplication ();
        squareArray ();
        vozvrat (10, 88);
    }
    static void replacement() {
        int[] a = {1, 1, 0, 0};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] == 1 ? " 0 " : " 1 ");
        }
        System.out.println();
    }
    
    static void hundred () {
        int[] x = new int[100];
        for (int i = 0; i < x.length; i++) {
            x[i] = i + 1;
            System.out.print( x[i] + " , ");
        }
        System.out.println();
    }
    
    static void multiplication () {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print (arr[i] <6 ? arr[i] * 2 + ", " : arr[i] + ", ");
        }
        System.out.println();
    }
    
    static void squareArray () {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(i == j ? "1" : "-");
            }
        }
        System.out.println();
    }
    
    static void vozvrat(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue; 
            System.out.println(Arrays.toString(arr));
        }
    }
}