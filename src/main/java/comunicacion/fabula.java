package comunicacion;

public class fabula extends Escrito  {
	private String ensenaza;
	private String interpetacion;
	
	
	
	
	public fabula(String origen, String titulo, String autor, int paginas, String ensenaza, String interpetacion) {
		super(origen, titulo, autor, paginas);
		this.ensenaza = ensenaza;
		this.interpetacion = interpetacion;
	}

	@Override
	public int palabrasTotales (int parametro) {
		int nPaginas = this.getPaginas();
		int varMultiplicacion = nPaginas*parametro*1;
		return varMultiplicacion;
		
	}
	
	@Override
	public String interpretacion () {
		return this.getInterpetacion();
	}
	
	@Override
	public String toString() {
		String r = this.getOrigen() + "\n";
		r += this.getTitulo() + "\n";
		r += this.getAutor() + "\n";
		r += this.getPaginas() + "\n";
		r += this.getEnsenaza()+ "\n";
		r += this.getInterpetacion();
		return  r;
	}

	public String getEnsenaza() {
		return ensenaza;
	}

	public void setEnsenaza(String ensenaza) {
		this.ensenaza = ensenaza;
	}

	public String getInterpetacion() {
		return interpetacion;
	}

	public void setInterpetacion(String interpetacion) {
		this.interpetacion = interpetacion;
	}
	
	
	
}
