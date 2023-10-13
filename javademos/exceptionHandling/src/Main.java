public class Main {
    public static void main(String[] args) {
        try {
            int[] sayilar = new int[] {1,2,3};
            System.out.println(sayilar[5]);
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("Hata oluştu");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Hata oluştu");
        } catch (Exception exception) {
            System.out.println("Loglandı");
        } finally {
            System.out.println("Program çalıştı");
        }
    }
}