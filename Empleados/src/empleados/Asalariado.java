package empleados;

final class Asalariado extends Empleado {

	private int sueldoFinal;
	private int horasExtra;

	public Asalariado(int id, String nombre, String fecha, int sueldo) {
		super(id, nombre, fecha, sueldo);

		this.horasExtra = 0;
		this.sueldoFinal = sueldo;
	}

	public int getSueldoFinal() {
		return sueldoFinal;
	}

	public void setSueldoFinal(int sueldoFinal) {
		this.sueldoFinal = sueldoFinal;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public void calcularSueldoFinal(int valorHoraExtra) {

		sueldoFinal = getSueldoBase() + valorHoraExtra * horasExtra;
	}

	@Override
	public String toString() {
		//hago uso de los getters de la clase super para conseguir los atributos necesarios. get()
	    return "Asalariado id=" + getIdEmpleado() 
	           + ", nombre=" + getNombreEmpleado() 
	           + ", Fecha de nacimiento=" + getFechaNacimiento() 
	           + ", Sueldo base=" + getSueldoBase() 
	           + ", Horas extra=" + horasExtra 
	           + ", Sueldo final=" + sueldoFinal ;
	}

}
