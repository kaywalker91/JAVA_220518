package study0518;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Study145_FileWriter 
{
    public static void main(String[] args) throws IOException 
    {
        FileWriter fw = new FileWriter("sample.txt", true);
//        FileWrite�� �ι�° �Ķ����(append)�� true�� �����ϸ� ������ ������ �ʱ�ȭ ���� �ʰ� �̾ ��������
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("������ �Է��ϼ���:");
        String line = sc.nextLine();
        
        fw.write(String.format("%s\n", line));
//        �� �� ���Ŀ� �ԷµǴ� ������ �����ϱ� ���� �Է��� ����ڿ� �ٹٲ� ���ڸ� �����Ͽ���.
        
        fw.close();
    }
}
