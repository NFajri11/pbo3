public class manager extends pegawai {
    private double tunjangan;
    //setter
    public void settunjangan(double tunjangan){
        this.tunjangan = tunjangan;
    }
    // getter
    public double gettunjangan(double tunjangan) {
        return this.tunjangan;
    }
    public void cetakInfo() {
        System.out.println("tunjangan : " + this.tunjangan);
    }
    public void cetaktunjangan() {
        System.out.println("tunjangan : " + this.tunjangan);
    
    }
}
