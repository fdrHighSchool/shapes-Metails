import java.lang.Math;
class AreaCalculator{
  public static void main(String[] args) {
      squareAreaCalculator(6);
      System.out.println();
      circleAreaCalculator(6);
      System.out.println();
      triangleAreaCalculator(16,15);
      System.out.println();
      heronsFormula(9,11,16);
      }//end main class

      public static void squareAreaCalculator(double length){
        double areaSquare = length * length;
        System.out.print("This is the area of a Square: " +areaSquare);
      }//end square area calculator method

      public static void circleAreaCalculator(double radius){
        double areaCircle = Math.PI * radius * radius;
        System.out.print("This is the area of a circle: " +areaCircle);
      }//end circle area calculator method

      public static void triangleAreaCalculator(double base,double height){
       double areaTriangle = base * height / 2;
       System.out.print("This is the area of a triangle: " + areaTriangle);
      }//end area triangle calculator method

      public static void heronsFormula(double length1, double length2, double length3){
        double s = (length1+length2+length3)/2;
        double area = Math.sqrt(s*(s-length1)*(s-length2)*(s-length3));
        System.out.println("The area of triangle using the heron's formula is: " + area);
      }//end the herone's method

}//end class
