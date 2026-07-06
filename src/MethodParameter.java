public class MethodParameter {
    public static void main(String[] args) {

        sayHelloWorld2("akbar", "Abthal");
        sayHelloWorld2("akdbar", "Abtghal");
        sayHelloWorld2("akxbar", "Acbthal");

    }
    static void sayHelloWorld2(String firstname,String lastname){
        System.out.println("Hello "+firstname+" "+lastname);

    }
}
