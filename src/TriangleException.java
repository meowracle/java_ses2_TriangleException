import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
         /*   try {*/
                Scanner scanner = new Scanner(System.in);
                System.out.println("nhap vao do lon canh thu nhat: ");
                double angle1 = scanner.nextDouble();
                System.out.println("nhap vao do lon canh thu hai: ");
                double angle2 = scanner.nextDouble();
                System.out.println("nhap vao do lon canh thu ba: ");
                double angle3 = scanner.nextDouble();
                TriangleException a = new TriangleException();
                a.CheckTriangle(angle1, angle2, angle3);

           /* }
            catch (Exception e){
                System.out.println("");
            }*/
    }
    public void CheckTriangle(double angle1, double angle2, double angle3){
        if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
            throw new ArithmeticException("Triangle's angle must be positive");
        } else if (angle1 + angle2 <= angle3 || angle2 + angle3 <= angle1 || angle1 + angle3 <= angle2 ) {
            throw new ArithmeticException("Sum of 2 angles must larger than the rest");
        }
    }
}
