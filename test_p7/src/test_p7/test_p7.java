package test_p7;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class test_p7 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("�п�J���");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br1.readLine());
		if(num == 1)
		{
			System.out.println("��J���O1");
			System.out.println("��ܪ��O1");
		}
		System.out.println("�����B�z");
	}
}
