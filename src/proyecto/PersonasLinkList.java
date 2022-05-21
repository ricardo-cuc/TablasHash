package proyecto;

public class PersonasLinkList {
	    // encabezado de la lista de enlaces
	    private Persona head;

	    // agregar
	    public void add(Persona Persona) {
	        if (head == null) {
	            head = Persona;
	            return;
	        }
	        Persona tPersona = head;
	        while (tPersona.next != null) {
	            // hacia atrás
	            tPersona = tPersona.next;
	        }
	        tPersona.next = Persona;
	    }
	    
	    // eliminar
	    public void deletePersonaById(String id) {
	        if (head == null) {
	            return;
	        }
	        Persona tPersona = head;

	        while (true) {
	            if (tPersona.getcodigo() == id) {
	                // eliminar
	                head = tPersona.next;
	                break;
	            }

	            if (tPersona.next == null) {
	                break;
	            }

	            if (tPersona.next.getcodigo() == id) {
	                // Eliminar el nodo Persona
	                tPersona.next = tPersona.next.next;
	                break;
	            }

	            // hacia atrás
	            tPersona = tPersona.next;
	        }
	    }

	    // Encuentra
	    public Persona findPersonaById(String id) {
	        if (head == null) {
	            return null;
	        }
	        Persona tPersona = head;
	        while (true) {
	            if (tPersona.getcodigo() == id) {
	                break;
	            }
	            if (tPersona.next == null) {
	                tPersona = null;
	                break;
	            }
	            // hacia atrás
	            tPersona = tPersona.next;
	        }
	        return tPersona;
	    }

	    // atravesar
	    public void list(int no) {
	        if (head == null) {
	            System.out.println("Sección" + (no + 1) + "La lista vinculada está vacía");
	            return;
	        }
	        System.out.print("Sección" + (no + 1) + "Información de la lista vinculada para");
	        Persona tPersona = head;
	        while (true) {
	            System.out.print(tPersona + " --> ");
	            if (tPersona.next == null) {
	                break;
	            }
	            // hacia atrás
	            tPersona = tPersona.next;
	        }
	        System.out.println();
	    }

}