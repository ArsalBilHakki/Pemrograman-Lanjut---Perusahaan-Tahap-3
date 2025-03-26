public class Main {
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan("PT. Jamu Tak Jemu");

        Karyawan karyawan1 = new Karyawan("Siti", 1000000, perusahaan);
        Karyawan karyawan2 = new Karyawan("Wati", 1000000, perusahaan);
        Karyawan karyawan3 = new Karyawan("Kartini", 800000, perusahaan);
        Karyawan karyawan4 = new Karyawan("Sarinah", 750000, perusahaan);
        Karyawan karyawan5 = new Karyawan("Sarinem", 750000, perusahaan);

        Programmer programmer1 = new Programmer("Sopo", 1500000, perusahaan, 500000);
        Programmer programmer2 = new Programmer("Jarwo", 1750000, perusahaan, 750000);

        Manager manager1 = new Manager("Adit", 3500000, perusahaan, 1000000);
        Manager manager2 = new Manager("Denis", 2500000, perusahaan, 1000000);

        karyawan1.info();
        karyawan1.infoGaji();
        System.out.println();
        karyawan2.info();
        karyawan2.infoGaji();
        System.out.println();
        karyawan3.info();
        karyawan3.infoGaji();
        System.out.println();
        karyawan4.info();
        karyawan4.infoGaji();
        System.out.println();
        karyawan5.info();
        karyawan5.infoGaji();
        System.out.println();

        programmer1.info();
        programmer1.infoGaji();
        System.out.println();
        programmer2.info();
        programmer2.infoGaji();
        System.out.println();

        manager1.info();
        manager1.infoGaji();
        System.out.println();
        manager2.info();
        manager2.infoGaji();
        System.out.println();
    }
}
