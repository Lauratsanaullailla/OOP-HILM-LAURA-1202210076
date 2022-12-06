public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;

    }
    public void informasi(){
        System.out.println("Trasnportasi Air jenis Sampan dengab kursi berjumlah "+ jumlahKursi+" ditetapkan dengan biaya sebesar Rp."+biaya);
    }
    public void berlayar(){
        System.out.println("Trasnportasi Air jenis Sampan sedang berlayar menggunakan"+layar+" layar");
    }
    public void berlayar(int jangkar){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai"+jangkar+" jangkar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai menggunakan"+layar+"layar");
    }
}
