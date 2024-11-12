import java.util.Random;


public class Lab6 {

	
	
	public static void main(String args[])
	{	
		
		
		double g[][] = {{0,1,2},{1,0,3},{2,3,0}};
		
		
		double g2[][] = {{0,1,2,3,0},{1,0,3,6,5},{2,6,0,4,1},{3,0,4,0,2},{0,5,1,2,0}};
		
		
		
		
		double mst[][] = MST.PrimsMST(g);
		
		double mst2[][] = MST.PrimsMST(g2);
		
		//PrintArray(mst);
		
		//PrintArray(mst2);
		
		double totalTime = 0.0;
		
		
		for (int j = 1; j < 6; ++j)
		{
			
		
		
		for (int i = 0; i < 10; ++i)
		{
			Random random = new Random();
			
			
			long start = System.currentTimeMillis();
			// Code to measure
			
			MST.PrimsMST(RandomArray(j * 100));
			
			
			long end = System.currentTimeMillis();
			long elapsedTime = end - start;
			System.out.println("Elapsed time in milliseconds: " + elapsedTime + "\n" + "Size of array is " + j * 100 + "\n");
			
			totalTime += elapsedTime;
		}

			
			System.out.println("The average time for an array of size " + j * 100 + " is " + totalTime/10);
			
		totalTime = 0;
		
		}
		
		
		
	}
	
	public static double[][] RandomArray(int n)
	{
		
		Random random = new Random();
		
		double g[][] = new double[n][n];
		
		for(int i = 0; i < g.length; ++i)
		{
			for(int j = 0; j < g.length; ++j)
			{
				g[i][j] = random.nextInt(100);
			}
		}
		
		
		return g;
		
		
	}
	
	public static void PrintArray(double g[][])
	{
		
		System.out.print("[");
		
		
		for (int j = 0; j < g.length; ++j)
			{
				
			
		
			
			for(int i = 0; i < g[j].length; ++i)
			{
				
				
				System.out.print(g[j][i]);
				
				if (i < g[j].length - 1)
				{
				System.out.print(", ");
				}
				
				
				
				
			}
			
			
			if(j < g.length - 1)
			{
				System.out.println();
			}
			
		}
		
		
		System.out.print("]");
		System.out.println();
		
		
		
		
	}

}
