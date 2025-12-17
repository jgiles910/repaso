package empleados;

//necesario para trabajar con arraylists
import java.util.ArrayList;

public class empleadosAPP {

	public static void main(String[] args) {

		// vamos a crear un arraylist (lista dinamica)
		// puede crecer dinamicamnete y guardar objetos.

		// 1. ArrayList<Asalariado>
		// 2. ArrayList<Consultores>

		// Creo una lista dinámica que solo puede contener objetos Asalariado, la llamo
		// listaAsalariados y por ahora está vacía.
		ArrayList<Asalariado> listaAsalariados = new ArrayList<>();
		// Hago lo mismo para la lista consultores
		ArrayList<Consultores> listaConsultores = new ArrayList<>();

		// a1 es una variable que guardara un objeto de la clase Asalariado, con todos
		// los atributos.
		// a1 es el nombre del asalariado.
		// hago uso del constructor, añadiendole los datos a mano. El orden de los
		// atributos del constructor es muy importante, en caso contrario daria error.
		Asalariado a1 = new Asalariado(1, "Ana", "1995-03-12", 1200);

		// incluyo las horas extras que ha realizado a1 despues de instanciar el objeto
		// para que sea mas facil de escalar a futuro, las horas extras no son las
		// mismas todos los meses.
		a1.setHorasExtra(5);

		a1.calcularSueldoFinal(40);

		// aqui creo otro objeto de tipo asalariado, es decir un nuevo empleado.
		Asalariado a2 = new Asalariado(2, "Luis", "1990-07-22", 1400);
		a2.setHorasExtra(2);
		a2.calcularSueldoFinal(40);

		// .add es un metodo del ArrayList, añade ambos objetos a mi lista
		listaAsalariados.add(a1);
		listaAsalariados.add(a2);

		// Crear consultores
		Consultores c1 = new Consultores(3, "Marta", "1988-11-01", 0);
		c1.setHorasTrabajadas(40);
		c1.calcularSueldoFinal(100);

		Consultores c2 = new Consultores(4, "Pedro", "1992-05-15", 0);
		c2.setHorasTrabajadas(25);
		c2.calcularSueldoFinal(100);

		// .add los consultores individuales a mi lista de consultores
		listaConsultores.add(c1);
		listaConsultores.add(c2);

		// Mostrar resultados
		System.out.println("ASALARIADOS:");
		for (Asalariado a : listaAsalariados) {
			System.out.println(a);
		}

		System.out.println("CONSULTORES:");
		for (Consultores c : listaConsultores) {
			System.out.println(c);
		}

		// variables para alojar el total de cada lista
		double totalAsalariados = 0;
		double totalConsultores = 0;

		// recorro con el for each cada objeto situado en mi ArrayList
		// la variable del for each tiene que ser del mismo tipo que la de mi arraylist,
		// en este caso de tipo Asalariado
		for (Asalariado a : listaAsalariados) {
			totalAsalariados = totalAsalariados + a.getSueldoFinal();
		}

		//sumo el total de los sueldos finales de los objetos dentro de cada lista
		for (Consultores c : listaConsultores) {
			totalConsultores = totalConsultores + c.getSueldoFinal();
		}
		
		// sumo ambos y lo muestro por pantalla.
		double gastoTotal = totalAsalariados + totalConsultores;
		System.out.println("\nGasto total en sueldos: " + gastoTotal + " €");

	}
}
