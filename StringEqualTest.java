public class StringEqualTest
{
    public static void main(String[] args)
    {
        String str1="�ڹ�";
        String str2="�ڹ�";

        System.out.println(str1==str2);
        System.out.println(str1==args[0]);
        System.out.println(str1.intern()==args[0].intern());
    }
}
