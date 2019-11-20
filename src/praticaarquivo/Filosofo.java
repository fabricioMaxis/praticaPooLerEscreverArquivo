/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticaarquivo;

/**
 *
 * @author fabricio.pereira
 */
public class Filosofo {
    private String linha;
    
    
    public Filosofo(){
    super();
    }

    public Filosofo(String linha) {
        this.linha = linha;
    }

    Filosofo(int parseInt, String info, String info0, int parseInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    @Override
    public String toString() {
        return "Filosofo{" + "linha=" + linha + '}';
    }
}
