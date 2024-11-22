import java.util.*;
public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            String nama = input13.nextLine();
            System.out.print("Masukkan baris: ");
            int baris = input13.nextInt();
            System.out.print("Masukkan kolom: ");
            int kolom = input13.nextInt();
            input13.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            String next = input13.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        input13.close();
    }
}
