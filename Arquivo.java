/* CEDERJ
 * Tecnologia em Sistemas da Computação
 * Aluna: Tamara da Silva Teixeira Vitorino
 * Matrícula: 16213050208 | Pólo Saquarema
 */
package ad120182;


class Arquivo extends Item {
    String extensao;
    double tamanho;
  
    /*a) Crie um construtor para classe.*/
    Arquivo (String nome, String aExtensao, double aTamanho){
    super(nome);
    extensao = aExtensao; 
    tamanho = aTamanho;
    }
    
    /*b) Crie um método toString, redefinido da classe Object, de forma a retornar 
    o nome do arquivo (concatenação do nome + . + extensão) e seu tamanho.*/
    String getName(){
        return this.nome+"."+this.extensao;
    }
    
    @Override
    public String toString() {
        return this.getName()+" | "+"Tamanho: "+this.getSize()+"\n";        
    }
   
     /*c) Crie um método para retornar o tamanho do arquivo.*/
    @Override
    double getSize() {
       return this.tamanho;
   }
}
