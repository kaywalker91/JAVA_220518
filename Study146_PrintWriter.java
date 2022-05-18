package study0518;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class  Study146_PrintWriter 
{
    public static void main(String[] args) throws IOException 
    {
        PrintWriter pw = new PrintWriter(new FileWriter("sample.txt", true));
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("문장을 입력하세요:");
        String line = sc.nextLine();
        
        pw.println(line);
        pw.close();
    }
}
