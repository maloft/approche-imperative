package algorithmie;

/**
 * 
 * @author Mohamed Amine
 * 
 * Dans cette classe : 
 * 				- On affiche le contenu d'un tableau
 * 				- On affiche le contenu d'un tableau dans le sens inverse
 * 				- On copie le contenu d'un tableau dans un nouveau tableau
 *
 */


public class AffichageInverse {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int taille = array.length;
		
		//Affichage du contenu du tableau array
		System.out.println("Affichage du contenu de array :");
		for (int i=0; i < taille; i++ )
		{
			System.out.print(array[i] + " ; ");
		}
		System.out.print("\n");
		
		
		//Affichage du contenu de array dans l'ordre inverse
		System.out.println("Affichage du contenu de array dans le sens inverse :");
		for (int i = taille - 1 ; i >= 0 ; i-- )
		{
			System.out.print(array[i] + " ; "); 
		
		}
		System.out.print("\n");
		
		
		//Copier les éléments de array dans arrayCopy
		
		
		int[] arrayCopy = new int[taille];
		
		for (int i=0; i < taille; i++ )
		{
			arrayCopy[i] = array[i];
		}
		
		//Affichage du contenu de arrayCopy 
		System.out.println("Affichage du contenu de arrayCopy :");
		for (int i=0; i < taille; i++ )
		{
			System.out.print(arrayCopy[i] + " ; ");
		}
		
	}

}
