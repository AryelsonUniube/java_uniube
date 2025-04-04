/* Projeto...: Lista Simplesmente Ligada
 * Autor.....: Professor Dreco
 * Biblioteca: NohCurso
 * Classe....: NohCurso
 * Objetivo..: Criação do nó (elemento) que será utilizado nos projetos
 */
package fila;

public class NohCurso {
    // Objetivo: atributo de determinação do objeto para servir de referência
    //           no armazenamento dos dados de um elemento da lista
    //
    private Integer idCurso;
    private String  nmCurso;
    private Integer stCurso;
    
    // Objetivo: atributo de determinação do objeto para expressar a ligação
    //           do elemento para um outr elemento da lista
    //
    private NohCurso proximoCurso;
    
    // Objetivo: método para registrar o preenchimento do atributo
    //           de ligação de um elemento da lista a outro elemento
    //
    public void setProximoCurso(NohCurso proximoCurso)
    {
        this.proximoCurso = proximoCurso;
    }

    // Objetivo: método para registrar as informações do atributo de
    //           codigo de um elemento da lista
    //
    public void setIdCurso (Integer idCurso)
    {
        this.idCurso = idCurso;
    }

    // Objetivo: método para registrar as informações do atributo de
    //           nmCurso de um elemento da lista
    //
    public void setNmCurso(String nmCurso)
    {
        this.nmCurso = nmCurso;
    }

    // Objetivo: método para registrar as informações do atributo de
    //           stCurso de um elemento da lista
    //
    public void setStCurso(Integer stCurso)
    {
        this.stCurso = stCurso;
    }

    // Objetivo: método para buscar informações sobre o atributo de
    //           ligação do elemento atual a um outro da lista
    //
    public NohCurso getProximoCurso()
    {
        return proximoCurso;
    }

    // Objetivo: método para buscar informações sobre o atributo
    //           codigo do elemento atual
    //
    public Integer getIdCurso()
    {
        return idCurso;
    }

    // Objetivo: método para buscar informações sobre o atributo
    //           nmCurso do elemento atual
    //
    public String getNmCurso()
    {
        return nmCurso;
    }

    // Objetivo: método para buscar informações sobre o atributo
    //           stCurso do elemento atual
    //
    public Integer getStCurso()
    {
        return stCurso;
    }

    // Objetivo: método para mostrar os dados de um elemento
    //
    //
    public void mostra_noh_Curso (int posicao)
    {
        if (posicao == 1)
        {
            System.out.println();
            System.out.println("+----------------------------------------------------------------------------------------------------------+");
            System.out.println("|                                                  CURSOS                                                  |");
            System.out.println("+----------------------------------------------------------------------------------------------------------+");
            System.out.println("+---------+----------+--------------------------------+--------+----------+--------------------------------+");
            System.out.println("| Posicao | Id       | Nome                           | Status | Próximo  | Nome do Próximo                |");
            System.out.println("+---------+----------+--------------------------------+--------+----------+--------------------------------+");
        }
        if (this.getProximoCurso() == null)
        {
            System.out.format ("| %7d | %8d | %-30s |    %1d   |     null | - - - - - - - - - - - - - - -  |",
                posicao, this.getIdCurso(), this.getNmCurso(), this.getStCurso());
            System.out.println();
        }
        else
        {
            System.out.format ("| %7d | %8d | %-30s |    %1d   | %8d | %-30s |",
                posicao, this.getIdCurso(), this.getNmCurso(), this.getStCurso(),
                this.getProximoCurso().getIdCurso(), this.getProximoCurso().getNmCurso());
            System.out.println();
        }
        System.out.println("+---------+----------+--------------------------------+--------+----------+--------------------------------+");
    }

    // Objetivo: método de apoio da construção do NOH e que registra o
    //           preenchimento dos dados e da ligação de um elemento da lista
    //
    public NohCurso (Integer idCurso, String nmCurso, Integer stCurso, NohCurso proximoCurso)
    {
        this.idCurso = idCurso;
        this.nmCurso = nmCurso;
        this.stCurso = stCurso;
        this.proximoCurso = proximoCurso;
    }
    
    // Objetivo: método responsável pela construção de objetos desta classe
    //
    public NohCurso()
    {
        this.idCurso = 0;
        this.nmCurso = " ";
        this.stCurso = 0;
        this.proximoCurso = null;
    }
    
}
