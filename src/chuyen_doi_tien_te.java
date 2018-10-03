import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        double vnd, usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số USD muốn đổi:");
        usd = sc.nextDouble();
        vnd = 23000 * usd;
        System.out.println("Số tiền VND là: " + vnd);
    }
}
