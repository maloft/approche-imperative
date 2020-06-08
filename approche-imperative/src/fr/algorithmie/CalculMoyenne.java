package algorithmie;

/**
 * 
 * @author Mohamed Amine
 * Dans cette classe, on la moyenne d'un tableau d'entiers. 
 *
 */
public class CalculMoyenne {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		int taille = array.length;
		int somme = 0;
		
		float moyenne;

		for (int i = 0 ; i < taille ; i++)
		{
			somme += array[i];
		}
		
		moyenne = (float) somme / taille;
		
		System.out.println("La moyenne est : " + moyenne);
		

	}

}
