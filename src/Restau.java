import java.util.Scanner;

public class Restau {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] entr�es = { "Salade", "Soupe", "Quiche", "Aucune" };
		String[] plats = { "Poulet", "Boeuf", "Poisson", "V�g�tarien", "Vegan","Aucun" };
		String[] accompagnements = { "Riz","P�tes","Frites","L�gumes","Aucun" };
		String[] boissons = { "Eau plate", "Eau gazeuse", "Soda", "Vin", "Aucune" };

		System.out.println("Bonjour, combien de commandes souhaitez-vous passer");

		if (scan.hasNextInt()) {
			
            int n1= 1;
			int n = scan.nextInt();
			int z = 1;
			while (n > 0 && z <= n) {

				System.out.println("Composez la commande " + n1 + " :" );
				System.out.println("Quelle entr�e d�sirez-vous ?");
				displayMenu(entr�es);
				System.out.println();
				int a = scan.nextInt();
				System.out.println("Quel plat d�sirez-vous ?");
				displayMenu(plats);
				System.out.println();
				int a1 = scan.nextInt();
				System.out.println("Quel accompagnement d�sirez vous ?");
				displayMenu(accompagnements);
				System.out.println();
				int a2 = scan.nextInt();
				System.out.println("Quelle boisson d�sirez vous ?");
				displayMenu(boissons);
				System.out.println();
				int a3 = scan.nextInt();
			
				
				
				
				
				System.out.println("La commande " + n1 + " comprend : " 
				+ checkmenu(entr�es[a - 1]) + " " + checkmenu(plats[a1-1]) + " " 
				+ checkmenu(accompagnements[a2-1]) + " " + checkmenu(boissons[a3-1] ));
			
				System.out.println();
				z++;
				n1++;
				
			}
			scan.close();
		}

		else
			System.out.println("Veuillez saisir le nombre de commandes que vous souhaitez passer");
	      

	}
	
	//m�thode pour v�rifier si un plat a �t� s�lectionn� :
    
	public static String checkmenu (String check) {
		if (check.equalsIgnoreCase("Aucun") || check.equalsIgnoreCase("Aucune")) {
			return "";
		}
		return check;
	}
	
	//m�thode pour afficher le menu :
	
	public static void displayMenu(String[] menu) {

		for (int i = 0; i < menu.length; i++) {

			System.out.print(i + 1 + ">" + menu[i] + "  ");
		}

	}
}
