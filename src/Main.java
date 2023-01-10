import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Sınır değerini giriniz :");
        n = input.nextInt();

        for (int i=1; i<=n; i*=4) {

            System.out.println(i);
        }
        for (int k=1; k<=n; k*=5) {

            System.out.println(k);
        }
    }
}