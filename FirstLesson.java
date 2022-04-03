class FirstLesson {
  public static void main(String[] args) {
    printThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();
  }

  public static void printThreeWords() {
    System.out.print("Orange \n" +
        "Banana \n" +
        "Apple\n");
  }

  public static void checkSumSign() {
    int a = -1, b = 0;
    if (a + b >= 0) {
      System.out.print("The sum is positive \n");
    } else {
      System.out.print("The sum is negative \n");
    }
  }

  public static void printColor() {
    int val = 101;
    if (val <= 0) {
      System.out.println("Red");
    } else if (val <= 100) {
      System.out.println("Yellow");
    } else {
      System.out.println("Green");
    }
  }

  public static void compareNumbers() {
    int a = 3;
    int b = 3;
    if (a >= b) {
      System.out.println("a >= b");
    } else {
      System.out.println("a < b");
    }
  }
}