
public class Rekurzija {

	public static void prvaRekurzija(int broj) 
	{
		if (broj == 1)
		{
			System.out.println("Broj je 1");
		}
		else
		{
			System.out.println("Broj je " + broj);
			prvaRekurzija(broj-1);
		}

	}
	public static void main(String[] args) {
		int broj = 4;
		prvaRekurzija(broj);
	}
}
