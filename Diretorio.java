/* CEDERJ
 * Tecnologia em Sistemas da Computação
 * Aluna: Tamara da Silva Teixeira Vitorino
 * Matrícula: 16213050208 | Pólo Saquarema
 */
package ad120182;


/* d) Crie uma classe chamada Diretorio. Está deverá ter campos para armazenar o
nome do diretório, um vetor de arquivos e outro vetor de diretórios (subpastas).*/
class Diretorio extends Item{
    Arquivo[] arquivos;
    Diretorio[] subpastas;     

/*e) Crie uma construtor para esta nova classe.*/
    Diretorio (String nome){
        super(nome);
        arquivos = new Arquivo[100];
        subpastas = new Diretorio[100];
    }
    
/*f) Crie um método toString de forma a retornar o conteúdo do diretório: 
    nome + lista de arquivos + lista de diretórios.  */
/*i) Altere os métodos toString para exibirem também o tamanho dos itens (para
arquivos, o tamanho do respectivo; para diretórios, a soma dos tamanhos dos
arquivos que contém e das subpastas).*/
    @Override
    public String toString() {
        String texto = "Diretório "+this.nome+":";
        if (arquivos[0] != null) {
            texto = texto +"\n    Arquivos: \n";
            int i = 0;
            while (arquivos[i] != null){
                texto = texto + "        "+ arquivos[i];
                i++;
            }
        }
        if (subpastas[0] != null) {
            texto = texto +"\n    Subpastas: ";
            int i = 0;
            while (subpastas[i] != null){
                texto = texto + "\n        "+ subpastas[i].getName() + "| Tamanho:" + subpastas[i].getSize() ;
                i++;
            }
        }
        return texto+"\n";
    }
    
    /*g) Crie um método para retornar o tamanho do diretório (soma dos tamanhos dos
    arquivos do diretório e das subpastas – busca recursiva).*/
    @Override
    double getSize(){
        double size = 0;
        if (arquivos[0] != null){
            int i = 0;
            while (arquivos[i] != null){
                size = size + arquivos[i].getSize();   /*busca recursiva*/
                i++;
            }
        }
        if (subpastas[0] != null){
            int i = 0;
            while (subpastas[i] != null){
                size = size + subpastas[i].getSize();
                i++;
            }
        }
        return size;
    }
}