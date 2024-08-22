import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("write value of a:");
            int a = sc.nextInt();
            System.out.print("write value of b:");
            int b = sc.nextInt();

            if (a > b) {
                System.out.println("please write correct way");
                continue;
            }
            for (int i = a; i <= b; i++) {
                int cube = i * i * i;
                System.out.println("cube of " + i + " is " + cube);
            }
            break;
        }
        sc.close();
    }
}

//•	a – b araliginda olan ededlerin kublarini hesablayin.
