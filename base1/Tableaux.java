package base1;

public class Tableaux {
	
	// java : langage de programmation compilé, OO, crossPlateforme (se base la JVM)
	//installation ; 
	
	//
public static void main(String[] args) {
	// tableau en java : ensemble de valeurs indexees de meme  type
//decalarer un tableau
	double note[] ;
	
	//instancier un lableau de longueur = 3
	note= new double[3];
	System.out.println("la longueur  de la note est "+note.length);
	//ou les 2 en meme temps
	int age[]=new int[4];
	
	double min,max;
	note[0]=12;
	note[1]=1;
	note[2]=0;

max=min=note[0];
	for (int i = 0; i < note.length ; i++) {
		
		if(note[i]<min) min=note[i];
		if(note[i]>max) max=note[i];
		int numero=i+1;
		System.out.println("la  note numero "+numero+" est "+note[i]);
		
	}
	
	System.out.println("le min  est "+min+", le max est "+max);
double [] note2 ={12,13,18};
double t1[],t2;
//t2=new double[2];
//t1[1]=12;
double[]    t3,t4;
	



	




















	
}
}
 