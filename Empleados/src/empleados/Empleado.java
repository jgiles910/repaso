package empleados;

public class Empleado {

	private int idEmpleado;
	private String nombreEmpleado;
	private String fechaNacimiento;
	private int sueldoBase;
	
	public Empleado (int id, String nombre, String fecha, int sueldo) {
		
		this.idEmpleado = id;
		this.nombreEmpleado = nombre;
		this.fechaNacimiento = fecha;
		this.sueldoBase = sueldo;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", fechaNacimiento="
				+ fechaNacimiento + ", sueldoBase=" + sueldoBase + "]";
	}
	
}
