import java.util.*;
public class SIAKAD13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa");
        int jumlahMahasiswa = input13.nextInt();
        System.out.println("Masukkan jumlah mata kuliah");
        int jumlahMatkul = input13.nextInt();
        int[][] nilai = new int[jumlahMahasiswa][jumlahMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("\nNilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = input13.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa/3);

        }

        System.out.println("\n===========================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah");

        for (int j = 0; j<3; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < 4; i++){
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul/4);

        }
        input13.close();
    }
}
