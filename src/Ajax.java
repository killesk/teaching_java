public class Ajax {



    public static void main (String[] args)
    {

        Football object1 = new Football ();
        object1.instance_number = 4;
        Football object2 = new Football ();
        object2.instance_number = 8;

        System.out.println(object1.instance_number);
        System.out.println(object2.instance_number);

    }


}

class Football
{
        static int static_number = 0 ;
        int instance_number = 0;

}