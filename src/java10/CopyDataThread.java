package java10;

//import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDataThread extends Thread{
  private InputStream input;
  private OutputStream output;
  public CopyDataThread(FileInputStream input2, FileOutputStream output2) {
	// TODO Auto-generated constructor stub
	  this.input=input2;
	  this.output=output2;
}

//public void copyDataThread(InputStream input ,OutputStream output)
//  {
//	  this.input=input;
//	  this.output=output;
//  }
  
  public void run() {
	  int count=0;
	  
	  int data;
	  try {
		while((data=input.read())!=-1)
		  {
			output.write(data);
			count++;
			if(count==10)
			{
				System.out.println("10 char are copid");
				count=0;
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		  }
		input.close();
		output.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
