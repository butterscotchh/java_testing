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
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = ("wow anda lulus");
            case "B", "C" -> ucapan = ("Nilai anda lumayan");
            case "D" ->ucapan = ("anda tidak lulus");
            default -> {
                ucapan = ("anda salah jurusan");
            }
        }

        System.out.println(ucapan);

        ucapan = switch (nilai) {
            case "A":
                yield "wow anda lulus";
            case "B", "C":
                yield "Nilai anda lumayan";
            case "D":
                yield "anda tidak lulus";
            default : {
                yield "anda salah jurusan";
            }
        };

        System.out.println(ucapan);
    }
}
