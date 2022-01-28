
public class Estudiante {
	public String nombre= "", promedio = "", pueblo = "", entrada = "";
	public int edad;
	static Estudiante[] objArray = new Estudiante[5];
	   
	 
	Estudiante(String nom, int ed, String prom, String pueb) {
		this.nombre = nom;
		this.edad = ed;
		this.promedio = prom; 
		this.pueblo = pueb;
	}

	static void infoEst(String s) {
		for (int i = 0; i < objArray.length; i++) {
			if (objArray[i].nombre == s) {
				System.out.println("Nombre: "+ objArray[i].nombre +"\nEdad: "+ objArray[i].edad +"\nPromedio: "+
									objArray[i].promedio +"\nPueblo: "+ objArray[i].pueblo +"\n");
	         }
	      }
	   } 
	
	static void estProm(String s) {
		System.out.println("Estudiantes que tienen un promedio de " +s+ " o mayor:");
			for (int i = 0; i < objArray.length; i++) {
				if (objArray[i].promedio.compareToIgnoreCase(s) <= 1) {
					System.out.println(objArray[i].nombre);
		         }
		      }
		      System.out.println("");
		   }
	   
	static void estPueb(String s) {
		System.out.println("Estudiantes que viven en " + s +":");
		for (int i = 0; i < objArray.length; i++) {
		         if (objArray[i].pueblo == s) {
		            System.out.println(objArray[i].nombre);
		         }
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		  objArray[0] = new Estudiante("Joshua", 20, "A", "Aguadilla");
	      objArray[1] = new Estudiante("Liliana", 21, "A", "Isabella");
	      objArray[2] = new Estudiante("Cano", 27, "C", "Aguadilla");
	      objArray[3] = new Estudiante("Eribelto", 22, "F", "Moca");
	      objArray[4] = new Estudiante("Jojo", 30, "F", "Isabella");
	 
	      infoEst("Joshua"); 
	      infoEst("Liliana");
	      
	      estProm("A");
	      estProm("F");
	      
	      estPueb("Aguadilla");
	      estPueb("Isabella");
	   }
}
