public class Gitproject
{
	public static void main(String[] args)
	{
		Thread[] threads = new Thread[1000];
		for(int i = 0; i< threads.length; i++)
		{
			threads[i] = new Thread();
		}
		for(int i = 0; i< threads.length; i++)
				{
					threads[i].start();
				}
	}


class MyThread extends Thread{
	public void run()
	{
		int temp = 0;
		for(int i = 0; i< 1_000_000; i++)
		{
			temp += i;
		}
	}

}
}