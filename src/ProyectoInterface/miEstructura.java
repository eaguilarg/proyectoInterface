
package ProyectoInterface;
public interface miEstructura <T extends Comparable<T>> {
    public void insertar(T elem);
    public boolean borrar(T elem);
    public int buscar (T elem)throws miExcepcion;
    
    
} 
    
    
    
    
 