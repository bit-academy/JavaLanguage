public class UnicodeBlockTest
{
    public static void main(String[] args)
    {
        System.out.println(Character.UnicodeBlock.of(args[0].charAt(0)));
    }
}
