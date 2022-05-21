package proyecto;
import java.io.BufferedReader;
import java.io.FileReader;

//import org.joda.time.format.*;

public class principal {
	public static void main (String[] args) throws Exception {
		System.out.println("Ricardo Humberto Cuc Salazar");
		System.out.println("0910-14-8526");
		HashTab PersonasLinkList = new HashTab(7);
		int id=1;
				
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Ricardo\\eclipse-workspace\\tablas\\src\\proyecto\\ListaC.csv")); 
			String line;
			while ((line = br.readLine()) != null) { 
			    // use comma as separator 
			    String[] cols = line.split(";"); 
				Persona pers = new Persona(id++,Integer.parseInt(cols[0]), cols[1], cols[2]);
				PersonasLinkList.add(pers);
			} 
			/*if(PersonasLinkList.==false){
				System.out.println("|#|     DPI     |     NOMBRE          | FECHA");
				for(int i=0; i < PersonasLinkList.contar();i++){
					int n=i+1;
					System.out.println("|"+n+"|"+PersonasLinkList.+"|"+PersonasLinkList.obtener(i).getnombre()+"|"+PersonasLinkList.obtener(i).getfecha());
				}
			}
			System.out.println("C) El primer Nodo de la PersonasLinkList..");
			PersonasLinkList.eliminarPrincipio();
			System.out.println("D)Insertar nodo al final de la PersonasLinkList.");
			Persona personaf = new Persona(Long.parseLong("2170470920101"),"Ricardo Humberto Cuc Salazar", datetimeformat.parseDateTime("20/12/1992"));
			PersonasLinkList.insertarFinal(personaf);
			if(PersonasLinkList.estaVacio()==false){
				System.out.println("|#|     DPI     |     NOMBRE          | FECHA");
				for(int i=0; i < PersonasLinkList.contar();i++){
					int n=i+1;
					System.out.println("|"+n+"|"+PersonasLinkList.obtener(i).getdpi()+"|"+PersonasLinkList.obtener(i).getnombre()+"|"+PersonasLinkList.obtener(i).getfecha());
				}
			}
			*/
			br.close();
	}	
}
