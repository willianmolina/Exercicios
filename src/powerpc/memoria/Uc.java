
package powerpc.memoria;

public class Uc {
     private String instrucao;
     private Memoria memoria;
     private Ula ula;
     
     
    public Uc(Memoria memoria) {
        this.memoria = memoria;
        this.ula = new Ula();
        this.instrucao = "";
    }
     

public void interpretador(String instrucao, Registrador r1, Registrador r2, Registrador r3){
    if(instrucao.equals("add")){
        r1.load2(ula.add(r2, r3));
    }
    if(instrucao.equals("sub")){
        r1.load2(ula.sub( r2, r3));
    }
    if(instrucao.equals("mult")){
        r1.load2(ula.mult( r2, r3));
    }
    if(instrucao.equals("div")){
        r1.load2(ula.div( r2, r3));
    }
}


public void interpretador(String instrucao,int end2, Registrador r1){
    if(instrucao.equals("load")){
        r1.load(end2);
    }
    else if(instrucao.equals("store")){
            
        memoria.store(end2, r1.ler());

    }
    }

    public String getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(String instrucao) {
        this.instrucao = instrucao;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }


}


