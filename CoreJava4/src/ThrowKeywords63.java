class NavinException extends Exception{

    public NavinException(String string) {
        super(string);
    }
}
public class ThrowKeywords63{
    public static void main(String[] args) {
        int i =20;
        int j =0;

        try
        {
            j=18/i;
            if (j==0)
                throw new NavinException(" cannot print 0 ");
        }
        catch (NavinException e){
            j=18/i;
            System.out.println("default output" + e);
        }
        catch (Exception e){
            System.out.println("error" + e);
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}
