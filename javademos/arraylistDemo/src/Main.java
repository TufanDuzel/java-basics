import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");

        //System.out.println(sayilar);
        //System.out.println(sayilar.get(2));

        sayilar.set(0,100);
        //System.out.println(sayilar);

        sayilar.remove(0);
        //System.out.println(sayilar);

        //sayilar.clear();
    }
}