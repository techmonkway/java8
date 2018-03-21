package com.tech.monk.lambda;

public class RunnableLambda 
{
 public static void main(String[] args) throws InterruptedException 
 {
	//Before java 8
	Runnable runnable = new Runnable()
	{

		@Override
		public void run() 
		{
			for(int i=0;i<3;i++)
			{
				System.out.println("Current thread.."+ Thread.currentThread().getName());
			}
		}
	};
	//JAVA 8 : Lambda implementation
	Runnable runnableLambda = () ->
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Current thread.."+ Thread.currentThread().getName());
		}
	};
	Thread t1 = new Thread(runnableLambda);
	t1.start();
	t1.join();
 }
}
