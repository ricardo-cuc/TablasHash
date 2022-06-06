package proyecto;

import java.net.InetAddress;
import java.net.*;

//import org.joda.time.format.*;

public class principal {
	public static void main (String[] args) throws Exception {
		System.out.println("DATOS DE ESTUDIANTE");
		try {	
            System.out.println("=========================");
            System.out.println("0910-14-8526, Ricardo Humberto Cuc Salazar, C");
            System.out.println("" + InetAddress.getLocalHost());
            System.out.println("=========================");
            
		} catch (UnknownHostException ex) {
            //Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

        // clase donde se insertan los registros a la tabla
		HashTab PersonasL= new HashTab(80);
		
		int id=1,i;
		float salario;	
			for(i=1;i<5;i++) { 
			    // Usando funcion para rellenar datos en tabla hash
				salario=(float) (i*100.01);
				Persona pers = new Persona(id++,"Empleado "+String.format("%03d",i),String.format("%03d",i),salario);
				PersonasL.add(pers);
		
			} 

			if(id>=1){
			PersonasL.list();
			}
	}	
}
