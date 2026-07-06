public class MethodReturnValue {
    public static void main(String[] args) {

        var result1 = sum(100, 100);
        System.out.println(result1);

        System.out.println(sum(200, 200));

        System.out.println(hitung(300, operase "+", 300));
        System.out.println(hitung(400, operase "-", 400));
    }


    static int sum(int a, int b){
        var total = a + b;
        return total;
    }

    static int hitung (int a, String operase , int b){
        switch (operase){
            case "+" : return a + b;
            case "-" : return a - b;
            default : return 0;
        }
    }
}
