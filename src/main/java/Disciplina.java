public class Disciplina {

	private String nombre;
	private int numParticipantes;
	private double recordMundial;

	public Disciplina(String nombre, int numParticipantes, double recordMundial) {
		this.nombre = nombre;
		this.numParticipantes = numParticipantes;
		this.recordMundial = recordMundial;
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

	public int getNumParticipantes() {
		return this.numParticipantes;
	}

	/**
	 * 
	 * @param numParticipantes
	 */
	public void setNumParticipantes(int numParticipantes) {
		this.numParticipantes = numParticipantes;
	}

	public double getRecordMundial() {
		return this.recordMundial;
	}

	/**
	 * 
	 * @param recordMundial
	 */
	public void setRecordMundial(double recordMundial) {
		this.recordMundial = recordMundial;
	}

	public void mostrarInfo() {
		System.out.println("Nombre: "+getNombre()+"\n Numero de Participantes: "+getNumParticipantes()+"\n Record mundial: "+ getRecordMundial());
	}

}