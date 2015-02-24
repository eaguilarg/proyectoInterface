
package ProyectoInterface;


public class miExcepcion extends Exception {
    public miExcepcion(String msg){
        super(msg+"en la estructura");
    }
    
   public void nada(int i) throws Exception{
       if(i==0)
           System.out.println("Todo bien");
       else
           throw new miExcepcion("prueba1");
   } 
   
   public static void main(String[] args){
       //miPrimerIntento m= new miPrimerIntento();
        try {
         //   m.nada(0);
        } catch (Exception ex) {
            System.out.println("No hay error");
        }
   }
   
    
    
}
