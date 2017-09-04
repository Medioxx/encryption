package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

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

}
