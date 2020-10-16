import java.lang.Math;
class AreaCalculator{
  public static void main(String[] args) {
      System.out.print("The area of this square is: " + squareAreaCalculator(6));
      System.out.println();
      System.out.print("The area of this circle is: " + circleAreaCalculator(6));
      System.out.println();
      System.out.print("The area of this triangle is: " + triangleAreaCalculator(16,15));
      System.out.println();
      System.out.print("The area of triangle using the heron's formula is: " + heronsFormula(9,11,16));
      }//end main class

      public static double squareAreaCalculator(double length){
        double areaSquare = length * length;
        return areaSquare;
      }//end square area calculator method

      public static double circleAreaCalculator(double radius){
        double areaCircle = Math.PI * radius * radius;
        return areaCircle;
      }//end circle area calculator method

      public static double triangleAreaCalculator(double base,double height){
       double areaTriangle = base * height / 2;
       return areaTriangle;
      }//end area triangle calculator method

      public static double heronsFormula(double length1, double length2, double length3){
        double s = (length1+length2+length3)/2;
        double area = Math.sqrt(s*(s-length1)*(s-length2)*(s-length3));
        return area;
      }//end the herone's method

}//end class
