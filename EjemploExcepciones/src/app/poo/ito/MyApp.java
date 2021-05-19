package app.poo.ito;

import clases.poo.ito.Alumno;
import excepciones.poo.ito.ExcepcionDeEdad;
import excepciones.poo.ito.ExcepcionDeSemestre;

public class MyApp {

	static void run() {
		Alumno a=null;
		
	      try {
			
			a = new Alumno(747474,"Juan Perez",(byte)26,(byte)12);
					     
	        System.out.println(a);
			a.setEdad((byte)45);
			a.setSemestre((byte)15);
	      }catch(ExcepcionDeEdad e) {
	    	  System.err.println(e.getMessage());
	      }catch(ExcepcionDeSemestre e) {
	    	  System.err.println(e.getMessage());
	      }
		
		System.out.println(a);
		System.out.println("El programa esta por terminar!!");
	     
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        run();
	}

}
