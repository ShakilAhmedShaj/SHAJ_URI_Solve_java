
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int productNo1, productNo2, quantity1, quantity2;
        float amount1, amount2, sumAmount1, sumAmount2, total;

        Scanner sc = new Scanner(System.in);

        productNo1 = sc.nextInt();
        quantity1 = sc.nextInt();
        amount1 = sc.nextFloat();
        productNo2 = sc.nextInt();
        quantity2 = sc.nextInt();
        amount2 = sc.nextFloat();

        sumAmount1 = quantity1 * amount1;
        sumAmount2 = quantity2 * amount2;
        total = sumAmount1 + sumAmount2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

    }

}
