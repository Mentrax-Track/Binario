import java.util.Scanner;
public class BinarioNatural
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n, p=1, r, b=0;
		System.out.println("Introduca un número Binario: ");
		@SuppressWarnings("resource")
		Scanner en = new Scanner(System.in);
		n=en.nextInt();
		while (n>0)
		{
			r=n%2;
			b=b+r*p;
			p=p*10;
			n=n/2;
		}
		System.out.print(b);
	}

}
