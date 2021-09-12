package pro;

import java.io.FileOutputStream;
import java.io.IOException;

public class test {
	public static void main(String[] args){
		try(FileOutputStream fos = new FileOutputStream("a.txt", true)){
		
			char ch = 'A';
			byte[] a = new byte[26];
			for(int i=0; i<26; i++) {
				a[i] = (byte)ch;
				ch++;
			}
			fos.write(a);
		}catch(IOException e)	{
			e.printStackTrace(); 
	} 
	}
	
}
