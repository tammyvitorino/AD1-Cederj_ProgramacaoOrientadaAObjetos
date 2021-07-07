/* CEDERJ
 * Tecnologia em Sistemas da Computação
 * Aluna: Tamara da Silva Teixeira Vitorino
 * Matrícula: 16213050208 | Pólo Saquarema
 */
package ad120182;

/* h)Como um diretório pode conter arquivos e diretórios, simplifique esta
implementação da seguinte maneira: implemente uma classe Item abstrata, a qual
conterá um nome (arquivo ou diretório) e um método abstrato de obtenção do
tamanho. Faça as classes Arquivo e Diretorio estenderem a classe Item, e façam
as alterações necessárias para que o programa funcione. */
class Item {
    String nome;    
    double tamanho;
//    Arquivo[] arquivos;
    
    Item(String nome) {
        this.nome = nome;
    }
    
    String getName(){
        return this.nome;
    }
    
    double getSize(){
      return this.tamanho;  
    }
}