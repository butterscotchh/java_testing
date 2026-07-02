public class IfStatement {
    public static void main(String[] args) {

        var nilai = 75;
        var absen = 90;

        if(nilai >= 85 && absen >= 85){
            System.out.println("Nilai A");
        } else if(nilai >= 80 && absen >= 80) {
            System.out.println("Nilai A-");
        } else if(nilai >= 75 && absen >= 75) {
            System.out.println("Nilai A-");
        } else if(nilai >= 50 && absen >= 50) {
            System.out.println("Nilai C");
        } else if(nilai >= 0 && absen >= 0) {
            System.out.println("Nilai F");
        }

    }
}
