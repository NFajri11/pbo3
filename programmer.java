public class programmer extends pegawai {
    private double bonus ;
    //setter
    public void setbonus(double bonus){
        this.bonus = bonus;
    }
    // getter
    public double getbonus(double bonus) {
        return this.bonus;
    }
    public void cetakInfo() {
        System.out.println("bonus : " + this.bonus);
    }
    public void cetakbonus(){
        System.out.println("bonus : " + this.bonus);
    }
}
