public class pegawaiberaksi {
    public static void main(String[] args){
    // Membuat object
    pegawai fajrPegawai = new pegawai();
    manager fajrManager = new manager ();
    programmer fajrProgrammer = new programmer();

    /*memanggil atribut dan memberi nilai */
    fajrPegawai.setnama("fajri");
    fajrPegawai.gajipokok(5000000);
    fajrManager.settunjangan(4000000);
    fajrProgrammer.setbonus(9000000);
    fajrPegawai.cetakInfo();
    fajrManager.cetakInfo();
    fajrProgrammer.cetakInfo();
    }
}