package java6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File f=new File("D://NewFolderTTN");
//	
//		if(!f.exists())
//		f.mkdir();
//		f=new File("D://NewFolderTTN/ttn.txt");
//		if(!f.exists())
//		f.createNewFile();
//		
//		
//		FileWriter fw =new FileWriter(f);
//		fw.write("mohammd"+"\t"+"moha@gmail.com"+"\t"+1234567890+"\n");
//		fw.write("yatin"+"\t"+"yatin@gmail.com"+"\t"+284382338+"\n");
//		fw.write("aamir"+"\t"+"aamir@gmail.com"+"\t"+1234512345+"\n");
//		fw.write("sid"+"\t"+"sid@gmail.com"+"\t"+678967890+"\n");
//		fw.close();
		
		FileReader fr=new FileReader("D://NewFolderTTN/ttn.txt");
		
		BufferedReader br =new BufferedReader(fr);
		String st=null;
		while((st=br.readLine())!=null)
		{
		   String arr[]=st.split("\t");
		   System.out.println(arr[0]);
		}
	}

}
