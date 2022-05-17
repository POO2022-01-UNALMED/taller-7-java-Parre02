package comunicacion;

public class Periodico extends Escrito {
	private String fecha;
	private String primicia;
	private String intepretacion;
	
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia,
			String intepretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.intepretacion = intepretacion;
	}
	
	@Override
	public int palabrasTotales(int parametro) {
		int nPaginas = this.getPaginas();
		int varMultiplicacion = nPaginas*parametro*10;
		return varMultiplicacion;
		
	}
	
	@Override
	public String interpretacion() {
		return this.getIntepretacion();
		
	}
	
	@Override
	public String toString() {
		String r = this.getOrigen() + "\n";
		r += this.getTitulo() + "\n";
		r += this.getAutor() + "\n";
		r += this.getPaginas() + "\n";
		r += this.getFecha()+ "\n";
		r += this.getPrimicia()+ "\n";
		r += this.getIntepretacion();
		return  r;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPrimicia() {
		return primicia;
	}

	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}

	public String getIntepretacion() {
		return intepretacion;
	}

	public void setIntepretacion(String intepretacion) {
		this.intepretacion = intepretacion;
	}

	
	
	
	

}
