package algorithmie;

/**
 * 
 * @author Mohamed Amine
 * Dans cette classe, on crée un tableau qui contient la somme de deux autres tableaux de tailles differentes. 
 *
 */
public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
		
		int taille1 = array1.length;
		int taille2 = array2.length;
		
		int taille = Math.max(taille1, taille2);
		
		int[] SumArrayDiff = new int[taille];
		
		for (int i = 0 ; i < Math.min(taille1, taille2) ; i++) // Somme des éléments des 2 tableaux tant 
															   // qu'on n'a pas atteint la taille limite
			                                                   // de l'un d'entre eux. 
		{
			SumArrayDiff[i] = array1[i] + array2[i];
		}
		
		for (int i = Math.min(taille1, taille2) ; i < taille ; i++) // Pour la partie restante, on ajoute
																	// le contenu du plus grand tableau.
		{
			if (taille1 < taille2)
			{
				SumArrayDiff[i] = array2[i];
			}
			else
			{
				SumArrayDiff[i] = array1[i];
			}
		}
		
		
		//Affichage du contenu du tableau SumArray
		System.out.println("Affichage du contenu de SumArrayDiff :");
		for (int i=0; i < taille; i++ )
		{
			System.out.print(SumArrayDiff[i] + " ; ");
		}
		System.out.print("\n");

	}

}
