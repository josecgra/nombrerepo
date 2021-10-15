package es.interfaces;

public class ArrayReales implements Estadisticas {

	private double[] vector;
	
	public ArrayReales(int tam) {
		vector = new double[tam];
	}
	
	
	
	
	
	public double[] getVector() {
		return vector;
	}

	public void setVector(double[] vector) {
		this.vector = vector;
	}


	public void asignar() {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = Math.random();
		}
	}
	
	
	@Override
	public double minimo() {
		
		double numeromenor=vector[0];
		
		for (int i = 0; i < vector.length; i++) {
			
			if (vector[i] < numeromenor) {
				numeromenor = vector[i];
			}
			
		}
		
		return numeromenor;
		
	}

	@Override
	public double maximo() {
		
		double numeromayor=vector[0];
		
		for (int i = 0; i < vector.length; i++) {
			
			if (vector[i] > numeromayor) {
				numeromayor = vector[i];
			}
			
		}
		
		
		return numeromayor;
	}

	@Override
	public double sumatorio() {
		
		double suma = 0;
		
		for (int i = 0; i < vector.length; i++) {
			suma = suma + vector[i];
		}
		
		return suma;
	}

}
