package ito.poo.app;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import ito.poo.excepciones.ExcepcionDeNumeroInvalido;


public class MyApp {
    static int votos[]= null;
    static float porcentajes[]=null;
    static int n=0,m=0;
    static Scanner io= new Scanner(System.in);
    
    static int leerInt(int min, int max) throws ExcepcionDeNumeroInvalido{
    	int numero=-1;
    	try {
    	   numero=io.nextInt();
    	}
    	catch(InputMismatchException e) {System.err.println("No es un entero");}
        catch(NoSuchElementException e) {System.err.println("No encontrado");}
        catch(IllegalStateException e) {System.err.println("Flujo cerrado");}
    	io.nextLine();
    	if(numero<min || numero>max)
    		throw new ExcepcionDeNumeroInvalido("Invalido numero introducido");
    	return numero;
    }
   
    
    static void creaCandidatos() {
    	System.out.println("Proporciona la cantiad de candidatos que participan:");
    	do {
    	   try {
    	       n= leerInt(1,10);
    	   }catch(ExcepcionDeNumeroInvalido e) {
    		   System.err.println(e.getMessage());continue;
    	   }
    	   break;
    	}while(true);
    	votos= new int[n];
    	porcentajes= new float[n];
    }
    
    static void capturaVotos() {
    	int voto=0;
    	do {
    		System.out.println("Voto a numero de candidato:["+1+".."+n+"]:");
    		try {
    		voto=io.nextInt();
    		}
    		catch(InputMismatchException e) {System.err.println("No es un entero");
    		                                 System.err.println(e.getCause());
    		                                 voto=-1;}
    		catch(NoSuchElementException e) {System.out.println("No encontrado");
    		                                 voto=-1;}
    		catch(IllegalStateException e) {System.out.println("Flujo cerrado");
    		                                voto=-1;}
    		io.nextLine();
    		if(voto==0)
               break;
            if(voto>0 && voto<=n) {
            	m++; votos[voto-1]++;
            }
    	}while(true);
    }
    
    static void calculaPorcentajes() {
    	for(int i=0;i<n;i++)
    		porcentajes[i]=(votos[i]*100)/(float)m;	
    }
    
    static void imprimeResultados() {
    	System.out.println("Porcentajes por candidatos");
    	for(int i=0;i<n;i++)
    		System.out.printf("%d\t%4.2f%%\n", i+1,porcentajes[i]);
    		
    }
    
	static void run(){
		creaCandidatos();
		capturaVotos();
		calculaPorcentajes();
		imprimeResultados();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        run();
	}
}
