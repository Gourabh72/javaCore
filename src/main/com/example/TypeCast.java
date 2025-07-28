package src.main.com.example;

public class TypeCast {
    //2 types of type cast
    //Explicit and Implicit
    //Explicit- external will type cast it
    //Implicit- Inernal will type cast it
    public static void main(String[] args) {
        //Implicit type cast
        char ch='a';
        int i=ch;
        System.out.println(ch+" "+i);//a 97(ASCII value)

        //Explicit type cast
        double d=100.123;
        int j=(int)d;
        System.out.println(d+" "+j);
    }
}
