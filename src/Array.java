public class Array {
    static void main(String[] args) {

        String[] stringarray;
        stringarray = new String[3];

        stringarray[0] = "Abthal";
        stringarray[1] = "Gondez";
        stringarray[2] = "Akbar";

        System.out.println(stringarray[0]);
        System.out.println(stringarray[1]);
        System.out.println(stringarray[2]);

        stringarray[0] = "Gundul";

        System.out.println(stringarray[0]);

        String[] namaNama = {
                "akbar", "gondez", "abthal"
        };

        int[] array;
        array = new int[]{
                78, 90, 34, 25, 34
        };

        System.out.println(array[4]);
        System.out.println(namaNama[2]);

        namaNama[2] = "bronx";
        namaNama[2] = "gundul";
        System.out.println(namaNama[2]);

        System.out.println(array.length);

    }
}
