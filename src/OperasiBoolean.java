public class OperasiBoolean {
    public static void main(String[] args) {

        var absen = 70;
        var nilaiakhir = 70;

        var lulusabsen = absen >= 75;
        var lulusNilai = nilaiakhir >= 75;

        var lulus = lulusabsen || lulusNilai;
        System.out.println(lulus);
    }
}
