
public class Calculo2 extends Thread {
	private int enteros[];
	private String nombreProceso;
	
	public Calculo2(String nombreThread, int[] e){
		this.enteros=e;
		this.nombreProceso=nombreThread;
	}
	
	public void run(){
		System.out.println("El valor minimo es: "+valorMaximo());
	}
	
	public int valorMaximo(){
		int numeroMayor= enteros[0];
		for(int x=0;x<enteros.length;x++){
			if(enteros[x]> numeroMayor){
				numeroMayor=enteros[x];
			}
		}
		return numeroMayor;
	}
}
