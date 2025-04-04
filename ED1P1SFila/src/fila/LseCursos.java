/*
 * Projeto.: Lista Simplesmente Ligada/Encadeada
 * Autor...: Professor Dreco
 * Classe..: LseCursos
 * Objetivo: Criação e manutenção dos elementos na fila simplesmente encadeada
 */

package fila;

import java.util.Scanner;

/**
 *
 * @author andrel.ded
 */
public class LseCursos {
    // Objetivo: atributos de determinação do primeiro e do último elemento da
    //           fila, para que seja realizada a sua gestão
    //
    public NohCurso primeiroCurso;
    public NohCurso ultimoCurso;

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
    public Integer D_Id_Curso ()
    {
        Msg.limpatela();
            
        Scanner s = new Scanner(System.in);
        Integer cod = 0;
        String texto = "Digite o valor para o Id do Curso (inteiro maior que zero e < 1000): ";
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

        } while (cod < 1 || cod > 999);

        return cod;
    }

    // Objetivo: método para receber e tratar a digitação de um atributo dados
    //           Nome
    //
    public String D_Nome_Curso ()
    {
        Msg.limpatela();
            
        Scanner s = new Scanner(System.in);
        String nome = " ";
        String texto = "Digite o NOME do Curso (obrigatório): ";

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
                texto = "Erro de digitação, o NOME do Curso é obrigatório: ";
            }

            Msg.limpatela();
            
        } while (nome.isEmpty());

        return nome;
    }

    // Objetivo: método para receber e tratar a digitação do atributo sexo
    //           quando de uma inserção ou consulta por conteúdo
    //
    public Integer D_Status_Curso ()
    {
        Scanner s = new Scanner(System.in);
        int status  = 0;
        String texto = "Digite o valor para o STATUS do Curso (1.Ativo 2.Inativo): ";
        Integer erro = 0;

        do
        {
            Msg.limpatela();

            try
            {
                Msg.msg_pl(texto);
                status = Integer.parseInt(s.nextLine());
            }
            catch(Exception e)
            {
                texto = "Erro de digitação, o STATUS do Curso é obrigatório: ";
                erro = 1;
            }
            if((status < 1) || (status > 2) || (erro == 0))
            {
                texto = "Erro de digitação, o STATUS do Curso é obrigatório (1.Ativo 2.Inativo): ";
            }
            
            erro = 0;
        
            Msg.limpatela();

        } while ((status < 1) || (status > 2));

        return status;
    }

    // Objetivo: método para quantificar e informar a quantidade de
    //           elementos da fila, ou seja, seu tamanho
    //
    public int tamanho()
    {
        int t = 0;
        //
        // Aguarde a implementação do cálculo de tamanho da lista
        //
        return t;
    }

    // Objetivo: método para verificar se a fila está vazia (true)
    //           ou não (false)
    //
    public boolean vazia()
    {
        boolean r = true;

        if (this.primeiroCurso != null)
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
        
        NohCurso novoCurso = new NohCurso();
        
        if (novoCurso == null)
        {
            Msg.msg_pl("Memória indisponível, inserção cancelada.");
        }
        else
        {
            novoCurso.setIdCurso(this.D_Id_Curso());
            novoCurso.setNmCurso(this.D_Nome_Curso());
            novoCurso.setStCurso(this.D_Status_Curso());
            
            if (this.vazia())
            {
                this.primeiroCurso = this.ultimoCurso = novoCurso;
            }
            else
            {
                this.ultimoCurso.setProximoCurso(novoCurso);
                this.ultimoCurso = novoCurso;
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
        
    }

    // Objetivo: método para remover todos os elementos que estão
    //           presentes na fila, inicializando-a. Tornando-a vazia.
    //
    public void inicializar()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE INICIALIZAÇÃO - Aguarde implementação");
    }

    // Objetivo: método para consultar todos os elementos que estão
    //           presentes na fila
    //
    
    public void consultar_geral()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA GERAL");
        
        NohCurso auxCurso = null;
        
        int pos = 0;
        
        for (
            auxCurso = this.primeiroCurso, pos = 1;
                auxCurso != null;
                    auxCurso = auxCurso.getProximoCurso(), pos++
            )
        {
            auxCurso.mostra_noh_Curso(pos);
        }
    }

    // Objetivo: método para consultar se uma determinada posição está
    //           presente na fila e, se sim, qual elemento a ocupa
    //
    public void consultar_posicao(int posicao)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA POR POSIÇÃO - Aguarde implementação");
    }

    // Objetivo: método para consultar se um determinado elemento com conteúdo INT está
    //           presente na fila e, se sim, qual posição ele ocupa
    //
    public void consultar_conteudo_int(int conteudo)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA POR CONTEÚDO - INT - Aguarde implementação");
    }

    // Objetivo: método para consultar se um determinado elemento com conteúdo STR está
    //           presente na fila e, se sim, qual posição ele ocupa
    //
    public void consultar_conteudo_str(String conteudo)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA POR CONTEÚDO - STR - Aguarde implementação");
    }

    // Objetivo: método construtor da fila e que determina que ela
    //           está, inicialmente, vazia
    //
    public LseCursos()
    {
        this.primeiroCurso = this.ultimoCurso = null;
    }
}
