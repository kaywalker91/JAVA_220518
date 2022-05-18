package study0518;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Study145_FileWriter 
{
    public static void main(String[] args) throws IOException 
    {
        FileWriter fw = new FileWriter("sample.txt", true);
//        FileWrite의 두번째 파라미터(append)에 true를 전달하면 파일의 내용이 초기화 되지 않고 이어서 쓰여진다
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("문장을 입력하세요:");
        String line = sc.nextLine();
        
        fw.write(String.format("%s\n", line));
//        이 때 이후에 입력되는 문장들과 구분하기 위해 입력한 문장뒤에 줄바꿈 문자를 삽입하였다.
        
        fw.close();
    }
}
