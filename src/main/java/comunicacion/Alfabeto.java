package comunicacion;

public class Alfabeto extends Pictograma {


	private String letras;
	private String interpretacion;
	
	
	
	
	
	public Alfabeto(String origen, String letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	public int cantidadLetras() { //Deberia de hacer un return de int
		String varLetras = this.getLetras();
		int numeroLetras = 0;
		for (int index = 0; index < varLetras.length(); index++) {
			numeroLetras ++;
			
        }
		return numeroLetras;
	}
	
	public String interpretacion() {
		return this.getInterpretacion();
	}

	@Override
	public String toString() {
		String Alfabeto;
		Alfabeto = "A, " + "B, " + "C, "+ "D, "+ "E, "+ "F, "+ "G, "+ "H, "+ "I, "+ "J, "+ "K, "+ "L, "
				+ "M, " + "N, " + "O, " + "P, " + "Q, " + "R, " + "S, " + "T, " + "U, " + "V, " + "W, "
				+ "X, " + "Y, " + "Z";
		return Alfabeto; //Ver
	}
	
	

	public String getLetras() {
		return letras;
	}

	public void setLetras(String letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
	
	
	
	
	
	
	
	
	
}
