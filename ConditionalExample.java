import java.util.Scanner;

public class ConditionalExample {
    public static void main(String[] args) {
        // Contoh penggunaan if-else if statement dan nested if
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai ujian: ");
        int nilai = scanner.nextInt();

        if (nilai >= 90) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 80) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 70) {
            System.out.println("Nilai Anda C");
        } else {
            System.out.println("Nilai Anda D");
        }
    }
}
