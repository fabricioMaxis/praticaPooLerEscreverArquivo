/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticaarquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author fabricio.pereira
 */
public class PraticaArquivo {


    public static void main(String[] args) throws FileNotFoundException  {
    
        File file = new File("Arquivo teste");
        file.mkdir();
        
        File arquivo = new File("arquivo.txt");
        
        try{
            arquivo.createNewFile();
                    
                    FileWriter fileWriter = new FileWriter(arquivo);                    
                    BufferedWriter escrever = new BufferedWriter(fileWriter);
                    escrever.write("“De onde viemos? Para onde vamos?”, pergunta o filósofo…\n" +
                                    "“Lá tem Internet?”, pergunta o programador.\n" +
                                    "“Uma caminhada de mil léguas começa com o primeiro passo”, diz o filósofo…\n" +
                                    "“int main0{”, diz o programador.\n" +
                                    "“É melhor ser iludido por sonhos, do que ser iludido por não sonhar.” - diz o filósofo…\n" +
                                    "“Tomara que não descubram esse bug! ” - programador.\n" +
                                    "“Nada é tão ruim que não possa piorar”, diz o filósofo.\n" +
                                    "“Tava funcionando lá em casa...”, diz o programador.");
                    
                    escrever.close();
                    fileWriter.close();

                    FileReader ler = new FileReader(arquivo);
                    BufferedReader lerb = new BufferedReader(ler);
                    String linha = lerb.readLine();
              while(linha != null){
              
                  System.out.println(linha);
                  linha = lerb.readLine();
              }      
 
        }
            catch(IOException ex){
        }  
           
           
         
    }
          
}