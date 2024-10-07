public class TryCatch62 {
    public static void main(String[] args) {
        int i =2;
        int j =0;

        int nums[] =new int[5];
        String str = null;

        try
        {

            j=18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch (ArithmeticException e){
            System.out.println("something went wrong cannot divide bye zero" + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of bound");
        }
        catch (Exception e){
            System.out.println("error" + e);
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}
