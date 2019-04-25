public class Practice
{
    public static void main(String[] args)
    {
        Practice newObject = new Practice();
        Boom football_1 = new Boom();
        Boom football_2 = new Boom();
        Boom football_3 = new Boom();
        Booms fasd 0 new Boom,
        football_1.instance_number = 10;
        football_2.instance_number = 14;
        football_3.instance_number = 22;
        newObject.printFootball(football_1);
        newObject.printFootball(football_2);
        newObject.printFootball(football_3);
    }

    private void printFootball(Boom boom)
    {
        System.out.println(boom.instance_number);
        System.out.println(boom.STATIC_NUMBER);
    }
}

class Boom
{
    int instance_number = 0;
    static int STATIC_NUMBER = 5;
}