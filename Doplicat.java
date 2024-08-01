public class Doplicat
{
    public static void main(String[] args) {

        String[] arr={"flower","flow","flight"};
        String temp=arr[0];
        for (String s : arr) {
            while (s.indexOf(temp) != 0) {
                temp = temp.substring(0, temp.length() - 1);

            }

        }
        String bs="ali";

       String ad= bs.substring(0,3);

        System.out.println( bs.indexOf(ad));

    }
}