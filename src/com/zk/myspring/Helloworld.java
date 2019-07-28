package com.zk.myspring;

public class Helloworld {
	public String message;
	public void setMessage(String message)
	{
		this.message=message;
	}
	
	public void getMessage()
	{
		System.out.println("Your Message:"+message);
	}
}
