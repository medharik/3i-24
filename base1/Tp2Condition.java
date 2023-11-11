package base1;

public class Tp2Condition {
public static void main(String[] args) {
	float note=19.0f;
	// note=12;
	//--Erreur---0--Ajourne--8--Ratrappage--10-- passable--12--Admis avec mention--20---- Erreur
//	if (note<0) {8--Ratrappage--10-- passable--12--Admis avec mention
//		System.out.println("Erreur : note<0");
//	}
//	else 
//	if(note<8) {
//		System.out.println("AJOURNE");
//	}else if(note<10) {
//		System.out.println("RATRAPPAGE");
//	}else if(note<12) {
//		System.out.println("PASSABLE");
//	}else if(note<=20){
//		System.out.println("ADMIS AVEC MENTION");
//	}else {
//		System.out.println("Erreur, Note >20");
//	}
	int i=0;
	//i++;//(post) incrementation par 1 
	System.out.println("1- i est "+(++i));
	//++i;//(pre) incrementation par 1
	System.out.println("2- i est "+i);// i=2
	

	// && = *
	//|| = +  
	//true = 1
	//false = 0
	i=0;
	note=-12;
	
	boolean valide=(note>=0 && note<=20 && i++==1);// !(note>=0 && note<=20) <==> note<0 || note>20
	System.out.println("1- valide est "+valide);
	//1- valeur de i 
	System.out.println("3- i est "+i);
	i=0;
	//2+3*4;
	valide=(note>=0 || note<=20 && i++<1);
	
	System.out.println("2- valide est "+valide);

	
	//2- valeur de i 
	if (!valide) {
		
		System.out.println("Erreur : la note doit etre entre 0 et 20");
		if (note<0) {
			System.out.println("la note ne doit etre <0 ");
		}else {
			System.out.println("Erreur : note>20");
		}
	}
	
	 if(note>=0 && note<8){
		System.out.println("AJOURNE");
	}
	 if(note>=8 && note<10){
		System.out.println("RATRAPPAGE");
	}
	 if(note>=10 && note<12){
		System.out.println("Passable");
	}
	 if(note>=12 && note<=20){
		System.out.println("ADMIS AVEC MENTION");
	}
	
	
	
	
	
	//https://github.com/medharik/l3-24
	 
	int s=0;
	//ajouter 3 a s 
	s=s+3;//s=3
	s=s+3;//s=6
	s+=3;
	s+=2;
	s+=1;//s++,++s;
	s=s*8;//s*=8
	System.out.println(s);
	s/=2;// s=s/2
	System.out.println(s);
	
	
	
	
}
	
}
