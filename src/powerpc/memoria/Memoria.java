
package powerpc.memoria;

import java.util.HashMap;
import java.util.Map;


public class Memoria
{
    Map<Integer, Integer> celulas;

    public Memoria() {
        celulas = new HashMap();
        for(int i = 0; i < 1024; i++){
            celulas.put(i, null);
        }
    }

    public void store(int chave, Integer dado){
        System.out.println("teste: "+dado);
        System.out.println("teste: "+chave);
        celulas.replace(chave, dado);
        
    }
    public Integer ler(Integer chave){
        return(celulas.get(chave));
    }

}

