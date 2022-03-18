import java.util.Scanner;

public class Restau {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] entrées = { "Salade", "Soupe", "Quiche", "Aucune" };
		String[] plats = { "Poulet", "Boeuf", "Poisson", "Végétarien", "Vegan","Aucun" };
		String[] accompagnements = { "Riz","Pâtes","Frites","Légumes","Aucun" };
		String[] boissons = { "Eau plate", "Eau gazeuse", "Soda", "Vin", "Aucune" };

		System.out.println("Bonjour, combien de commandes souhaitez-vous passer");

		if (scan.hasNextInt()) {
			
            int n1= 1;
			int n = scan.nextInt();
			int z = 1;
			while (n > 0 && z <= n) {

				System.out.println("Composez la commande " + n1 + " :" );
				System.out.println("Quelle entrée désirez-vous ?");
				displayMenu(entrées);
				System.out.println();
				int a = scan.nextInt();
				System.out.println("Quel plat désirez-vous ?");
				displayMenu(plats);
				System.out.println();
				int a1 = scan.nextInt();
				System.out.println("Quel accompagnement désirez vous ?");
				displayMenu(accompagnements);
				System.out.println();
				int a2 = scan.nextInt();
				System.out.println("Quelle boisson désirez vous ?");
				displayMenu(boissons);
				System.out.println();
				int a3 = scan.nextInt();
			
				
				
				
				
				System.out.println("La commande " + n1 + " comprend : " 
				+ checkmenu(entrées[a - 1]) + " " + checkmenu(plats[a1-1]) + " " 
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
	
	//méthode pour vérifier si un plat a été sélectionné :
    
	public static String checkmenu (String check) {
		if (check.equalsIgnoreCase("Aucun") || check.equalsIgnoreCase("Aucune")) {
			return "";
		}
		return check;
	}
	
	//méthode pour afficher le menu :
	
	public static void displayMenu(String[] menu) {

		for (int i = 0; i < menu.length; i++) {

			System.out.print(i + 1 + ">" + menu[i] + "  ");
		}

	}
}
