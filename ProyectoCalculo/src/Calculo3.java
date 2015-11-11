
public class Calculo3 extends Thread {
	private int enteros[];
	private String nombreProceso;
	
	public Calculo3(String nombreThread, int[] e){
		this.enteros=e;
		this.nombreProceso=nombreThread;
	}
	
	public void run(){
		System.out.println("El valor minimo es: "+valorMinimo());
	}
	
	public int valorMinimo(){
		int numeroMenor = enteros[0];
		for(int y=0;y<enteros.length;y++){
			if(enteros[y]< numeroMenor){
				numeroMenor=enteros[y];
			}
		}
		return numeroMenor;
	}
}
