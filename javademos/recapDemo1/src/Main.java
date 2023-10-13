public class Main {
    public static void main(String[] args) {
        int sayi1 = 256;
        int sayi2 = 756;
        int sayi3 = 456;

        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }

        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }

        System.out.println("En büyük sayı: "+ enBuyuk);
    }
}