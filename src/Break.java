public class Break {
    public static void main(String[] args) {

        var counter = 1;
        while(true){
            System.out.println("Nilai" + counter);
            counter++;

            if(counter > 10){
                break;
            }
        }

        System.out.println("Nilai berhenti");
    }
}
