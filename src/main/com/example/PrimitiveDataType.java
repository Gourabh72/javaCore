package src.main.com.example;

public class PrimitiveDataType {


    public static void main(String[] args) {
        byte b; //-128 to 127 value allow -2^8 to 2^8-1
        short s;//-2^16 to 2^16-1
        int i;//-2^32 to 2^32-1
        long l;
        double d;
        char ch;
        boolean bool;
        b= (byte) 128;
        System.out.println(b);//-128 due to exceed the size
        l=12345678901L;
        System.out.println(l);
        d=1234567890.0;
        System.out.println(d);
        ch='a';//
        System.out.println(ch);
        bool=true;//false
        System.out.println(bool);
    }

}
