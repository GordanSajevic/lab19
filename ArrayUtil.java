package lab19;

public class ArrayUtil {
	
	/**
	 * Funkcija ispisuje članove niza
	 * @param array
	 */
	
	public static void printArray(int[] array) {
		for (int i=0; i<array.length; i++)
		{
			System.out.print(array[i] + " ");
		}

	}
	
	/**
	 * Funkcija prima dva cijela broja i popunjava niz sa default vrijednošću
	 * @param size
	 * @param defaultValue
	 * @return
	 */
	
	public static int[] getArray(int size, int defaultValue)
	{
		int[] niz = new int[size];
		for (int i=0; i<size; i++)
		{
			niz[i] = defaultValue;
		}
		return niz;
	}
	
	/**
	 * Funkcija prima broj i kreira niz, te traži od korisnika da popuni niz
	 * @param size
	 * @return
	 */
	
	public static int[] getUserArray(int size)
	{
		int[] niz = new int[size];
		for (int i=0; i<size; i++)
		{
			System.out.println("Unesite " + (i+1) + ". član niza: ");
			niz[i] = TextIO.getInt();
		}
		return niz;
	}
	
	/**
	 * Funkcija kopira jedan niz u drugi
	 * @param niz1
	 * @param niz2
	 */
	
	public static void copyArray2(int[] niz1, int[] niz2)
	{
		if (niz1.length < niz2.length)
		{
			niz2 = new int [niz1.length];
			for (int i=0; i<niz1.length; i++)
			{
				niz2[i] = niz1[i];
			}	
		}
		else if (niz1.length > niz2.length)
		{
			niz2 = new int [niz1.length];
			for (int i=0; i<niz1.length; i++)
			{
				niz2[i] = niz1[i];
			}
		}
		else
		{
			for (int i=0; i<niz1.length; i++)
			{
				niz2[i] = niz1[i];
			}
		}	
	}
	
	/**
	 * Funkcija kopira jedan niz u drugi i vraća drugi niz
	 * @param niz1
	 * @param niz2
	 * @return
	 */
	
	public static int[] copyArray(int[] niz1, int[] niz2)
	{
		if (niz1.length < niz2.length)
		{
			int[] niz3 = new int [niz1.length];
			for (int i=0; i<niz1.length; i++)
			{
				niz3[i] = niz1[i];
			}
			return niz3;
		}
		else if (niz1.length > niz2.length)
		{
			int[] niz3 = new int [niz1.length];
			for (int i=0; i<niz1.length; i++)
			{
				niz3[i] = niz1[i];
			}
			return niz3;
		}
		else
		{
			for (int i=0; i<niz1.length; i++)
			{
				niz1[i] = niz2[i];
			}
			return niz2;
		}
		
	}
	
	/**
	 * Funkcija pomjera sve članove niza lijevo
	 * @param niz1
	 */
	
	public static void moveToLeft(int[] niz1)
	{
		for (int i=0; i<niz1.length-1; i++)
		{
			niz1[i] = niz1[i+1];
		}
		niz1[niz1.length-1] = 0;
	}
	
	/**
	 * Funkcija pomjera sve članove niza desno
	 * @param niz1
	 */
	
	public static void moveToRight(int[] niz1)
	{
		for (int i=niz1.length-1; i>0; i--)
		{
			niz1[i] = niz1[i-1];
		}
		niz1[0] = 0;
	}
	
}
