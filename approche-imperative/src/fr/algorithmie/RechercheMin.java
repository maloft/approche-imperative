package algorithmie;

/**
 * 
 * @author Mohamed Amine
 * Dans cette classe, on recherche le plus petit élément d'un tableau d'entiers. 
 *
 */
public class RechercheMin {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		int taille = array.length;
		int min = array[0];
		
		for (int i = 0 ; i < taille ; i++)
		{
			if (array[i] < min)
			{
				min = array[i];
			}
		}
		System.out.println("Le plus petit élément de array est : " + min);

	}

}
