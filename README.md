//Cabeçalho do código
public class Cabecalho {

    private String faculdade;
    private String aluno;
    private String professor;
    private String tema;

    public Cabecalho(String faculdade, String aluno, String professor, String tema) {
        this.faculdade = faculdade;
        this.aluno = aluno;
        this.professor = professor;
        this.tema = tema;
    }

    public void exibirCabecalho() {
        System.out.println("===== CABEÇALHO =====");
        System.out.println("Faculdade: " + faculdade);
        System.out.println("Aluno: " + aluno);
        System.out.println("Professor: " + professor);
        System.out.println("Tema: " + tema);
        System.out.println("=====================");
    }
}

// Classe de Questões
import java.util.Scanner;

public class Questao {
    String pergunta = "";
    String opcaoA = "";
    String opcaoB = "";
    String opcaoC = "";
    String opcaoD = "";
    String opcaoE = "";
    String correta = "";

    public boolean isCorreta(String resposta){
        if(resposta.equalsIgnoreCase(this.correta)){
            System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
            System.out.println("");
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println("");
            return false;
        }
    }

    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    private boolean respostaValida(String resp){
        if(resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")){
            return true;
        }
        System.out.println("Resposta inválida! Digite opção A, B, C, D ou E. ");
        System.out.println("");
        return false;
    }

    public void escrevaQuestao(){
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println(this.opcaoA);
        System.out.println(this.opcaoB);
        System.out.println(this.opcaoC);
        System.out.println(this.opcaoD);
        System.out.println(this.opcaoE);
        System.out.println();
    }
}

int [ ] quiz = new quiz [15];

quiz[0] = new Questao();
quiz[0].pergunta = "O que é um Sistema Operacional?";
quiz[0].opcaoA = "A) Componentes que gerencia os componentes e fornecer programas para o usuário.";
quiz[0].opcaoB = "B) É o tipo de linguagem utilizada nas maquinas. ";
quiz[0].opcaoC = "C) É um programa de aplicação que tem a função de realizar tarefas específicas para o usuário.";
quiz[0].opcaoD = "D) São os compiladores de comandos utilizados para a execução de programas.";
quiz[0].opcaoE = "E) É uma parte física do computador, onde são armazenados os dados e programas.";
quiz[0].correta = "A";

quiz[1] = new Questao();
quiz[1].pergunta = "O que foi a 1º Geração de computadores?";
quiz[1].opcaoA = "A) Equipamentos para uso cotidiano.";
quiz[1].opcaoB = "B) Usavam linguagem FORTRAN ou de Montagem. ";
quiz[1].opcaoC = "C) Usavam circuitos elétricos e válvulas.";
quiz[1].opcaoD = "D) Não tinham a necessidade de locais espaçosos e com ventilação adequada.";
quiz[1].opcaoE = "E) Foi desenvolvido as linguagens de programação.";
quiz[1].correta = "C";

quiz[2] = new Questao();
quiz[2].pergunta = "O que foi a 2º Geração de computadores?";
quiz[2].opcaoA = "A) Não utilizavam sistemas operacionais ";
quiz[2].opcaoB = "B) Trocaram as valvulas por transistores.";
quiz[2].opcaoC = "C) As linguagens não eram escritas a mão antes de serem processadas.";
quiz[2].opcaoD = "D) Ja eram usados como computadores pessoais.";
quiz[2].opcaoE = "E) Pequenas empresas conseguiam comprar.";
quiz[2].correta = "B";

quiz[3] = new Questao();
quiz[3].pergunta = "O que foi a 3º Geração de computadores?";
quiz[3].opcaoA = "A) Usavam circuitos integrados.";
quiz[3].opcaoB = "B) Usavam transistores.";
quiz[3].opcaoC = "C) Usavam válvulas.";
quiz[3].opcaoD = "D) Não tinham a necessidade de locais espaçosos e com ventilação adequada.";
quiz[3].opcaoE = "E) Não utilizavam sistemas operacionais.";
quiz[3].correta = "A";

quiz[4] = new Questao();
quiz[4].pergunta = "O que foi a 4º Geração de computadores?";
quiz[4].opcaoA = "A) Equipamentos grandes, tinham necessidade de locais espaçosos.";
quiz[4].opcaoB = "B) Começaram a produzir os microcomputadores - computadores pessoaos.";
quiz[4].opcaoC = "C) Eram equipamentos para uso especificos";
quiz[4].opcaoD = "D) Ainda usavam valvulas e transitores para funcionar.";
quiz[4].opcaoE = "E) Não utilizavam sistemas operacionais.";
quiz[4].correta = "B";

quiz[5] = new Questao();
quiz[5].pergunta = "Qual destes é um sistema operacional?";
quiz[5].opcaoA = "A) Windows.";
quiz[5].opcaoB = "B) Linux.";
quiz[5].opcaoC = "C) Android."; 
quiz[5].opcaoD = "D) iOS.";
quiz[5].opcaoE = "E) Todas as alternativas estão corretas.";
quiz[5].correta = "E";

