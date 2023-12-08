import java.util.Scanner;

public class UsdVnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the usd");
        double usd = scanner.nextDouble();
        double vnd = usd * 23000;
        System.out.println(usd + " usd : \n" + vnd + "vnd");
    }
}
