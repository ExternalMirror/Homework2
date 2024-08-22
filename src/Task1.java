import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Overall formula of  discriminant is:");
        System.out.println("""
                ax2 + bx + c = 0
                D = b2 – 4ac
                X1,2 = -b +- sqrt(D)/2*a\s
                """);

        while (true) {

            System.out.print("Enter value of a:");
            double a = sc.nextDouble();
            if (a == 0) {
                System.out.println("value of a can't be 0");
                continue;
            }

            System.out.print("Enter value of b:");
            double b = sc.nextDouble();
            System.out.print("Enter value of c:");
            double c = sc.nextDouble();
            System.out.println(a + "x2 + " + b + "x + " + c);
            double D = b * b - 4 * a * c;
            System.out.println("Value of Discriminant is " + D);

            if (D > 0) {
                System.out.println("Discriminant has 2 different real values and these are: ");
                double x1 = -b - Math.sqrt(D) / 2 * a;
                double x2 = -b + Math.sqrt(D) / 2 * a;
                System.out.println("x1 is " + x1 + " and " + "x2 is " + x2);
            } else if (D == 0) {
                System.out.println("Discriminant has 1 value and this is: ");
                double x1 = -b;
                System.out.println("x is " + x1);
            } else {
                System.out.println("Discriminant has no real value");
            }
            //System.out.println("\n");
            //can delete for continuous usage
            break;
        }
        sc.close();
    }
}

/*•	Kvadrat tənliyi hesablayan proqram yazın.Verilenləri klaviaturadan daxil edin ,yeni(Scanner)
ax2+bx+c = 0
D = b2 – 4ac
X1,2 = -b +- sqrt(D)/2*a
*/
