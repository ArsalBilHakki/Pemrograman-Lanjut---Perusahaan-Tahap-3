public class Util {
    public static String formatRupiah(double amount) {
        return String.format("Rp%,.0f", amount).replace(",", ".");
    }
}
