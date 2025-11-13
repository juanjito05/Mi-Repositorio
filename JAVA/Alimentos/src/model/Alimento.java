package model;

public class Alimento{
	String denominación;
	double lípidos;
	double hidratos;
	double proteínas;
	boolean esOrigenAnimal;
	char contenidoVita;
	char contenidoMine;
	Alimento(String nombre){
		denominación = nombre;
	}
	Alimento(String nombre, double lp, boolean esOA,
		double hi, double pro, char v, char m){
		denominación = nombre;
		lípidos=lp;
		hidratos=hi;
		proteínas=pro;
		esOrigenAnimal=esOA;
		contenidoVita=v;
		contenidoMine=m;	
	}
	boolean esDietetico(){
		return lípidos <= 20 && contenidoVita != 'B';	
	}
	String muestraAlimento(){
		return "Nombre: "+denominación+
			"\nAnálisis: \n\tLípidos: "+lípidos+
			"\n\tHidratos de carbono: "+hidratos+
			"\n\tProteínas: "+proteínas+
			"\nContenido en vitaminas: "+ (contenidoVita == 'A'?
			"alto" :contenidoVita == 'M'? "medio" : "bajo")+ 
			"\nContenido en minerales: "+ (contenidoMine == 'A'?
			"alto" :contenidoMine == 'M'? "medio\n" : "bajo\n")+
			(esOrigenAnimal? "Es de origen animal\n" :
			"No es de origen animal\n")+
			(esDietetico()? "Es dietético\n":"No es dietético\n")+
			(esRecomendableParaDeportistas()? "Es ":"No es ")+
			"recomendable para deportistas";	
	}
	boolean esRecomendableParaDeportistas(){
		return lípidos < 35 &&
			proteínas >= 9 && proteínas <35 &&
			hidratos >= 55 && hidratos < 85;
	}
	double calculaContenidoEnergetico(){
		return lípidos*9.4+ hidratos*4.1+ proteínas*5.3;
	}
}
