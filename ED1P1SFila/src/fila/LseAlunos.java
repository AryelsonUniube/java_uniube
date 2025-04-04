/*
 * Projeto.: Lista Simplesmente Ligada/Encadeada
 * Autor...: Professor Dreco
 * Classe..: LseAlunos
 * Objetivo: Criação e manutenção dos elementos na fila simplesmente encadeada
 */
package fila;
import java.util.Scanner;

public class LseAlunos
{
    // Objetivo: atributos de determinação do primeiro e do último elemento da
    //           fila, para que seja realizada a sua gestão
    //
    public NohAluno primeiroAluno;
    public NohAluno ultimoAluno;
    
    // Objetivo: método para receber e tratar a digitação de um atributo dados
    //           (do tipo Object) quando de uma inserção ou consulta por conteúdo
    //
    public String digitacao (String tipo)
    {
        Scanner s = new Scanner(System.in);
        String dados = " ";

        do
        {
            Msg.limpatela();

            try
            {
                Msg.msg_pl("Digite o ["+tipo+"] para o elemento - não pode ser vazio: ");
                dados = s.nextLine();
            }
            catch(Exception e)
            {
                Msg.msg_pl ("Erro de digitação, não deixe a informação ["+tipo+"] vazia:");
            }
        } while (dados.isEmpty());

        return dados;
    }


    // Objetivo: método para receber e tratar a digitação do atributo codigo
    //           quando de uma inserção ou consulta por conteúdo
    //
    public Integer D_Id_Aluno ()
    {
        Msg.limpatela();
            
        Scanner s = new Scanner(System.in);
        Integer cod = 0;
        String texto = "Digite o valor para o Id do aluno (inteiro maior que zero): ";
        Integer erro = 0;

        do
        {
            try
            {
                Msg.msg_pl(texto);
                cod = Integer.parseInt(s.nextLine());
            }
            catch(Exception e)
            {
                texto = "Erro de digitação, o ID é obrigatório e inteiro maior que zero: ";
                erro = 1;
            }
            if((cod <= 0) && (erro == 0))
            {
                texto = "Erro de digitação, o ID é obrigatório e inteiro maior que zero: ";
            }
            erro = 0;
            Msg.limpatela();

        } while (cod <= 0);

        return cod;
    }

    // Objetivo: método para receber e tratar a digitação de um atributo dados
    //           Nome
    //
    public String D_Nome_Aluno ()
    {
        Msg.limpatela();
            
        Scanner s = new Scanner(System.in);
        String nome = " ";
        String texto = "Digite o NOME do aluno (obrigatório): ";

        do
        {
            Msg.limpatela();

            try
            {
                Msg.msg_pl(texto);
                nome = s.nextLine();
            }
            catch(Exception e)
            {
                texto = "Erro de digitação, o NOME é obrigatório: ";
            }

            Msg.limpatela();
            
        } while (nome.isEmpty());

        return nome;
    }

    // Objetivo: método para receber e tratar a digitação do atributo sexo
    //           quando de uma inserção ou consulta por conteúdo
    //
    public Integer D_Sexo_Aluno ()
    {
        Scanner s = new Scanner(System.in);
        int sexo  = 0;
        String texto = "Digite o valor para o SEXO do aluno (1.Mas 2.Fem): ";
        Integer erro = 0;

        do
        {
            Msg.limpatela();

            try
            {
                Msg.msg_pl(texto);
                sexo = Integer.parseInt(s.nextLine());
            }
            catch(Exception e)
            {
                texto = "Erro de digitação, o SEXO é obrigatório: ";
                erro = 1;
            }
            if((sexo < 1) || (sexo > 2) || (erro == 0))
            {
                texto = "Erro de digitação, o SEXO é obrigatório (1.Mas 2.Fem): ";
            }
            
            erro = 0;
        
            Msg.limpatela();

        } while ((sexo < 1) || (sexo > 2));

        return sexo;
    }

    // Objetivo: método para receber e tratar a digitação do atributo curso
    //           quando de uma inserção ou consulta por conteúdo
    //
    public Integer D_Curso_Aluno ()
    {
        Scanner s = new Scanner(System.in);
        int curso  = 0;
        String texto = "Digite o valor para o CURSO do aluno: ";
        Integer erro = 0;

        do
        {
            Msg.limpatela();
            
            try
            {
                Msg.msg_pl(texto);
                curso = Integer.parseInt(s.nextLine());
            }
            catch(Exception e)
            {
                texto = "Erro de digitação, o CURSO é obrigatório: ";
                erro = 1;
            }
            if ((curso < 1) || erro == 0)
            {
                texto = "Erro. O CURSO incorreto. Digite outro curso [1:999]: ";
            }

            erro = 0;

            Msg.limpatela();

        } while (curso < 1 || curso > 999);

        return curso;
    }

    // Objetivo: método para quantificar e informar a quantidade de
    //           elementos da fila, ou seja, seu tamanho
    //
    public int tamanho()
    {
        int t = 0;
        NohAluno auxAluno = null;
        
        for (
            auxAluno = this.primeiroAluno, t = 0;
                auxAluno != null;
                    auxAluno = auxAluno.getProximoAluno(), t++
            )
        {
            
        }
        
        //
        // Aguarde a implementação do c??lculo de tamanho da lista
        //
        return t;
    }

