
package ProyectoInterface;
public class miPrimerIntento < T extends Comparable> implements miEstructura {

//atributos
    Comparable arreglo[]=new Comparable[6] ;
    int numeroElementos=0;
    
//constructor
    public miPrimerIntento(int numeroElementos){
        this.numeroElementos=numeroElementos;
        
    }

 
//funcion insertar recibe: un elemento de tipo generico
    public void insertar(Comparable elemento) {
        int n=arreglo.length;
        try{
            if(numeroElementos>=n)
                expandCapacity();
            
             arreglo[numeroElementos]=elemento;
             numeroElementos++;
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
   }

    

    private void expandCapacity(){
        Comparable[] auxiliar=new Comparable[arreglo.length*2];
        int i,n;
        n=arreglo.length;

        for(i=0;i<n;i++){
            auxiliar[i]=arreglo[i];
       }
        arreglo=auxiliar;
    }

    public boolean borrar(Comparable elemento) {
        boolean resp = false;
       Comparable pos;

        try{
            pos=buscar(elemento);
            if(pos!=-1){
                arreglo[(int)pos]=null;
                resp=true;
            }
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
        return resp;
    }

    public int buscar(Comparable elemento) throws miExcepcion {
       int pos=-1;
       int i=0;
       try{
           while(i<numeroElementos && !arreglo[i].equals(elemento)){
              i++;               
           }
            if(i<numeroElementos)
               pos=i;
       }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
        return  pos;
    }

    
public static void main(String[] args){
    miPrimerIntento m=new miPrimerIntento(5);
    Comparable elemento="hola";
   
    
try{
   m.insertar(elemento);

   m.buscar(elemento);

   m.borrar(elemento);
}catch(Exception e){
    System.out.println("Error"+e.toString());
}


   
  }

   

      

}