import java.util.Random;
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class test
{
    private Alumno[] alumnos;
    /**
     * Constructor for objects of class test
     */
    public test()
    {   
        for(int i = 0; i < 5; i++)
        {
            Alumno alumno = new Alumno(asignaNombre(), asignaEdad());
            asignaNotas(alumno);
            System.out.println(alumno.toString());
        }
    }

    /**
     * Asigna un nombre aleatorio a un determinado alumno 
     */
    public String asignaNombre()
    {
        String nom = "";
        String nombre[] = new String[5];
        nombre[0] = "Edu";
        nombre[1] = "Julia";
        nombre[2] = "Dani";
        nombre[3] = "Gabi";
        nombre[4] = "Alejandro";
        Random nombreAleatorio = new Random();
        nom = nombre[nombreAleatorio.nextInt(5)];
        return nom;
    }

    /**
     * Asigna una edad aleatoria a un determinado alumno
     */
    public int asignaEdad()
    {
        int edad = 0;
        Random ed = new Random();

        edad = ed.nextInt(10)+15;
        return edad;
    }

    /**
     * Asigna unas determinadas notas
     */
    public void asignaNotas(Alumno alumno)
    {
        Random cantiNotas = new Random();
        Random numNota = new Random();
        
        int n = cantiNotas.nextInt(5)+1; //Se guarda un entero aleatorio
        for(int i = 0; i<n;i++)
        {
            alumno.asignaNotas(numNota.nextInt(10));
        }
    }
}
