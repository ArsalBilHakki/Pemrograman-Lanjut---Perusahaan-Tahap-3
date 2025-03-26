public class Karyawan {
    
    private String nama;
    private double gajiPokok;
    private Perusahaan perusahaan;

    public Karyawan(String nama, double gajiPokok, Perusahaan perusahaan) {

        setNama(nama);
        this.gajiPokok = gajiPokok;
        this.perusahaan = perusahaan;
    }

    public String getNama() {

        return nama;
    }

    public void setNama(String nama) {

        if (nama.length() < 4) {
            throw new IllegalArgumentException("Nama karyawan setidaknya terdiri atas 4 karakter.");
        }
        this.nama = nama;
    }

    public double getGajiPokok() {

        return gajiPokok;
    }

    public Perusahaan getPerusahaan() {

        return perusahaan;
    }

    public double hitungGaji() {

        return gajiPokok;
    }

    public void infoGaji() {

        System.out.println("Nama: " + nama + ", Total Gaji: " + Util.formatRupiah(hitungGaji()));
    }

    public void info() {

        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + Util.formatRupiah(gajiPokok));
        System.out.println("Nama Perusahaan: " + perusahaan.getNAMA_PERUSAHAAN());
    }
}
    