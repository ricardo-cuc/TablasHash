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
        // Seleccione la lista vinculada según la identificación del Personaleado
        int PersonasListNO = hashFun(Persona.id);
       // Añadir a la lista vinculada
        PersonasList[PersonasListNO].add(Persona);
    }
    
    
    // Escribe una función hash y usa un método de módulo simple
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
    // Eliminar información Persona de la tabla hash de acuerdo con la identificación
    public void deleteById(String id) {
        String is = hashFun(id);
        PersonasLinkListArray[is].deletePersonaById(null);
    }

    // Encuentra información Persona de la tabla hash según id
    public void findPersonaById(int id) {
        int is = hashFun(id);
        Persona Persona = PersonasLinkListArray[is].findPersonaById(id);
        if (Persona != null) {
            System.out.println("id valor correspondiente:" + Persona);
        }
    }


    



   */
 }
