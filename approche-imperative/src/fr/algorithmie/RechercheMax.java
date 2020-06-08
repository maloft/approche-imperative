package algorithmie;

/**
 * 
 * @author Mohamed Amine
 * Dans cette classe, on recherche le plus grand élément d'un tableau d'entiers. 
 *
 */

public class RechercheMax {

	public static void main(String[] args) {
		
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		int taille = array.length;
		int max = 0;
		
		for (int i = 0 ; i < taille ; i++)
		{
			if (array[i] > max)
			{
				max = array[i];
			}
		}
		System.out.println("Le plus grand élément de array est : " + max);
		

	}

}
