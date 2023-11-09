public class Atleta {

	private String nombre;
	private String pais;
	private int edad;
	private ArrayList<Disciplina> listaDisciplinas;

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

	public String getPais() {
		return this.pais;
	}

	/**
	 * 
	 * @param pais
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getEdad() {
		return this.edad;
	}

	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<Disciplina> getListaDisciplinas() {
		return this.listaDisciplinas;
	}

	/**
	 * 
	 * @param listaDisciplinas
	 */
	public void setListaDisciplinas(ArrayList<Disciplina> listaDisciplinas) {
		this.listaDisciplinas = listaDisciplinas;
	}

	public void mostrarInfo() {
		// TODO - implement Atleta.mostrarInfo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param disciplina
	 */
	public void agregarDisciplina(Disciplina disciplina) {
		// TODO - implement Atleta.agregarDisciplina
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombreDisciplina
	 */
	public void eliminarDisciplina(String nombreDisciplina) {
		// TODO - implement Atleta.eliminarDisciplina
		throw new UnsupportedOperationException();
	}

}