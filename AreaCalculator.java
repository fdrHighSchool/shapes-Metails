class AreaCalculator{
  public static void main(String[] args) {
      squareAreaCalculator(6);
      System.out.println();
      circleAreaCalculator(6);
      System.out.println();
      triangleAreaCalculator(16,15);
      System.out.println();
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

}//end class
