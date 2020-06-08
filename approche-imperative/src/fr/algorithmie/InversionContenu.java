package algorithmie;
/**
 * 
 * @author Mohamed Amine
 * 
 * Dans cette classe : 
 * 				- On copie le contenu d'un tableau dans un nouveau tableau mais dans le sens inverse
 *
 */

public class InversionContenu {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		int taille = array.length;
		
		int[] arrayCopy = new int[taille];
		
		for (int i=0; i < taille; i++ )
		{
			arrayCopy[i] = array[taille - 1 - i];
		}
		
		//Affichage du contenu de arrayCopy
		System.out.println("Affichage du contenu de arrayCopy :");
		
		for (int i=0; i < taille; i++ )
		{
			System.out.print(arrayCopy[i] + " ; ");
		}
		
		System.out.print("\n");
		//Affichage du contenu de array
		System.out.println("Affichage du contenu de array :");
		
		for (int i=0; i < taille; i++ )
		{
			System.out.print(array[i] + " ; ");
		}
		

	}

}
