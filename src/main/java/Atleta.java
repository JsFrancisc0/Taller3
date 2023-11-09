import java.util.ArrayList;

public class Atleta {

	private String nombre;
	private String pais;
	private int edad;
	private ArrayList<Disciplina> listaDisciplinas;

	Atleta(String nombre, String pais, int edad){

		setNombre(nombre);
		setPais(pais);
		setEdad(edad);
		this.listaDisciplinas = new ArrayList<>();
	}

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
		System.out.println("Nombre: "+getNombre()+"\n Edad: "+getEdad()+"\n Pais: "+getPais()+"\n Lista Disciplinas:");
		for (Disciplina i : getListaDisciplinas()){
			System.out.println(i.getNombre()+"\n");
		}
	}

	/**
	 * 
	 * @param disciplina
	 */
	public void agregarDisciplina(Disciplina disciplina) {
		listaDisciplinas.add(disciplina);
	}

	/**
	 * 
	 * @param nombreDisciplina
	 */
	public void eliminarDisciplina(String nombreDisciplina) {
		for (Disciplina i : getListaDisciplinas()){
			if (i.getNombre().equalsIgnoreCase(nombreDisciplina)){
				listaDisciplinas.remove(i);
			}
		}
	}

}