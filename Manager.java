public class Manager extends Karyawan {
    
    private double insentif;

    public Manager(String nama, double gajiPokok, Perusahaan perusahaan, double insentif) {

        super(nama, gajiPokok, perusahaan);
        this.insentif = insentif;
    }

    @Override
    public double hitungGaji() {

        return getGajiPokok() + insentif;
    }
}
    