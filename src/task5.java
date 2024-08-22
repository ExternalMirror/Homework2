import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter first number: ");
        int num1 = Math.abs(sc.nextInt());
        System.out.print("Please Enter second number: ");
        int num2 = Math.abs(sc.nextInt());
        int min = Math.min(num1, num2);
        int max = Math.max(num1,num2);
        int EBOB = 1;
        int EKOB = num1*num2;

        for (int i=1; i<=min; i++){
            if(num1 % i ==0 && num2 % i == 0){
                EBOB = i;
            }
        }
        for (int i=max; i<=num1*num2;i++){
            if(i % num1 == 0 && i % num2 == 0){
                EKOB = i;
                break;
            }
        }
        System.out.println("EBOB is "+EBOB+" EKOB is "+ EKOB);
        sc.close();
    }
}
// EKOB * EBOB = num1 * num2 -----> EKOB = (num1*num2)/EBOB
//•	Klaviaturadan daxil edilmish 2 ededin EBOB-unu ve EKOB-unu tapan proqram tertib edin.

/*
Əgər a və b ədədlərinin 1-dən başqa heç bir ortaq bölənləri yoxdursa, ƏBOB(a, b)=1. Bu ədədlər qarşılıqlı sadə ədədlər adlanır [1].

ƏKOB(a, b): Qarşılıqlı sadə ədədlər üçün ƏKOB(a, b) = a * b olur, çünki ən kiçik ortaq bölünən həmin ədədlərdən başqa heç nəyə bölünmür [2].
 */