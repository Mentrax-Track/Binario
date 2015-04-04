import java.util.Scanner;
public class Nprimos 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner en = new Scanner (System.in);
		int n, m=1, a=0, con, c;
		System.out.print("Intrudusca un número: ");
		n=en.nextInt();
		while(a<n)
		{
			con=1;
			c=0;
			while(con<=m)
			{
				if(m%con==0)
					c++;
				con++;
			}
			if(c<=2)
			{
				System.out.print(m+" ");
				a++;
			}
			m++;
		}
	}

}
