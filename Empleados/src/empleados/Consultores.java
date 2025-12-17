package empleados;

public class Consultores extends Empleado {

	private double horasTrabajadas;
	private double sueldoFinal;

	public Consultores(int id, String nombre, String fecha, int sueldo) {
		super(id, nombre, fecha, 0);
		this.horasTrabajadas = 0;
		this.sueldoFinal = 0;
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSueldoFinal() {
		return sueldoFinal;
	}

	public void setSueldoFinal(double sueldoFinal) {
		this.sueldoFinal = sueldoFinal;
	}

	public void calcularSueldoFinal(double pagoPorHora) {
		
		sueldoFinal = getSueldoBase() + (pagoPorHora * horasTrabajadas);
		
	}
	
	@Override
	public String toString() {
		//hago uso de los getters de la clase super para conseguir los atributos necesarios. get()
	    return "Consultores ID=" + getIdEmpleado()
	           + ", Nombre=" + getNombreEmpleado()
	           + ", Fecha de nacimiento=" + getFechaNacimiento()
	           + ", Sueldo base=" + getSueldoBase()
	           + ", Horas trabajadas=" + horasTrabajadas
	           + ", Sueldo final=" + sueldoFinal;
	}

}