quiz[6] = new Questao();
quiz[6].pergunta = "O que é um software?";
quiz[6].opcaoA = "A) É um programa de aplicação que tem a função de realizar tarefas específicas para o usuário.";
quiz[6].opcaoB = "B) Componentes que gerencia os componentes e fornecer programas para o usuário.";
quiz[6].opcaoC = "C) É o tipo de linguagem utilizada nas maquinas. ";
quiz[6].opcaoD = "D) São os compiladores de comandos utilizados para a execução de programas.";
quiz[6].opcaoE = "E) É uma parte física do computador, onde são armazenados os dados e programas.";
quiz[6].correta = "A";

quiz[7] = new Questao();
quiz[7].pergunta = "O que é um hardware?";
quiz[7].opcaoA = "A) É um programa de aplicação que tem a função de realizar tarefas específicas para o usuário.";
quiz[7].opcaoB = "B) Componentes que gerencia os componentes e fornecer programas para o usuário.";
quiz[7].opcaoC = "C) É o tipo de linguagem utilizada nas maquinas. ";
quiz[7].opcaoD = "D) São os compiladores de comandos utilizados para a execução de programas.";
quiz[7].opcaoE = "E) É uma parte física do computador, onde são armazenados os dados e programas.";
quiz[7].correta = "E";

quiz[8] = new Questao();
quiz[8].pergunta = "O que é um computador pessoal?";
quiz[8].opcaoA = "A) Equipamentos para uso cotidiano.";
quiz[8].opcaoB = "B) Usavam linguagem FORTRAN ou de Montagem. ";
quiz[8].opcaoC = "C) Usavam circuitos elétricos e válvulas.";
quiz[8].opcaoD = "D) Não tinham a necessidade de locais espaçosos e com ventilação adequada.";
quiz[8].opcaoE = "E) Foi desenvolvido as linguagens de programação.";
quiz[8].correta = "A";

quiz[9] = new Questao();
quiz[9].pergunta = "O que é um computador de grande porte?";
quiz[9].opcaoA = "A) Equipamentos para uso cotidiano.";
quiz[9].opcaoB = "B) Usavam linguagem FORTRAN ou de Montagem. ";
quiz[9].opcaoC = "C) Usavam circuitos elétricos e válvulas.";
quiz[9].opcaoD = "D) Não tinham a necessidade de locais espaçosos e com ventilação adequada.";
quiz[9].opcaoE = "E) Foi desenvolvido as linguagens de programação.";
quiz[9].correta = "D";  

quiz[10] = new Questao();
quiz[10].pergunta = "O que é um supercomputador?";
quiz[10].opcaoA = "A) Equipamentos para uso cotidiano.";
quiz[10].opcaoB = "B) Usavam linguagem FORTRAN ou de Montagem. ";
quiz[10].opcaoC = "C) Usavam circuitos elétricos e válvulas.";
quiz[10].opcaoD = "D) Não tinham a necessidade  de locais espaçosos e com ventilação adequada.";
quiz[10].opcaoE = "E) Foi desenvolvido as linguagens de programação.";
quiz[10].correta = "C"; 

quiz[11] = new Questao();
quiz[11].pergunta = "O que é um mainframe?";
quiz[11].opcaoA = "A) Equipamentos para uso cotidiano.";                    
quiz[11].opcaoB = "B) Usavam linguagem FORTRAN ou de Montagem. ";
quiz[11].opcaoC = "C) Usavam circuitos elétricos e válvulas.";
quiz[11].opcaoD = "D) Não tinham a necessidade de locais espaçosos e com ventilação adequada.";
quiz[11].opcaoE = "E) Foi desenvolvido as linguagens de programação.";
quiz[11].correta = "B"; 

quiz[12] = new Questao();
quiz[12].pergunta = "O que é um computador pessoal?";
quiz[12].opcaoA = "A) Equipamentos para uso cotidiano.";
quiz[12].opcaoB = "B) Usavam linguagem FORTRAN ou de Montagem. ";
quiz[12].opcaoC = "C) Usavam circuitos elétricos e válvulas.";
quiz[12].opcaoD = "D) Não tinham a necessidade de locais espaçosos e com ventilação adequada.";
quiz[12].opcaoE = "E) Foi desenvolvido as linguagens de programação.";
quiz[12].correta = "A"; 

quiz[13] = new Questao();
quiz[13].pergunta = "O que é um computador de grande porte?";
quiz[13].opcaoA = "A) Equipamentos para uso cotidiano.";
quiz[13].opcaoB = "B) Usavam linguagem FORTRAN ou de Montagem. ";
quiz[13].opcaoC = "C) Usavam circuitos elétricos e válvulas.";
quiz[13].opcaoD = "D) Não tinham a necessidade de locais espaçosos e com ventilação adequada.";
quiz[13].opcaoE = "E) Foi desenvolvido as linguagens de programação.";
quiz[13].correta = "D"; 

quiz[14] = new Questao();
quiz[14].pergunta = "O que é um supercomputador?";
quiz[14].opcaoA = "A) Equipamentos para uso cotidiano.";
quiz[14].opcaoB = "B) Usavam linguagem FORTRAN ou de Montagem. ";
quiz[14].opcaoC = "C) Usavam circuitos elétricos e válvulas.";
quiz[14].opcaoD = "D) Não tinham a necessidade de locais espaçosos e com ventilação adequada.";
quiz[14].opcaoE = "E) Foi desenvolvido as linguagens de programação.";
quiz[14].correta = "C"; 
