import org.omg.PortableInterceptor.INACTIVE;

public class Casting{
    public static void main(String[] args){
        double d = 35.25;
        System.out.println("double d => "+d);
        
        double dd = 35.99;
        System.out.println("double dd => "+dd);

        //casting double d into int
        int i = (int) d;
        System.out.println("int i = (int) d ===> "+i);

        int ii = (int) dd;
        System.out.println("int ii = (int) dd ==> "+ii);

        System.out.println("=========================");

        i = 35;
        float f = i;
        System.out.println("int i=35; float f=i ==>"+f);

    }
}