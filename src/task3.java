import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("write value of a:");
            double a = sc.nextDouble();
            System.out.print("write value of b:");
            double b = sc.nextDouble();

            if (a > b) {
                System.out.println("please write correct way");
                continue;
            }
            while (true) {
                System.out.print("write value of c:");
                double c = sc.nextDouble();

                if (a <= c && c <= b) {
                    double result = c * c * c;
                    System.out.println(result);
                } else {
                    System.out.println("c value must be between " + a + " and " + b);
                    continue;
                }
                break;
            }
            break;
        }
        sc.close();
    }
}

//•	a – b araliginda her hansi bir c ededinin kubunu hesablayin.

