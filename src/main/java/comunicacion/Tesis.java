package comunicacion;

public class Tesis extends Escrito{
	private String idea;
	private String [] argumentos; //Preguntar el []
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos,
			String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}

	@Override
	public int palabrasTotales(int parametro) {
		int nPaginas = this.getPaginas();
		int varMultiplicacion = nPaginas*parametro*5;
		return varMultiplicacion;
		
	}
	
	@Override
	public String interpretacion() {
		return this.getInterpretacion();
		
		
	}
	
	@Override
	public String toString() {	
		String [] argumentosA = this.getArgumentos();
		int numeroArgumento = 0;
		for (int index = 0; index < argumentosA.length; index++) {
			numeroArgumento ++;
			
        }
		String r = this.getOrigen() + "\n";
		r += this.getTitulo() + "\n";
		r += this.getAutor() + "\n";
		r += this.getPaginas() + "\n";
		r += this.getIdea()+ "\n";
		r += numeroArgumento+ "\n";
		r += this.getConclusion()+ "\n";
		r += this.getReferencias()+ "\n";
		r += this.getInterpretacion();
		return  r;
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String[] getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	

}
