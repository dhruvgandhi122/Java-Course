import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedRead {
    public static void main(String[] args) throws IOException {
        //InputStreamReader in =new InputStreamReader(System.in);
        //BufferedReader bf = new BufferedReader(in);
        //we can write the above lines in a short way
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the content to be read : ");
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close();
    }
    
}
