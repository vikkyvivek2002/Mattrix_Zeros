import java.util.*;
public class Mattrix_Zeros
 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter row and col Size :");
		int n = s.nextInt();
		int m = s.nextInt();
		System.out.println("Enter the values of "+n +" " +m +"matrix");
		int a [][] = new int[n][m];
		int row[] = new int[n];
		int col[] = new int[m];		
		for(int i=0; i<n;i++)
		{
			for(int j =0; j<m; j++)
			{
				a[i][j] = s.nextInt();
				if(a[i][j] == 0)
				{
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		
		
		for(int i =0; i<n; i++)
		{
			if(row[i] == 1)
			{
			  for(int j=0; j<m; j++)
			   {
				  a[i][j] =0;
		       }
		    }
		}
		
		
		for(int j =0; j<m; j++)
		{
			if(col[j] == 1)
			{
			  for(int i=0; i<n; i++)
			   {
				  a[i][j] =0;
		       }
		    }
		}
		
		for(int i =0; i<n; i++)
		{
			for(int j =0;j<m; j++ )
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
