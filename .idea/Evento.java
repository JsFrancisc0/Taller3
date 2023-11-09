public class Evento {

	private Disciplina disciplina;
	private String fecha;
	private ArrayList<Equipos> equipos;
	private ArrayList<Atleta> participantes;

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

	public String getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public ArrayList<Equipos> getEquipos() {
		return this.equipos;
	}

	/**
	 * 
	 * @param equipos
	 */
	public void setEquipos(ArrayList<Equipos> equipos) {
		this.equipos = equipos;
	}

	public ArrayList<Atleta> getParticipantes() {
		return this.participantes;
	}

	/**
	 * 
	 * @param participantes
	 */
	public void setParticipantes(ArrayList<Atleta> participantes) {
		this.participantes = participantes;
	}

	public void mostrarInfo() {
		// TODO - implement Evento.mostrarInfo
		throw new UnsupportedOperationException();
	}

}