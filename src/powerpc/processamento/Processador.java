
package powerpc.processamento;


public class Processador {
    
    private String endereco;
    private String instrucao;
    private int contador;
    private String modEnd;

    public Processador(String endereco, String instrucao, int contador, String modEnd) {
        this.endereco = endereco;
        this.instrucao = instrucao;
        this.contador = contador;
        this.modEnd = modEnd;
    }
    
    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(String instrucao) {
        this.instrucao = instrucao;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getModEnd() {
        return modEnd;
    }

    public void setModEnd(String modEnd) {
        this.modEnd = modEnd;
    }
    
    
    
    
}
