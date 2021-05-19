package clases.poo.ito;

import excepciones.poo.ito.ExcepcionDeEdad;
import excepciones.poo.ito.ExcepcionDeSemestre;

public class Alumno {
	
	private long noControl;
	private String nombre;
	private byte edad;
	private byte semestre;
	
	private void verificaEdad(byte edad) throws ExcepcionDeEdad {
		if(edad<17 || edad>45)
			throw new ExcepcionDeEdad("¡¡La edad debe ser entre 17 y 45 años!!");
	}
	
	private void verificaSemestre(byte semestre) throws ExcepcionDeSemestre {
		if(semestre<1 || semestre>14)
			throw new ExcepcionDeSemestre("¡¡El semestre debe ser entre 1 y 14!!");
	}
	
	public Alumno(long noControl, String nombre, byte edad, byte semestre) 
			throws ExcepcionDeEdad, ExcepcionDeSemestre{
		super();
		this.noControl = noControl;
		this.nombre = nombre;
		verificaEdad(edad);
		this.edad=edad;
		verificaSemestre(semestre);
		this.semestre = semestre;
	}
	
	public long getNoControl() {
		return noControl;
	}
	public void setNoControl(long noControl) {
		this.noControl = noControl;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) throws ExcepcionDeEdad {
		verificaEdad(edad);
		this.edad = edad;
	}
	public byte getSemestre() {
		return semestre;
	}
	public void setSemestre(byte semestre) throws ExcepcionDeSemestre {
		verificaSemestre(semestre);
		this.semestre = semestre;
	}
	@Override
	public String toString() {
		return "Alumno [noControl=" + noControl + ", nombre=" + nombre + ", edad=" + edad + ", semestre=" + semestre
				+ "]";
	}
	
	
	

}
