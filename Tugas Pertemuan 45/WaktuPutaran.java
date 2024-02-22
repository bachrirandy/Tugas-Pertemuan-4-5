import java.util.Scanner;

public class WaktuPutaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berapa kali Anda berlari mengelilingi lintasan balap: ");
        int jumlahPutaran = input.nextInt();

        double waktuTercepat = Double.MAX_VALUE;
        double waktuTerlambat = Double.MIN_VALUE;
        double totalWaktu = 0;

        for (int i = 1; i <= jumlahPutaran; i++) {
            System.out.print("Masukkan waktu putaran ke-" + i + " (dalam detik): ");
            double waktuPutaran = input.nextDouble();

            if (waktuPutaran < waktuTercepat) {
                waktuTercepat = waktuPutaran;
            }
            if (waktuPutaran > waktuTerlambat) {
                waktuTerlambat = waktuPutaran;
            }

            totalWaktu += waktuPutaran;
        }

        double rataRataWaktu = totalWaktu / jumlahPutaran;

        System.out.println("Waktu putaran tercepat: " + waktuTercepat + " detik");
        System.out.println("Waktu putaran paling lambat: " + waktuTerlambat + " detik");
        System.out.println("Waktu putaran rata-rata: " + rataRataWaktu + " detik");

        input.close();
    }
}
