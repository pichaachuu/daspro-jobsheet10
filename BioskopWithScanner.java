import java.util.*;
public class BioskopWithScanner {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int baris, kolom;
        String nama, next;

        while (true) {

            System.out.println("===TIKET BIOSKOP===");
            System.out.println("---Menu---");
            System.out.println("Menu 1: Input data penonton\nMenu 2: Tampilkan daftar penonton\nMenu 3: Exit");
            System.out.print("Pilihan: ");
            int pilihan = input13.nextInt();
            input13.nextLine();

            if (pilihan == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = input13.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = input13.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = input13.nextInt();
                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 4) {
                        System.out.println("Nomor baris/ kolom tidak tersedia");
                        continue;
                    }
                    input13.nextLine();
                    
                    penonton[baris-1][kolom-1] = nama;
                    if (penonton[baris-1][kolom-1] == null) {
                        System.out.println("Maaf kursi sudah terisi");
                        continue;
                    }
        
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = input13.nextLine();
        
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                
            } else if (pilihan == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.printf("%s \t", (penonton[i][j] != null ? penonton[i][j] : "***"));
                    }
                    System.out.println();
                }
            } else if (pilihan == 3) {
                System.out.println("Keluar dari program");
                break;
            } else {
                System.out.println("Input tidak valid. Silahkan Pilih Angka Yang Sesuai");
                return;
            }
            
        }
        input13.close();
    }
}