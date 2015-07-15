public class StringTest
{
    public static void main(String[] args)
    {
        String str1="JDK ";
        String str2=" 멀린";
        String merlin=str1+1.4+str2;

        System.out.println(merlin);
        System.out.println(merlin.length());
        System.out.println(merlin.charAt(8));
        System.out.println(merlin.substring(0, 8));
        System.out.println(merlin.indexOf("멀린"));
    }
}
