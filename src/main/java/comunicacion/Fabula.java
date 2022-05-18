package comunicacion;

public class Fabula extends Escrito  {
	private String ensenanza;
	private String interpetacion;
	
	
	
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenaza, String interpetacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenaza;
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
		r += this.getEnsenanza();
		return  r;
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenaza) {
		this.ensenanza = ensenaza;
	}

	public String getInterpetacion() {
		return interpetacion;
	}

	public void setInterpetacion(String interpetacion) {
		this.interpetacion = interpetacion;
	}
	
	
	
}
