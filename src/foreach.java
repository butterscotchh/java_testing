public class foreach {
    public static void main(String[] args) {

        String[] name = {
                "Akbar", "Abthal", "Gundul",
                "Gondez", "Ganteng"
        };

                for (var i = 0; i < name.length; i++){
                    System.out.println(name[i]);
                }

                System.out.println("FOREACH");


                for(var nilai: name){
                    System.out.println(nilai);
                }
        }
    }
