/* CEDERJ
 * Tecnologia em Sistemas da Computação
 * Aluna: Tamara da Silva Teixeira Vitorino
 * Matrícula: 16213050208 | Pólo Saquarema
 */
package ad120182;

public class Ad120182 {

    public static void main(String[] args) {
        
    /*j) Crie um código de teste*/
        // Instancia diretórios
        Diretorio diretorioPOO = new Diretorio("POO");
        Diretorio diretorioAPs = new Diretorio("APs");
        Diretorio diretorioADs = new Diretorio("ADs");

        // Vincula subpastas aos respectivos diretórios
        diretorioPOO.subpastas[0] = diretorioAPs;
        diretorioPOO.subpastas[1] = diretorioADs;
        
        // Instancia arquivos Arquivo
        Arquivo arquivo1 = new Arquivo("Ad1-gabarito","pdf",1230.21);
        Arquivo arquivo2 = new Arquivo("Ad1","odt",500.72);
        Arquivo arquivo3 = new Arquivo("Ap1-gabarito","pdf",682.25);
        Arquivo arquivo4 = new Arquivo("Ap1","odt",315.86);
        
        // Vincula arquivos aos seus respectivos diretórios
        diretorioADs.arquivos[0] = arquivo1;
        diretorioADs.arquivos[1] = arquivo2;
        diretorioAPs.arquivos[0] = arquivo3;
        diretorioAPs.arquivos[1] = arquivo4;

        // Teste saídas conteúdos dos Diretórios
        System.out.println(diretorioPOO);
        System.out.println(diretorioAPs);
        System.out.println(diretorioADs);
        
        // Teste saídas dos Arquivos
        System.out.println(arquivo1);
        System.out.println(arquivo2);
        System.out.println(arquivo3);
        System.out.println(arquivo4);

      }
}