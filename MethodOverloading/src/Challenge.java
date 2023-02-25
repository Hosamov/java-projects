package MethodOverloading.src;

public class Challenge {
  public static void main(String[] args) {
    System.out.println(convertToCentimeters(6, 0));
  }

  public static double convertToCentimeters(int inches) {
    double inchesToCm = inches * 2.54; //2.54cm in one inch
    return (double) inchesToCm;
  }

  // Get feet and inches, convert feet to inches, pass to first method and
  // return inches to centimeters
  public static double convertToCentimeters(int feet, int inches) {
    int totalInches = ((feet * 12) + inches);
    return convertToCentimeters(totalInches);
  }

}
