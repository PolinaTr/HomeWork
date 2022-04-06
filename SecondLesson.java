/**
 * Java 1. Homework 2
 *
 * @author Polina Trusova
 *
 * @version 6.04.2022
 */
class SecondLesson {

    public static void main(String[] args) {
        System.out.println(sumInLimit(10, 10));
        System.out.println(valInConsole(-1));
        System.out.println(vozvtatLogExpr(-1));
        repitString("list", 4);
    }

    static boolean sumInLimit(int a, int b) {
        return (a + b > 10) & (a + b <= 20);
    }

    static String valInConsole(int x) {
        return x >= 0 ? "Positive" : "Negative";
    }

    static boolean vozvtatLogExpr(int p) {
        return p >= 0;
    }

    static void repitString(String a, int b) {
        for (int c = 0; c < b; c++) {
            System.out.println(a);
        }
    }     
}