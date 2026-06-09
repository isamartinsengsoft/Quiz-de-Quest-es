// Classe cabeçalho

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

    public static void main(String[] args) {

        Cabecalho cabecalho = new Cabecalho(
                "Nome da Faculdade",
                "Nome do Aluno",
                "Nome do Professor",
                "Tema do Trabalho"
        );
        cabecalho.exibirCabecalho();
    }
}


// Classe Questões

mport java.util.Scanner;

public class Questao {

    String pergunta = "";
    String opcaoA = "";
    String opcaoB = "";
    String opcaoC = "";
    String opcaoD = "";
    String opcaoE = "";
    String correta = "";

    public Questao(String pergunta, String opcaoA, String opcaoB,
                   String opcaoC, String opcaoD, String opcaoE, String correta) {

        this.pergunta = pergunta;
        this.opcaoA = opcaoA;
        this.opcaoB = opcaoB;
        this.opcaoC = opcaoC;
        this.opcaoD = opcaoD;
        this.opcaoE = opcaoE;
        this.correta = correta;
    }


    public boolean isCorreta(String resposta) {

        if (resposta.equalsIgnoreCase(this.correta)) {

            System.out.println("Parabéns! Resposta correta! - Letra: " + this.correta);
            System.out.println("");

            return true;

        } else {

            System.out.println("Resposta errada!");
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


    private boolean respostaValida(String resp) {

        if (resp.equalsIgnoreCase("A") ||
                resp.equalsIgnoreCase("B") ||
                resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") ||
                resp.equalsIgnoreCase("E")) {

            return true;
        }


        System.out.println("Resposta inválida! Digite A, B, C, D ou E.");
        System.out.println("");

        return false;
    }


    public void escrevaQuestao() {

        System.out.println(pergunta);
        System.out.println();

        System.out.println(opcaoA);
        System.out.println(opcaoB);
        System.out.println(opcaoC);
        System.out.println(opcaoD);
        System.out.println(opcaoE);

        System.out.println();
    }
}


// Classe principal 

/Quiz-Questões:

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Questao[] quiz = new Questao[15];


        quiz[0] = new Questao(
                "O que é um Sistema Operacional?",
                "A) Componentes que gerencia os componentes e fornece programas para o usuário.",
                "B) É o tipo de linguagem utilizada nas máquinas.",
                "C) É um programa de aplicação que realiza tarefas específicas para o usuário.",
                "D) São compiladores de comandos utilizados para execução de programas.",
                "E) É uma parte física do computador onde são armazenados dados e programas.",
                "A"
        );


        quiz[1] = new Questao(
                "O que foi a 1º Geração de computadores?",
                "A) Equipamentos para uso cotidiano.",
                "B) Usavam linguagem FORTRAN ou de Montagem.",
                "C) Usavam circuitos elétricos e válvulas.",
                "D) Não tinham necessidade de locais espaçosos.",
                "E) Foram desenvolvidas linguagens de programação.",
                "C"
        );


        quiz[2] = new Questao(
                "O que foi a 2º Geração de computadores?",
                "A) Não utilizavam sistemas operacionais.",
                "B) Trocaram as válvulas por transistores.",
                "C) As linguagens não eram processadas.",
                "D) Já eram usados como computadores pessoais.",
                "E) Pequenas empresas conseguiam comprar.",
                "B"
        );


        quiz[3] = new Questao(
                "O que foi a 3º Geração de computadores?",
                "A) Usavam circuitos integrados.",
                "B) Usavam transistores.",
                "C) Usavam válvulas.",
                "D) Não precisavam de locais grandes.",
                "E) Não utilizavam sistemas operacionais.",
                "A"
        );


        quiz[4] = new Questao(
                "O que foi a 4º Geração de computadores?",
                "A) Equipamentos grandes que ocupavam muito espaço.",
                "B) Começaram os microcomputadores - computadores pessoais.",
                "C) Eram equipamentos específicos.",
                "D) Ainda usavam válvulas e transistores.",
                "E) Não utilizavam sistemas operacionais.",
                "B"
        );


        quiz[5] = new Questao(
                "Qual destes é um sistema operacional?",
                "A) Windows.",
                "B) Linux.",
                "C) Android.",
                "D) iOS.",
                "E) Todas as alternativas estão corretas.",
                "E"
        );


        quiz[6] = new Questao(
                "O que é um software?",
                "A) É um programa de aplicação que realiza tarefas específicas para o usuário.",
                "B) Componentes que gerenciam os componentes e fornecem programas para o usuário.",
                "C) É o tipo de linguagem utilizada nas máquinas.",
                "D) São compiladores de comandos utilizados para execução de programas.",
                "E) É uma parte física do computador onde são armazenados dados e programas.",
                "A"
        );


        quiz[7] = new Questao(
                "O que é um hardware?",
                "A) É um programa de aplicação que realiza tarefas específicas para o usuário.",
                "B) Componentes que gerenciam os componentes e fornecem programas para o usuário.",
                "C) É o tipo de linguagem utilizada nas máquinas.",
                "D) São compiladores de comandos utilizados para execução de programas.",
                "E) É uma parte física do computador onde são armazenados dados e programas.",
                "E"
        );


        quiz[8] = new Questao(
                "O que é um computador pessoal?",
                "A) Equipamentos para uso cotidiano.",
                "B) Usavam linguagem FORTRAN ou de Montagem.",
                "C) Usavam circuitos elétricos e válvulas.",
                "D) Não tinham necessidade de locais espaçosos e com ventilação adequada.",
                "E) Foram desenvolvidas linguagens de programação.",
                "A"
        );


        quiz[9] = new Questao(
                "O que é um computador de grande porte?",
                "A) Equipamentos para uso cotidiano.",
                "B) Usavam linguagem FORTRAN ou de Montagem.",
                "C) Usavam circuitos elétricos e válvulas.",
                "D) Necessitavam de locais espaçosos e com ventilação adequada.",
                "E) Foram desenvolvidas linguagens de programação.",
                "D"
        );


        quiz[10] = new Questao(
                "O que é um supercomputador?",
                "A) Equipamentos para uso cotidiano.",
                "B) Usavam linguagem FORTRAN ou de Montagem.",
                "C) Computadores com alta capacidade de processamento.",
                "D) Não tinham necessidade de locais espaçosos.",
                "E) Foram desenvolvidas linguagens de programação.",
                "C"
        );


        quiz[11] = new Questao(
                "O que é um mainframe?",
                "A) Equipamentos para uso cotidiano.",
                "B) Computadores de grande porte usados para grande volume de dados.",
                "C) Usavam circuitos elétricos e válvulas.",
                "D) Não tinham necessidade de locais espaçosos.",
                "E) Foram desenvolvidas linguagens de programação.",
                "B"
        );


        quiz[12] = new Questao(
                "O que é um computador pessoal?",
                "A) Equipamentos destinados ao uso individual e cotidiano.",
                "B) Usavam linguagem FORTRAN ou de Montagem.",
                "C) Usavam circuitos elétricos e válvulas.",
                "D) Eram computadores de grande porte.",
                "E) Foram desenvolvidas linguagens de programação.",
                "A"
        );


        quiz[13] = new Questao(
                "O que é um computador de grande porte?",
                "A) Equipamentos para uso cotidiano.",
                "B) Computadores pequenos para uso doméstico.",
                "C) Usavam circuitos elétricos e válvulas.",
                "D) Computadores capazes de processar grande quantidade de dados.",
                "E) Foram desenvolvidas linguagens de programação.",
                "D"
        );


        quiz[14] = new Questao(
                "O que é um supercomputador?",
                "A) Equipamentos para uso cotidiano.",
                "B) Usavam linguagem FORTRAN ou de Montagem.",
                "C) Computadores com enorme capacidade de processamento.",
                "D) Não tinham necessidade de locais específicos.",
                "E) Computadores usados somente para tarefas simples.",
                "C"
        );

/ Quiz- Finalização : 

import java.util.Scanner;

        public class Principal {

            public static void main(String[] args) {

                Scanner ler = new Scanner(System.in);

                Questao[] quiz = new Questao[15];


                // Aqui ficam suas 15 questões


                int acertos = 0;


                System.out.println("===== QUIZ DE COMPUTAÇÃO =====");
                System.out.println();


                for (int i = 0; i < quiz.length; i++) {

                    System.out.println("Questão " + (i + 1));
                    System.out.println("----------------------------");


                    quiz[i].escrevaQuestao();


                    String resposta = quiz[i].leiaResposta();


                    if (quiz[i].isCorreta(resposta)) {

                        acertos++;

                    }

                }


                double media = (acertos * 10.0) / quiz.length;


                System.out.println("============================");
                System.out.println("RESULTADO FINAL");
                System.out.println("============================");

                System.out.println("Quantidade de questões: " + quiz.length);

                System.out.println("Questões acertadas: " + acertos);

                System.out.printf("Média de acertos: %.2f%n", media);


                System.out.println();

                if (acertos == quiz.length) {

                    System.out.println("Parabéns! Você acertou todas as questões!");

                } else if (acertos >= 8) {

                    System.out.println("Muito bom! Continue estudando.");

                } else {

                    System.out.println("Continue praticando para melhorar seus resultados.");

                }


                System.out.println();

                System.out.println("Obrigado por participar do quiz!");


                ler.close();

            }
        }
