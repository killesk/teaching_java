public class Example
{

    private String fiddy;

    public Example(String variable)
    {
            this.fiddy = variable;
    }

    public static void main (String[] vokuhila)
    {
        Example object1 = new Example( "bob");
        Example object2 = new Example("ferry");

        object1.sayhello();
        object2.sayhello();

        object1.fiddy = "Menno";
        object2.fiddy = "list";

        object1.sayhello();
        object2.sayhello();
    }

    public void sayhello()
    {
        System.out.println(fiddy);

    }
}
