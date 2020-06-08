package algorithmie;


public class AffichageInverse {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int taille = array.length;
		
		//Affichage du contenu du tableau array
		/* for (int i=0; i < taille; i++ )
		{
			System.out.println(array[i]);
		}
		*/
		
		
		//Affichage du contenu de array dans l'ordre inverse
		/*for (int i = taille - 1 ; i >= 0 ; i-- )
		{
			System.out.println(array[i]); 
		
		}
		*/
		
		//Copier les éléments de array dans arrayCopy
		
		int[] arrayCopy = new int[taille];
		
		for (int i=0; i < taille; i++ )
		{
			arrayCopy[i] = array[i];
		}
		
		//Affichage du contenu de arrayCopy 
		for (int i=0; i < taille; i++ )
		{
			System.out.println(arrayCopy[i]);
		}
		
	}

}
