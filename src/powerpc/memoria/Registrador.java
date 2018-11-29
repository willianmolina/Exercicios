
package powerpc.memoria;


import java.util.HashMap;
import java.util.Map;

public class Registrador {
   

        Memoria memoria;
        Map<Integer, Integer> celulas;

    public Registrador(Memoria memoria) {
        this.memoria = memoria;
   
  
        celulas = new HashMap();
        celulas.put(0, null);

    }

    public void load(int end2){
        if(memoria.ler(end2)!=null){
        celulas.replace(0, memoria.ler(end2));
    }
        else{
        celulas.replace(0, end2);
           
    }
    }
    
    public void load2 (int end2){
        celulas.replace(0, end2);
    }

   
    public Integer ler(){
        return(celulas.get(0));
    }
    
    
    

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public Map<Integer, Integer> getCelulas() {
        return celulas;
    }

    public void setCelulas(Map<Integer, Integer> celulas) {
        this.celulas = celulas;
    }
    
    
}
