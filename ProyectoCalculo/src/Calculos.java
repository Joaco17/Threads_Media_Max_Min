
public class Calculos extends Thread {

	private int enteros[];
	private String nombreProceso;
	
	public Calculos(String nombreThread, int[] e){
		this.enteros=e;
		this.nombreProceso=nombreThread;
	}
	
	public void run(){
		System.out.println("La media es: "+calculaMedia());
	}

	public int calculaMedia(){
		int media;
		int suma=0;
		
		for(int i=0; i<enteros.length; i++){
			suma= enteros[i]+suma;
		}
		media=suma/enteros.length;
		
		return media;
	}

	
}
