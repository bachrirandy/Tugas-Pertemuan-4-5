import java.util.Scanner;

public class PoinBuku {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah buku yang dibeli bulan ini: ");
        int jumlahBuku = scanner.nextInt();

        int jumlahPoin = 0;
        if (jumlahBuku >= 0 && jumlahBuku < 2) {
            jumlahPoin = 0;
        } else if (jumlahBuku >= 2 && jumlahBuku < 4) {
            jumlahPoin = 5;
        } else if (jumlahBuku >= 4 && jumlahBuku < 6) {
            jumlahPoin = 15;
        } else if (jumlahBuku >= 6 && jumlahBuku < 8) {
            jumlahPoin = 30;
        } else if (jumlahBuku >= 8) {
            jumlahPoin = 60;
        }

        System.out.println("Jumlah poin yang diberikan: " + jumlahPoin);

        scanner.close();
    }
}
