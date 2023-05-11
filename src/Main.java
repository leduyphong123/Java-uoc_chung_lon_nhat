import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao so thu nhat: ");
        a = input.nextInt();
        System.out.println("nhap vao so thu hai: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.print("No greatest common factor");
        } else {
            while (a != b) {
                if (a > b) a = a - b;
                else b = b - a;
            }
            System.out.print("uoc chung lon nhat la: " + a);
        }
    }
}