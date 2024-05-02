import java.util.ArrayList;

public class Test 
{
    public static void main(String[] args) 
    {

    }

    public static int getAsciiCode (char letter) 
    {
        return (int)letter;
    }

    public static char getLetterWithAsciiCode (int code) 
    {
        return (char)code;
    }

    public static String concaList (ArrayList<?> list) 
    {
        StringBuilder result = new StringBuilder();

        for (Object element : list) {
            result.append(element);
        }
        return result.toString();
    }

}
