package base1;

public class Tp3Condition {
public static void main(String[] args) {
	int age=20;
	double taille=1.8;
	int i=0;
	{
		boolean selection = age>18 && taille>=1.8 && i++==0;
		System.out.println(i+"  selection :"+selection);
		//1* 1* 1 =1 <=> true
		//i=1
		selection=age>=18 &&  ++i==1;
		System.out.println(i+"  selection :"+selection);
		
		selection=age>=18 &&  ++i==2 || taille==1.8;
		System.out.println(i+"  selection :"+selection);

//
	}
	

}
}
