public class TipeDataBukanPrimitif {
    static void main(String[] args) {

        Integer iniinteger = 100;
        Long inilong = 1009999L;

        Byte inibyte;
        inibyte = null;

        System.out.println(inibyte);

        inibyte = 100;
        System.out.println(inibyte);

        int iniint = 100;

        //konversi dari non primitif ke primitif

        Integer iniobject = iniint;

        short inishort = iniobject.shortValue();
        long inilong2 = iniobject.longValue();
        float inifloat = iniobject.floatValue();

        Long amount = 1000000L;

    }
}
