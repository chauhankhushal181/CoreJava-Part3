public class HandlingException61 {
    public static void main(String[] args) {
        int i =9;
        int j = 18/i;

        try
        {
            j=18/i;
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }



        System.out.println(j);

        System.out.println("Bye");
    }
}
