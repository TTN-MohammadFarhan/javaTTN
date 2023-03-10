package java10;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			FileInputStream input=new FileInputStream("D://NewFolderTTN/source.txt");
			FileOutputStream output =new FileOutputStream("D://NewFolderTTN/ttn.txt");
			CopyDataThread thread=new CopyDataThread(input,output);
			//opyDataThread t=new CopyDataThread(f);
			thread.start();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
