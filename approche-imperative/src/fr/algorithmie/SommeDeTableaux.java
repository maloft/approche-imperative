package algorithmie;

/**
 * 
 * @author Mohamed Amine
 * Dans cette classe, on crée un tableau qui contient la somme de deux autres tableaux de même taille. 
 *
 */

public class SommeDeTableaux {

	public static void main(String[] args) {
		
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
		
		int taille = array1.length;
		
		int[] SumArray = new int[taille];
		
		for (int i = 0 ; i < taille ; i++)
		{
			SumArray[i] = array1[i] + array2[i];	
		}
		
		
		//Affichage du contenu du tableau SumArray
		System.out.println("Affichage du contenu de SumArray :");
		for (int i=0; i < taille; i++ )
		{
			System.out.print(SumArray[i] + " ; ");
		}
		System.out.print("\n");

	}

}
