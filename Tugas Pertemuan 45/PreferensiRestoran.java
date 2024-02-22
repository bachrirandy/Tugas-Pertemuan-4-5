import java.util.Scanner;

public class PreferensiRestoran {
    public static void main(String[] args) {
        
        String[] restoran = {
            "Joes Gourmet Burgers",
            "Main Street Pizza Company",
            "Corner Cafe",
            "Mamas Fine Italian",
            "The Chefs Kitchen"
        };

        boolean[][] preferensiMakanan = {
            {false, false, false},
            {true, false, true},
            {true, true, true},
            {true, false, false},
            {true, true, true}
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Apakah ada yang vegetarian? (ya/tidak): ");
        String vegetarian = scanner.nextLine().toLowerCase();
        System.out.print("Apakah ada yang vegan? (ya/tidak): ");
        String vegan = scanner.nextLine().toLowerCase();
        System.out.print("Apakah ada yang bebas gluten? (ya/tidak): ");
        String glutenFree = scanner.nextLine().toLowerCase();

        System.out.println("Berikut adalah pilihan restoran Anda:");
        boolean anyRestaurantAvailable = false;
        for (int i = 0; i < restoran.length; i++) {
            if ((vegetarian.equals("ya") && preferensiMakanan[i][0]) || 
                (vegan.equals("ya") && preferensiMakanan[i][1]) || 
                (glutenFree.equals("ya") && preferensiMakanan[i][2])) {
                System.out.println(restoran[i]);
                anyRestaurantAvailable = true;
            }
        }
        
        if (!anyRestaurantAvailable) {
            System.out.println("Tidak ada restoran yang sesuai dengan preferensi makanan Anda.");
        }
        scanner.close();
    }
}
