import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        String name;
        double salary = 0, value, total;
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        salary = sc.nextDouble();
        value = sc.nextDouble();
        total = salary + value * 0.15;
        System.out.printf("TOTAL = R$ %.2f\n", total);

    }

}