    // Objetivo: método para verificar se a fila está vazia (true)
    //           ou não (false)
    //
    public boolean vazia()
    {
        boolean r = true;

        if (this.primeiroAluno != null)
        {
            r = false;
        }
        
        return r;
    }

    // Objetivo: método para inserir um novo elemento no final da fila
    //
    //
    public void inserir_final()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE INSERÇÃO NO FINAL");
        
        NohAluno novoAluno = new NohAluno();
        
        if (novoAluno == null)
        {
            Msg.msg_pl("Memória indisponível, inserção cancelada.");
        }
        else
        {
            novoAluno.setIdAluno(this.D_Id_Aluno());
            novoAluno.setNmAluno(this.D_Nome_Aluno());
            novoAluno.setSxAluno(this.D_Sexo_Aluno());
            novoAluno.setIdCursoAluno(this.D_Curso_Aluno());
            
            if (this.vazia())
            {
                this.primeiroAluno = this.ultimoAluno = novoAluno;
            }
            else
            {
                this.ultimoAluno.setProximoAluno(novoAluno);
                this.ultimoAluno = novoAluno;
            }
        }
    } 

    // Objetivo: método para remover um elemento da primeira posição
    //           da fila
    //
    public void remover_inicio()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE REMOÇÃO NO INÍCIO - Aguarde implementação");
        
        NohAluno liberar = this.primeiroAluno;
        this.primeiroAluno = this.primeiroAluno.getProximoAluno();
        liberar.setProximoAluno(null);
        liberar.mostra_noh_Aluno(1);
        if (this.primeiroAluno == null) {
            this.ultimoAluno = null;
            
        }
        System.gc();
    }

    // Objetivo: método para remover todos os elementos que estáo
    //           presentes na fila, inicializando-a. Tornando-a vazia.
    //
    public void inicializar()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE INICIALIZAÇÃO - Aguarde implementação");
        do {            
            NohAluno liberar = this.primeiroAluno;
        this.primeiroAluno = this.primeiroAluno.getProximoAluno();
        liberar.setProximoAluno(null);
        } while (this.primeiroAluno != null);
        
        this.ultimoAluno = null;
        System.gc();
        
    }

    // Objetivo: método para consultar todos os elementos que estáo
    //           presentes na fila
    //
    
    public void consultar_geral()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA GERAL");
        
        NohAluno auxAluno = null;
        
        int pos = 0;
        
        for (
            auxAluno = this.primeiroAluno, pos = 1;
                auxAluno != null;
                    auxAluno = auxAluno.getProximoAluno(), pos++
            )
        {
            auxAluno.mostra_noh_Aluno(pos);
        }
    }

    // Objetivo: método para consultar se uma determinada posição está
    //           presente na fila e, se sim, qual elemento a ocupa
    //
    public void consultar_posicao(int posicao)
    {
        Msg.limpatela();
        Msg.msg_central("PROCESSO DE CONSULTA POR POSIÇÃO - Aguarde implementação");

        NohAluno auxAluno = null;
        
        int pos = 0;

        for(auxAluno = this.primeiroAluno, pos = 1; (auxAluno != null) && (pos !=posicao);
                auxAluno = auxAluno.getProximoAluno(), pos++) {
        }
        if (auxAluno == null) {
            System.out.println("A posiçao["+posicao+"] não existe");
        } else {
            auxAluno.mostra_noh_Aluno(pos);
        }
    }

    // Objetivo: método para consultar se um determinado elemento com conteúdo INT está
    //           presente na fila e, se sim, qual posição ele ocupa
    //
    public void consultar_conteudo_int(int conteudo)
    {
        Msg.limpatela();
        Msg.msg_central("PROCESSO DE CONSULTA POR CONTEÚDO - INT - Aguarde implementação");

        NohAluno auxAluno = null;
        int pos = 0;
        int conteudo_int = 0;

        for(auxAluno = this.primeiroAluno,pos =0, conteudo_int = auxAluno.getIdAluno(); (auxAluno != null) && (conteudo_int != conteudo);
                auxAluno = auxAluno.getProximoAluno(), conteudo_int = auxAluno.getIdAluno(),pos++) {
                    
        }
        if (auxAluno == null) {
            System.out.println("O objeto do conteudo["+conteudo+"] não existe");
        } else {
            auxAluno.mostra_noh_Aluno(pos);
        }
    }

    // Objetivo: método para consultar se um determinado elemento com conteúdo STR está
    //           presente na fila e, se sim, qual posição ele ocupa
    //
    public void consultar_conteudo_str(String conteudo)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA POR CONTEÚDO - STR - Aguarde implementação");
        
        NohAluno auxAluno = null;
        int pos = 0;
        String conteudo_str = null;

        for(auxAluno = this.primeiroAluno,pos =1 , conteudo_str = auxAluno.getNmAluno(); (auxAluno != null) && (!conteudo_str.equalsIgnoreCase(conteudo));
                auxAluno = auxAluno.getProximoAluno(), conteudo_str = auxAluno.getNmAluno(),pos++) {
                    
        }
        if (auxAluno == null) {
            System.out.println("O objeto do conteudo["+conteudo+"] não existe");
        } else {
            auxAluno.mostra_noh_Aluno(pos);
        }
    }

    // Objetivo: método construtor da fila e que determina que ela
    //           está, inicialmente, vazia
    //
    public LseAlunos()
    {
        this.primeiroAluno = this.ultimoAluno = null;
    }
}