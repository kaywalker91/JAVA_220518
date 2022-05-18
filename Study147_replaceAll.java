package study0518;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class  Study147_replaceAll 
{
    public static void main(String[] args) throws IOException 
    {
    	ArrayList<String> data = new ArrayList<>();
        // sample.txt ������ �о ������ �����Ѵ�.
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        
        while(true) 
        {
            String line = br.readLine();
            if (line==null) break;
            data.add(line);
        }
        br.close();

        // �� ������ ������ �ٹٲ� ���ڰ� �������Ƿ� �ٹٲ� ���ڸ� �����Ѵ�.
        
        String text = String.join("\n", data); 

        // python �̶�� �ܾ java�� �����Ѵ�.
        text = text.replaceAll("python", "java");

        // ����� ������ �ٽ� ���Ͽ� ���´�.
        FileWriter fw = new FileWriter("sample.txt");
        fw.write(text);
        fw.close();
    }
}
