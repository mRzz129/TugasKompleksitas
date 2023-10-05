import java.util.Scanner;

public class TugasMirzaSesi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();
        input.close();

        int hasil = pangkatDua(bilangan);
        System.out.println("Hasil pangkat dua dari " + bilangan + " adalah: " + hasil);
    }

    public static int pangkatDua(int bilangan) {
        int hasil = 1;
        for (int i = 0; i < 2; i++) {
            hasil *= bilangan;
        }
        return hasil;
    }
}