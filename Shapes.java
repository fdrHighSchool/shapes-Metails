import java.lang.Math;
class AreaCalculator{
  public static void main(String[] args) {
      System.out.println("\nThe area of this square is: " + squareAreaCalculator(6));
      System.out.println("\nThe area of this circle is: " + circleAreaCalculator(6));
      System.out.println("\nThe area of this triangle is: " + triangleAreaCalculator(16,15));
      System.out.println("\nThe area of triangle using the heron's formula is: " + heronsFormula(9,11,16));
      System.out.println("\nThe volume of this cube is: " + cubeVolume(6));
      System.out.println("\nThe volume of this triangular prism is: " + triangularPrismVolume(6,8,25));
      System.out.println("\nThe volume of this rectangular prism is: " + rectangularPrismVolume(9,15,24));
      System.out.println("\nThe volume of this sphere is: " + sphereVolume(8));
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

      public static double cubeVolume(double length){
        double volume = Math.pow(length,3);
        return volume;
      }//end cube method

      public static double triangularPrismVolume(double base, double altitude, double height){
        double volume = 0.5 * base * altitude * height;
        return volume;
      }//end triangular prism volume method

      public static double rectangularPrismVolume(double length, double height, double width){
        double volume = length * width * height;
        return volume;
      }//end rectangularprismvolume

      public static double sphereVolume(double radius){
        double volume = 4/3 * Math.sqrt(Math.pow(radius, 3));
        return volume;
      }//end sphervolume method
}//end class
