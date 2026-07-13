public class scope {
    public static void main(String[] args) {
        sayhello("akbar");
        sayhello("");
    }

    static void sayhello(String name){
        String hello = "Hello " + name;

        if(!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.print(hello);
    }
}
