import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stockSaatIni = 15;
        String history = "";
        boolean perulangan = true;

        while (perulangan) {
            System.out.println("Stok Tersedia : " + stockSaatIni);
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Stok");
            System.out.println("2. Kurangi Stok");
            System.out.println("3. History Produk");
            System.out.println("4. Keluar");

            System.out.print("Pilih tindakan (1/2/3/4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Tambah Stok
                    System.out.print("Jumlah yang akan ditambahkan: ");
                    int tambahStock = scanner.nextInt();
                    stockSaatIni += tambahStock;
                    history += "==> + stok: " + tambahStock + "\n";
                    System.out.println("Stok berhasil ditambahkan.");
                    break;

                case 2: // Kurangi Stok
                    while (perulangan){
                        System.out.print("Jumlah yang akan dikurangi: ");
                        int kurangiStock = scanner.nextInt();
                        if (kurangiStock <= stockSaatIni) {
                            stockSaatIni -= kurangiStock;
                            history += "==> - stok: " + kurangiStock + "\n";
                            System.out.println("Stok berhasil di kurangi.");
                            perulangan = false;
                        } else {
                            System.out.println("Stok tidak cukup!");
                        }
                    }
                    perulangan = true;
                    break;

                case 3: // Lihat History
                    System.out.println("History Produk :\n" + history);
                    break;

                case 4: // Keluar
                    System.out.println("Terima kasih!");
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, 3, 4, atau 5.");
            }
        }
    }
}
