
package powerpc.memoria;


public class Ula {
    private String instrucao;


    public Ula() {
        
        instrucao = "";

    }
    public Integer add(Registrador r1, Registrador r2 ){
        int end1 = (r1.ler() + r2.ler());
        return end1;
    }
    
    public Integer sub(Registrador r1, Registrador r2 ){
        int end1 = (r1.ler() - r2.ler());
        return end1;
    }
        
    public Integer mult(Registrador r1, Registrador r2 ){
        int end1 = (r1.ler() * r2.ler());
        return end1;
    }
    
    public Integer div(Registrador r1, Registrador r2 ){
        int end1 = (r1.ler()) / (r2.ler());
        return end1;
    }
    
    public String getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(String instrucao) {
        this.instrucao = instrucao;
    }


    
}
