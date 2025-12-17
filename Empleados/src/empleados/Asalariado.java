package empleados;

final class Asalariado extends Empleado{

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
}
