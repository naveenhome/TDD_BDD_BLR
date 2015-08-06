package ca.fresher;

public class Largest {
	public int Find(int arr[])
	{
		int max = 0;
		for(int i=0; i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}

}
