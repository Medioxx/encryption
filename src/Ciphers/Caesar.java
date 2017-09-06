package Ciphers;

public class Caesar {
	private StringBuilder messageToCode;
	private int distance;
	
	public Caesar(String message,int dist) 
	{
		this.messageToCode= new StringBuilder(message);
		this.distance= dist;
	}
	
	public String code() 
	{
		int c;
		for(int i=0;i<this.messageToCode.length();i++) 
		{
			c=(int)this.messageToCode.charAt(i);
			if(c+this.distance>122) 
			{
				c=32+(this.distance-(122-c));
			}else 
			{
				c+=this.distance;
			}
			this.messageToCode.setCharAt(i, (char)c);
		}
		return this.messageToCode.toString();
	}
	

}
