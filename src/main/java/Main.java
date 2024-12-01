import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the side: ");
    double side = input.nextDouble();
    double numerator = 6 * Math.pow(side, 2);
    double denominator = 4 * Math.tan(Math.PI / 6);
    double area = numerator / denominator;
    System.out.printf("The area of the hexagon is %.2f\n", area);
  }
}
 