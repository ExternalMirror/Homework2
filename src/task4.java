import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter value of num: ");
            double num = sc.nextDouble();
            boolean type = true;
            if (num < 0 || num == 1 || num == 0) {
                System.out.println("Prime and non-prime number can't be negative, 0 or 1");
            }
            if (num % 1 == 0) {
                for (int i = 2; i <= num / 2; i++) {  //added num/2 afterward, it took so much time for some reason
                    if (num % i == 0) {
                        System.out.println("This is non-prime number");
                        type = true;
                        break;
                    }
                }
                if (!type) {
                    System.out.println("This is prime number");
                }
            }else{
                System.out.println("Please write real number");
            }
            sc.close();

    }
}
//prime-sade ; non-prime-murekkeb
//•	Klaviaturadan daxil edilmish ededin sade , yoxsa murekkeb eded olmasini mueyyenleshdiren proqram tertib edin.
