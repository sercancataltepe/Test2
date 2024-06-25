public class Main {
    public static void main(String[] args) {
        String [] diller = {"Java", "Python", "C#"};
        int [] seviyeler = {1,2,3,4,5};
        System.out.println(diller[1] + " " + seviyeler[3]);
        System.out.println(diller[0] + " " + seviyeler [4]);
        System.out.println(diller[2] + " " + seviyeler [1]);

        int a = 85;
        int b = 45;
        int carpim = a * b;
        System.out.println("Sayıların Çarpımı : " + carpim);

        int toplam = a + b;
        System.out.println("Sayıların Toplamı : " + toplam);

        System.out.println(a == b);
        System.out.println(a != b);

        if(a * b > 3000 && a * b < 5000) {
            System.out.println("Sayıların Çarpımı : " + carpim);
        }

    }
}
