package arrayint;
import java.util.Arrays;
import java.util.ArrayList;
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version listaber or a date)
 * 
 * 
 * for(int var = 0; var < files.size(); var++) {
System.out.println(files.get(var));
 */
public class ArrayListInt
{
    // instance variables - replace the example below with your own
    private int lista[];
    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        // initialise instance variables
        lista = new int[0];
    }

    /**
     * Metodo que añade un elemento a la lista
     */
    public void add(int elemento)
    {
        int tamaño = lista.length; //Se guarda el tamaño del array
        int posicion = 0; // Se crea un variable a 0
        if(tamaño == 0) //Si el array está vacio
        {
            lista = new int[posicion+1]; //se crea un nuevo array con una posicion mas
            lista[posicion] = elemento;//se guarda en esa posicion el elemento
            posicion++; //se aumenta la posicion
        }

        else //Si el array contiene algun elemento
        {
            int listaB[] = new int[tamaño]; //Se crea un nuevo array del tamaño del anterior
            for(int vari =0; vari<tamaño; vari++)
            {
                listaB[vari] = lista[vari]; //Cada elemento de cada posicion del primer array
                //se guarda en la misma posicion del segundo

            }
            lista = new int[listaB.length + 1];
            for(int v = 0; v<tamaño; v++)
            {
                lista[v] = listaB[v];
                lista[posicion+1] = elemento;
                posicion++;
            }

        }

    }

    /**
     * Añade un elemento a la colección en una posicion determinada por index
     */
    public void add(int index, int elemento)
    {
        if(lista.length == 0)//Si la coleccion esta vacia
        {
            if(index >= 0){
                if(index>0){
                    lista = new int[index];
                    lista[index-1] = elemento;
                }
                else
                {
                    lista = new int[index+1];
                    lista[index] = elemento;
                }
            }
            else
            {
                System.out.println("Index debe ser superior a cero");
            }
        }

        else //Si la coleccion ya tiene algun elemento
        {
            if(index > lista.length)//Si el indice es mayor que el listaero de elementos
            {
                int listaB[] = new int[lista.length+1];
                for(int i=0; i<lista.length;i++)
                {
                    listaB[i] = lista[i];
                }
                lista = listaB;
            }
            else //Si el indice es menor (hay elementos suficientes)
            {
                int listaB[] = new int[lista.length+1];
                int i = 0;
                int d = index+1;
                while(i < index)//Todos los elementos anteriores al indice se guardan en lamisma posicion
                {
                    listaB[i] = lista[i];
                    i++;
                }
                listaB[index] = elemento; //Se guarda en el indice, el elemento
                while(d < lista.length)
                {
                    listaB[d] = lista[d-1]; 
                    d++;
                }
                lista = listaB;
            }
        }
    }

    /**
     * Método que  vacia la colección
     */
    public void clear()
    {
        lista = new int[0];
    }

    /**
     * Metodo que devuelve verdadero o false en funcion de si contiene el elemento dado
     * por parametro o no
     */
    public boolean contains(int elemento)
    {
        boolean busqueda = false;
        for(int i=0; i<lista.length; i++)
        {
            if(lista[i] == elemento)
            {
                busqueda = true;
            }
        }
        return busqueda;
    }

    /**
     * Devuelve el elemento que hay en la posicion indicada, si el valor no existe
     * devuelve -1
     */
    public int get(int index)
    {
        int valor = -1;
        if(index >= 0 && index < lista.length)
        {
            valor = lista[index];
        }
        return valor;
    }

    /**
     * Metodo que reemplaza el elemento en la posicion index por el valor de element
     */
    public void set(int index, int element)
    {
        if(index >= 0 && index < lista.length)
        {
            lista[index] = element;
        }

    }

    /**
     * Metodo que vevuelve el indice en el que aparece la primera ocurrencia del 
     * elemento especificado, si no existe tal elemento devuelve -1
     */
    public int indexOf(int elemento)
    {
        int ocurrencia = -1;
        for(int i=0; i<lista.length; i++)
        {
            if(lista[i]==elemento)
            {
                ocurrencia = i; break;
            }
        }
        return ocurrencia;
    }

    /**
     * Metodo que devuelve true si la lista está vacia
     */
    public boolean isEmpty()
    {
        boolean vacia = true;
        if(lista.length > 0)
        {
            vacia = false;
        }
        return vacia;
    }

    /**
     * Metodo que elimina el elemento de la posicion especificada y lo devuelve, si
     * el valor no es valido devuelve -1
     */
    public int remove(int index)
    {
        int devuelve = -1; //Variable que devolveremos
        int posicion = 0; //Variable que usamos para guardar el elemento en listaB 
        int listaB[] = new int[lista.length-1];//Se crea un array nuevo con una posicion menos
        if(index >= 0 && index < lista.length)//Si el indice es valido
        {
            for(int i =0; i < lista.length; i++)
            {
                if( i == index)
                {
                    devuelve = lista[i];
                }
                else
                {
                    listaB[posicion] = lista[i]; //Se guarda en la posicion, el elmento i
                    posicion++;//Se aumenta la posicion.
                }
            }
            lista = listaB; //Se guarda el nuevo array en el original
        }
        return devuelve;
    }

    /**
     * Devuelve el listaero de elementos de la coleccion
     */
    public int size()
    {
        return lista.length;
    }
}
