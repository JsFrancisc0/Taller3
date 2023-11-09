import java.util.ArrayList;

public class Equipo {

	private String nombre;
	private Disciplina disciplina;
	private ArrayList<Atleta> listaAtletas;

	public Equipo(String nombre, Disciplina disciplina) {
		this.nombre = nombre;
		this.disciplina = disciplina;
		this.listaAtletas = new ArrayList<>();
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
		listaAtletas.add(atleta);
	}

	/**
	 * 
	 * @param nombreAtleta
	 */
	public void eliminarAtleta(String nombreAtleta) {
		for (Atleta i : getListaAtletas()){
			if (i.getNombre().equalsIgnoreCase(nombreAtleta)){
				listaAtletas.remove(i);
			}
		}
	}

	public void mostrarInfo() {
		System.out.println("Nombre: "+getNombre()+"\n Disciplina: "+disciplina.getNombre()+"\n Lista de Atletas:");
		for (Atleta i : getListaAtletas()){
			System.out.println(i.getNombre()+"\n");
		}
	}

}