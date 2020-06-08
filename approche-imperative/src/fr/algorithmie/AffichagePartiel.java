package algorithmie;

/**
 * 
 * @author Mohamed Amine
 * Dans cette classe : On affiche les entiers qui sont contenus dans un tableau et : 
 * 							- qui sont supérieurs ou égaux à 3.
 * 							- qui sont pairs.
 * 							- dont l'index est pairs.
 * 							- qui sont impairs. 
 *
 */

public class AffichagePartiel {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		int taille = array.length;
		
		//Affichage des entiers supérieurs ou égaux  à 3 :
		System.out.println("Affichage des entiers supérieur ou égal à 3 :");
		for (int i=0; i < taille; i++ )
		{
			if (array[i] >= 3 ) 
			{
				System.out.print(array[i] + " ; ");				
			}

		}
		System.out.print("\n");
		
		//Affichage des entiers pairs :
		System.out.println("Affichage des entiers pairs :");
		for (int i=0; i < taille; i++ )
		{
			if (array[i] >= 0 && array[i] % 2 == 0 ) //La parité est une définition propre aux entiers positifs
			{
				System.out.print(array[i] + " ; ");				
			}

		}
		System.out.print("\n");
		
		//Affichage des entiers dont l'index est pair :
		System.out.println("Affichage des entiers dont l'index est pair:");
		for (int i=0; i < taille; i++ )
		{
			if (i % 2 == 0 ) 
			{
				System.out.print(array[i] + " ; ");				
			}

		}
		System.out.print("\n");
		
		//Affichage des entiers impairs :
		System.out.println("Affichage des entiers impairs :");
		for (int i=0; i < taille; i++ )
		{
			if (array[i] >= 0 && array[i] % 2 == 1) //La parité est une définition propre aux entiers positifs
			{
				System.out.print(array[i] + " ; ");				
			}

		}
		System.out.print("\n");

	}

}
