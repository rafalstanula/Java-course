import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] org = new String[0];

        Scanner sc = new Scanner(System.in);
        String a;
        String [] result;

        do {
            a = sc.nextLine();
            result = addElement(org, a);
        }
        while (!a.isEmpty());

        for(int i = result.length - 1; i>=0; i--){
            System.out.println(result[i]);
        }

    }
    public static String[] addElement (String[]org, String added){
        String[] result = Arrays.copyOf(org, org.length + 1);
        result[org.length] = added;
        return result;
    }
}