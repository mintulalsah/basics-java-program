package mintu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bufferreader {
	public static void main(String args[]) throws Exception{
		InputStreamReader obj = new InputStreamReader(System.in);
		BufferedReader is =new  BufferedReader(obj);
		 //String sat =is.readLine();//for string
		int st =Integer.parseInt(is.readLine());//for integer
		 System.out.println(st);
	}

}
