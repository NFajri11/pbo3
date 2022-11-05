public class pegawai {
    private String nama;
    private double gajipokok;
    //setter
    public void setnama(String nama){
        this.nama = nama;
    }
    public void gajipokok(double gajipokok){
        this.gajipokok = gajipokok;
    }
    // getter
    public String getnama() {
        return this.nama;
    }
    public double getgajipokok(){
        return this.gajipokok;
    }
    public void cetakInfo() {
        System.out.println("Nama        : " + this.nama);
        System.out.println("gajipokok   : " + this.gajipokok);
    }
}