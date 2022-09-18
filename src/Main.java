import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[10];

        System.out.println("Заполните строки:");

        for (int i = 0; i < str.length; i++)
        {
            System.out.println("Строчка " + (i+1) + ": ");
            str[i] = scanner.next();
        }
        
        Arrays.sort(str);

        for (int i = 0; i < str.length; i++)
        {
            System.out.println("Строчка " + (i+1) + ": "+ str[i]);
        }
    }
}