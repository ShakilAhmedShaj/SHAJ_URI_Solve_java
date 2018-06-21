import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int hour = scanner.nextInt();
        double amountPerHour=scanner.nextDouble();
        double payableAmount=amountPerHour * hour ;
        System.out.println("NUMBER = "+no);
        System.out.printf("SALARY = U$ "+"%.2f\n",payableAmount);

    }

}