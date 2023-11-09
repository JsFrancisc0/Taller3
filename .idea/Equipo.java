public class Equipo {

	private String nombre;
	private Disciplina disciplina;
	private ArrayList<Atleta> listaAtletas;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Disciplina getDisciplina() {
		return this.disciplina;
	}

	/**
	 * 
	 * @param disciplina
	 */
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public ArrayList<Atleta> getListaAtletas() {
		return this.listaAtletas;
	}

	/**
	 * 
	 * @param listaAtletas
	 */
	public void setListaAtletas(ArrayList<Atleta> listaAtletas) {
		this.listaAtletas = listaAtletas;
	}

	/**
	 * 
	 * @param atleta
	 */
	public void agregarAtleta(Atleta atleta) {
		// TODO - implement Equipo.agregarAtleta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombreAtleta
	 */
	public void eliminarAtleta(String nombreAtleta) {
		// TODO - implement Equipo.eliminarAtleta
		throw new UnsupportedOperationException();
	}

	public void mostrarInfo() {
		// TODO - implement Equipo.mostrarInfo
		throw new UnsupportedOperationException();
	}

}