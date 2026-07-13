public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(factorialloop(2));
        System.out.println(factorialRec(2));
    }

    static int factorialloop(int value) {
        var result = 1;

        for (int i = 1; i <= value; i++) {
            result *= i;
        }

        return result;
    }

    static int factorialRec(int value) {
        if (value == 1) {
            return 1;
        } else  {
            return value * factorialRec(value - 1); // kalau -1nya di hapus error stack overflow
        }
    }
}
