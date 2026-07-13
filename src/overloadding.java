public class overloadding {
    public static void main(String[] args) {

        sayhello();
        sayhello(  "akbar");
        sayhello( "akbar", "abthal");

    }

    static void sayhello() {
        System.out.println("sayhello");
    }

    static void sayhello(String name) {
        System.out.println("sayhello "  + name);
    }

    static void sayhello(String firstname, String lastname) {
        System.out.println("sayhello "  + firstname + " " + lastname);
    }
}
