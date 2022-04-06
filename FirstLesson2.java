/**
 *Java 1. Homework 1
 *
 * @author Polina Trusova
 *
 * @version 5.04.2022
 */
class FirstLesson2 {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.print("Orange \n" + "Banana \n" + "Apple\n");
    }

    static void checkSumSign() {
        int a = 1, b = 0;
        System.out.println(a + b >= 0 ? "The sum is positive" : "The sum is negative");
    }

    static void printColor() {
        int val = 101;
        if (val <= 0) {
            System.out.println("Red");
        } else if (val <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    static void compareNumbers() {
        int a = 0;
        int b = 1;
        System.out.println(a >= b ? "a >= b" : " a < b");
    }
}