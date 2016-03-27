package www.cput.ac.za;

/**
 * Created by Adeebo on 2016/03/27.
 */
public class SingleRP {

    public static String getMake(){

        return "Toyota";
    }

    public static String getPart(){

        return "Shocks";
    }

    public static int getPartNumber(){

        return 123;
    }

    public static String getPartLocation(){

        return "Section 2, Holder 5";
    }

    public static void main (String []args)
    {
        System.out.printf("Make: %s\nPart: %s\nPart Number: %d\nPart Location: %s",getMake(),getPart(),getPartNumber(),getPartLocation());
    }

}
