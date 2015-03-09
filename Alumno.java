import arrayint.ArrayListInt;
/**
 * Clase que simula un alumno de un instituto
 * 
 * @author (Daniel Alvarez) 
 * @version (1.0)
 */
public class Alumno
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int edad;
    private int nclase;
    private ArrayListInt notas;
    private static final int NOTA_APROBADO = 5;
    private static int NUMERO_DE_CLASE = 0;

    /**
     * Constructor for objects of class Alumno
     * @param nombre Es el nombre del alumno
     * @param edad Es la edad del alumno
     */
    public Alumno(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        nclase  = NUMERO_DE_CLASE;
        NUMERO_DE_CLASE++;
        notas = new ArrayListInt();
    }

    /**
     * Metodo que asigna notas
     * @param nota Es la nota que tiene en una determinada asignatura
     */
    public void asignaNotas(int nota)
    {
        notas.add(nota);
    }

    /**
     * Metodo que calcula la media de todas las notas
     */
    public int mediaNotas()
    {
        int sumaNotas = 0;
        int media = 0;
        for(int i = 0; i<notas.size(); i++)
        {
            sumaNotas = sumaNotas + notas.get(i);
        }
        if(notas.size() == 0)
        {
            media = 0;
        }
        else
        {
            media = (sumaNotas/notas.size());
        }
        return media;
    }

    /**
     * Metodo que nos dice si un alumno está aprobado o no, aprobado devuelve true, suspenso devuelve false
     */
    public boolean aprobado()
    {
        boolean aprobado = false;
        if(mediaNotas() >= 5)
        {
            aprobado = true;
        }
        return aprobado;
    }

    /**
     * Metodo que muestra todos los datos del alumno
     */
    public String toString()
    {
        String datos = "Nombre: " + nombre + " *" + " Edad: " + edad + " *" + " Numero de clase: " +  nclase + " *" +" Media: " + mediaNotas() + " *" +" Aprobado: " + aprobado();
        return datos;
    }
}
