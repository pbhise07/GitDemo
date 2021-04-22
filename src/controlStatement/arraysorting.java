package controlStatement;

public class arraysorting {
public static void main(String[] args) {
	int temp;
	int[] arr = {10,5,9,12,14,29};
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				temp =arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
}
	System.out.println("Ascending order is");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(""+arr[i]);
	}
}
}