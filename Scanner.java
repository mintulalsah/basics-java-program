package mintu;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Scanner {
	public static void main(String[] args) {
		System.out.println("enter name");
	//Scanner s=new Scanner();
	InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(i);
		System.out.println(bufferedReader);
	}

}
