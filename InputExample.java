import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();
        System.out.println("Halo, " + nama + "! Selamat datang di program ini.");
    }
}
