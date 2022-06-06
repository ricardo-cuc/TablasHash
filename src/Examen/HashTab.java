package Examen;

public class HashTab {

	 // lista declarada para tabla hash
    private PersonasList[] PersonasList;
    private int size;

    // constructor
    public HashTab(int size) {
        // inicializar
        this.PersonasList = new PersonasList[size];
        this.size = size;
        // Necesita inicializar cada lista vinculada
        for (int i = 0; i < size; i++) {
        	PersonasList[i] = new PersonasList();
        }
    }

    // Agrega Persona a la tabla hash
    public void add(Persona Persona) {
        // Seleccione la lista vinculada seg�n la identificaci�n del Personaleado
        int PersonasListNO = hashFun(Persona.id);
       // A�adir a la lista vinculada
        PersonasList[PersonasListNO].add(Persona);
    }
    
    
    // Escribe una funci�n hash y usa un m�todo de m�dulo simple
    private int hashFun(int id) {
        return id % size;
    }
    
 // Recorrer la tabla hash
    public void list() {
        for (int i = 0; i < size; i++) {
        	PersonasList[i].list(i);
        	
        }   
    }
   
   /*
    // Eliminar informaci�n Persona de la tabla hash de acuerdo con la identificaci�n
    public void deleteById(String id) {
        String is = hashFun(id);
        PersonasLinkListArray[is].deletePersonaById(null);
    }

    // Encuentra informaci�n Persona de la tabla hash seg�n id
    public void findPersonaById(int id) {
        int is = hashFun(id);
        Persona Persona = PersonasLinkListArray[is].findPersonaById(id);
        if (Persona != null) {
            System.out.println("id valor correspondiente:" + Persona);
        }
    }


    



   */
 }
