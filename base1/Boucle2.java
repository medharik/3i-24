package base1;

import java.util.Iterator;
import java.util.Scanner;

public class Boucle2 {
public static void main(String[] args) {
	
	// for avec break et continue 
//	for (int i = 0; i < 6; i+=2) {
//		System.out.println("A"+i);
//		if(i==2) {
//			continue;
//		}
//		System.out.println("B"+i);
//		
//		if(i==4) {
//		break;
//		}
//		System.out.println("C"+i);
//	}
//	System.out.println("Fin");
	Scanner clavier=new Scanner(System.in);
	
	//System.out.println("Entrer le nombre secret");//ecrire a l'ecran
	//int nombre=clavier.nextInt();//lire au clavier et affecter la valeur au nombre
	//System.out.println("Nombre est "+nombre);
	//exercice a rendre la semaine prochaine 
	//Modifier ce programme pour permettre a 3 joueurs d'essayer de  trouver le nombre secret
	// chaque joueur , doit commencer, par saisir son prenom
	//le programme affiche , a la fin du jeu , le prenom du joueur qui gagné
	// un joueur gagne si la somme des ecarts par rapport au nombre secret est minimal
	// si un joueur trouve le nombre secret , il sera le gagnant et le jeu s'arrete 
	int nombre=0,nombreEssai=0;
	boolean trouve=false;
	System.out.println("Entrer votre prenom ");
	String prenom=clavier.next();
	
System.out.println("tu t'appelles "+prenom);
	do {
		System.out.println("Entrer le nombre secret");
		nombre=clavier.nextInt();
		trouve=   nombre==123;
//
		
		
		if (!trouve) {
//			if(nombre<=113 && nombre>=133 )
			double ecart=Math.abs(123-nombre);
			if(ecart>=10)
			nombreEssai++;
			else System.out.println("il ne reste q'un ecart <10"+(123-nombre)+" pour trover ce nombre");
			
			if(nombreEssai==3) {
				System.out.println("Arret du programme , nombre essais =3");
				break;
			}
			System.out.println("ce n'est le bon nombre, il vous reste "+(3-nombreEssai)+"essai(s)");
		}
	}while(!trouve  ); // la condition contraire : i==0 ou nombre==123
	if( trouve)
	System.out.println("Bravo, le nombre secret est "+nombre+", apres "+nombreEssai+" Essai(s)");
}
}
