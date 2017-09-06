package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class openfile {
	
	
	private String nameOfFile;
	
	
	public openfile(String start)
	{
		this.nameOfFile=start;
	}
	
	
	public String getText()
	{
		File f = new File(this.nameOfFile);
		StringBuilder nAll= new StringBuilder();
		try(BufferedReader in = new BufferedReader(new FileReader(f));)
		{
			String line;
			
			while(( line=in.readLine() )!= null) 
			{
				nAll.append(line).append("\n");
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return nAll.toString();
	}
	
	public void writeText(String message) 
	{
		String nameOfCodedFile;
		String[] temp;
		temp=this.nameOfFile.split("\\.");
		nameOfCodedFile=temp[0]+"-crypted.txt";
		File f = new File(nameOfCodedFile);
		
		try(PrintWriter out =new PrintWriter(new FileWriter(f));)
		{
			f.createNewFile();
			out.println(message);
			
		}catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
	}

}
