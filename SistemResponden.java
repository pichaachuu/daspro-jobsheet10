import java.util.*;

public class SistemResponden {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final int TOTAL_RESPONDEN = 10;
        final int TOTAL_PERTANYAAN = 6;
        
        int[][] responden = new int[TOTAL_RESPONDEN][TOTAL_PERTANYAAN];
        
        double[] rataRataResponden = new double[TOTAL_RESPONDEN];
        double[] rataRataPertanyaan = new double[TOTAL_PERTANYAAN];
        double rataRataKeseluruhan = 0;
        
        for (int i = 0; i < TOTAL_RESPONDEN; i++) {
            System.out.println("Data Responden Ke-" + (i + 1) + ": ");
            double totalResponden = 0;
            
            for (int j = 0; j < TOTAL_PERTANYAAN; j++) {
                System.out.print("Nilai ke-" + (j + 1) + ": ");
                responden[i][j] = input.nextInt();
                totalResponden += responden[i][j];
            }
            
            rataRataResponden[i] = totalResponden / TOTAL_PERTANYAAN;
            System.out.printf("Nilai rata-rata responden ke-%d: %.2f%n", (i + 1), rataRataResponden[i]);
            rataRataKeseluruhan += rataRataResponden[i];
        }
        
        for (int j = 0; j < TOTAL_PERTANYAAN; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < TOTAL_RESPONDEN; i++) {
                totalPertanyaan += responden[i][j];
            }
            rataRataPertanyaan[j] = totalPertanyaan / TOTAL_RESPONDEN;
            System.out.printf("Nilai rata-rata pertanyaan ke-%d: %.2f%n", (j + 1), rataRataPertanyaan[j]);
        }
        
        rataRataKeseluruhan /= TOTAL_RESPONDEN;
        System.out.printf("Rata-rata keseluruhan: %.2f%n", rataRataKeseluruhan);
        
        input.close();
    }
}