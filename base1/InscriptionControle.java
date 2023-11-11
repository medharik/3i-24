package base1;

public class InscriptionControle {
public static void main(String[] args) {
	// les conditions booleennes
	int age =18;
	float taille=1.8f;
	boolean majeur = age>18;
//age<18, age==18	
	if (age<0) {
		System.out.println("Erreur");
	}
	else if(age<18){
		
		System.out.println("Mineur");
	}
	
	else if(age==18){
		System.out.println("JA");
	}else  {
		System.out.println("Majeur");
	}
	
	
}
}
