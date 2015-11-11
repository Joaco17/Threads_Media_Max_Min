
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] enteros = new int[100];
		
		//RELLENAMOS EL VECTOR
		for(int i=0; i<enteros.length;i++){
			int numerosAleatorios = (int) Math.floor(Math.random()*100);
			enteros[i]= numerosAleatorios;
			//System.out.println(enteros[i]);
		
		}

		
		Calculos calculo1= new Calculos("ThreadMedia",enteros);
		calculo1.start();
		Calculo2 calculo2= new Calculo2("ThreadMaximo",enteros);
		calculo2.start();
		Calculo3 calculo3= new Calculo3("ThreadMinimo",enteros);
		calculo3.start();
	
		
		
		}
}
