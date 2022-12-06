public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportasiAir =  new TransportasiAir(4, 20000);
        transportasiAir.informasi();
        transportasiAir.berlayar();
        transportasiAir.berlabuh();

        System.out.println("");;
        
        Sampan sampan = new Sampan(20, 5000, 0);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();

        System.out.println("");

        Kapal kapal = new Kapal(50, 10000, null);
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar();
        kapal.berlabuh();
    }
}
