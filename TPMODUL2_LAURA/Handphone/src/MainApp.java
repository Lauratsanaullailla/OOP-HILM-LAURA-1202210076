public class MainApp {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Adata",2,1.80f);
        perangkat.informasi();

        System.out.println("");

        Laptop laptop = new Laptop("Seagate",8,2.40f,true);
        laptop.informasi();
        laptop.bukaGame("Feeding Frenzy");
        laptop.kirimEmail("jeonwonwoo@gmail.com");
        laptop.kirimEmail("kimmingyu@gmail.com", "leejihoon@gmail.com");

        System.out.println("");

        Handphone handphone = new Handphone("Sandisk",3,2.20f, false);
        handphone.informasi();
        handphone.telfon(628122122);
        handphone.kirimSMS(62852112);
        handphone.kirimSMS(628121212, 629292211);

    }
}
