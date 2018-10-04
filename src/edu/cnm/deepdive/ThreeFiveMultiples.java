package edu.cnm.deepdive;

public class ThreeFiveMultiples {

  public static long multiple(long n) {
    long sum = 0;
    for (int i = 3; i < n; i++) {
      if (i % 3 == 0 || i % 5 == 0) sum += i;
    }
      return sum;
  }

  public static void main(String[] args) {
    System.out.println(multiple(1000));
  }

}
