package estruturasCondicionais;

public class operacaoTernario {
	

public static void main(String[] args) {
	
	double salarioAnual= 70000;
	double primeiraFaixa = 9.70/100;
	double segundaFaixa = 37.35/100;
	double terceiraFaixa = 49.50/180;
	
	double valorImposto;
	
	if(salarioAnual<=34712) {
		salarioAnual = salarioAnual * primeiraFaixa;
	}else if (salarioAnual >=34713 && salarioAnual <= 68587) {
		salarioAnual = salarioAnual * segundaFaixa;
		
		
	}else {
		salarioAnual = salarioAnual*terceiraFaixa;
		
		
	}
		System.out.println(salarioAnual);
	}
	
	
	
		
	
	
}












	
		
		
	
		
		
		
		
		

	


