package base1;
/**
@author HARIK
@since 2023
@version 1.0
 
*/
public class Variable {
public static void main(String[] args) {

//	afficher un message 
System.out.println("mon premier en java");
//declaration des variables 
byte  b=1;
int i=200;
System.out.println("b est "+b);
//cast ou conversion forcee
b=(byte) i;
System.out.println("b est "+b);

double d=180.5;
i=(int) d;
System.out.println("i est "+i);
d=i;
long l=10000;
i=(int) l;
float f= 0.0f;
int age=10;

//portés 
int a=10;


{

	int local=300;
	local=1000;
	System.out.println("local 1 "+local);
a=20;
System.out.println(" a est "+a);	
}
//int s=1;
//int ss= (s+s);

System.out.println("a dehors "+a);
//System.out.println("local dehors "+local);

// locale 
//globale


//cast / conversion forcee
/*
 les variables en java 
int 
float 
*/
//bloc g
{
int ax=33;
int oussama=90;
//bloc l
		{
			ax=200;
			int bx=22;
			System.out.println(bx);
			oussama=10;
			bx=0;
		}// fin bloc l
		System.out.println(ax);
		
	oussama=9;
}//fin bloc g
//concatenation

char c='1';
String s=12+"";//"12"
System.out.println("s est "+s);
int ss=10+3;//13
System.out.println("ss est "+ss);
s=""+ss+1+"-"+(ss+2);
System.out.println("s est finalement "+s);
//"14-13"
//131-15

}
}