public class SwitchStatement {

    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("wow anda lulus");
                break;
            case "B":
            case "C":
                System.out.println("nilai anda lumayan");
            case "D":
                System.out.println("anda tidak lulus");
                break;
            default:
                System.out.println("anda salah jurusan");
        }

        switch (nilai) {
            case "A" -> System.out.println("wow anda lulus");
            case "B", "C" -> System.out.println("Nilai anda lumayan");
            case "D" -> System.out.println("anda tidak lulus");
            default -> System.out.println("anda salah jurusan");
        }

    }
}
