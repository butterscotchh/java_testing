public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] values = {80,80,50,80,80};
        SayCoongrats("akbar",values);
        SayCoongrats("akbar", 80,80,50,80,80);
    }

    static void SayCoongrats(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("selamat " + name + ", Anda lulus");
        } else {
            System.out.println("maaf " + name + ", tidak lulus");
        }
    }
}
