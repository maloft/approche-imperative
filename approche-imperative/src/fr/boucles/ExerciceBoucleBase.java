package fr.boucles;
/** 
 * diginamic
 * exercice
 * @author amine
 * othmane 70
 *
 */
public class ExerciceBoucleBase {

	public static void main(String[] args) {
		
		
		//Affichage de tous les nombres de 1 � 10 : 
		System.out.println("Affichage de tous les nombres de 1 � 10 : ");
		
		for (int i=1 ; i <= 10 ; i++)
		{
			System.out.println(i);
		}
		
		//Affichage 20 fois du nom et du pr�nom : 
		System.out.println("Affichage 20 fois du nom et du pr�nom : ");
		
		for (int i=1 ; i <= 20 ; i++)
		{
			if (i == 1) 
			{
				System.out.println("1er fois");
				System.out.println("Nom : EL GNAOUI");
				System.out.println("Pr�nom : Mohamed Amine");
			}
			else 
			{
				System.out.println(i + "�me fois");
				System.out.println("Nom : EL GNAOUI");
				System.out.println("Pr�nom : Mohamed Amine");
			}
			
		}
		
		//Affichage des �l�ments pairs de 2 � 100 : 
		System.out.println("Affichage des �l�ments pairs de 2 � 100 : ");
		
		
		for (int i=2; i <= 100 ; i++)
		{
			if (i%2 == 0)
			{
				System.out.println(i);
			}
		}
		
		//Affichage des �l�ments impairs de 1 � 99 : 
		System.out.println("Affichage des �l�ments impairs de 1 � 99 : ");
		
		for (int i=1; i < 100 ; i++)
		{
			if (i%2 != 0)
			{
				System.out.println(i);
			}
		}
	}

}
