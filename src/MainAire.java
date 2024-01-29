public class MainAire {
    public static void main(String[] args) {
        AireAcondicionado Aire1 = new AireAcondicionado("MAX5871", 15, 15,31);

        Aire1.subirTemp();
        Aire1.bajarTemp();
        Aire1.bajarTemp();

        System.out.println(Aire1);
    }


}
