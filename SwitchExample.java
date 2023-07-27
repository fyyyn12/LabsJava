import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        // Contoh penggunaan switch
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih pilihan 1");
                break;
            case 2:
                System.out.println("Anda memilih pilihan 2");
                break;
            case 3:
                System.out.println("Anda memilih pilihan 3");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
