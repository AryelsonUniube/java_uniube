/* Projeto...: Lista Simplesmente Ligada
 * Autor.....: Professor Dreco
 * Biblioteca: NohAluno
 * Classe....: NohAluno
 * Objetivo..: Criação do nó (elemento) que será utilizado nos projetos
 */
package fila;

public class NohAluno
{
    // Objetivo: atributo de determinação do objeto para servir de referência
    //           no armazenamento dos dados de um elemento da lista
    //
    private Integer idAluno;
    private String  nmAluno;
    private Integer idCursoAluno;
    private Integer sxAluno;
    
    // Objetivo: atributo de determinação do objeto para expressar a ligação
    //           do elemento para um outr elemento da lista
    //
    private NohAluno proximoAluno;

    // Objetivo: método para registrar o preenchimento do atributo
    //           de ligação de um elemento da lista a outro elemento
    //
    public void setProximoAluno (NohAluno proximoAluno)
    {
        this.proximoAluno = proximoAluno;
    }

    // Objetivo: método para registrar as informações do atributo de
    //           codigo de um elemento da lista
    //
    public void setIdAluno (Integer idAluno)
    {
        this.idAluno = idAluno;
    }

    // Objetivo: método para registrar as informações do atributo de
    //           nome de um elemento da lista
    //
    public void setNmAluno (String nmAluno)
    {
        this.nmAluno = nmAluno;
    }

    // Objetivo: método para registrar as informações do atributo de
    //           curso de um elemento da lista
    //
    public void setIdCursoAluno (Integer idCursoAluno)
    {
        this.idCursoAluno = idCursoAluno;
    }

    // Objetivo: método para registrar as informações do atributo de
    //           sexo de um elemento da lista
    //
    public void setSxAluno (Integer sxAluno)
    {
        this.sxAluno = sxAluno;
    }

    // Objetivo: método para buscar informações sobre o atributo de
    //           ligação do elemento atual a um outro da lista
    //
    public NohAluno getProximoAluno ()
    {
        return proximoAluno;
    }

    // Objetivo: método para buscar informações sobre o atributo
    //           codigo do elemento atual
    //
    public Integer getIdAluno ()
    {
        return idAluno;
    }

    // Objetivo: método para buscar informações sobre o atributo
    //           nome do elemento atual
    //
    public String getNmAluno ()
    {
        return nmAluno;
    }

    // Objetivo: método para buscar informações sobre o atributo
    //           curso do elemento atual
    //
    public Integer getIdCursoAluno ()
    {
        return idCursoAluno;
    }

    // Objetivo: método para buscar informações sobre o atributo
    //           sexo do elemento atual
    //
    public Integer getSxAluno ()
    {
        return sxAluno;
    }

    // Objetivo: método para mostrar os dados de um elemento
    //
    //
    public void mostra_noh_Aluno (int posicao)
    {
        if (posicao == 1)
        {
            System.out.println();
            System.out.println("+----------------------------------------------------------------------------------------------------------------+");
            System.out.println("|                                                     ALUNOS                                                     |");
            System.out.println("+----------------------------------------------------------------------------------------------------------------+");
            System.out.println("+---------+----------+--------------------------------+------+-------+----------+--------------------------------+");
            System.out.println("| Posicao | Id       | Nome                           | Sexo | Curso | Próximo  | Nome do Próximo                |");
            System.out.println("+---------+----------+--------------------------------+------+-------+----------+--------------------------------+");
        }
        if (this.getProximoAluno() == null)
        {
            System.out.format ("| %7d | %8d | %-30s |   %1d  |  %3d  |     null | - - - - - - - - - - - - - - -  |",
                posicao, this.getIdAluno(), this.getNmAluno(), this.getSxAluno(), this.getIdCursoAluno());
            System.out.println();
        }
        else
        {
            System.out.format ("| %7d | %8d | %-30s |   %1d  |  %3d  | %8d | %-30s |",
                posicao, this.getIdAluno(), this.getNmAluno(), this.getSxAluno(), this.getIdCursoAluno(),
                this.getProximoAluno().getIdAluno(), this.getProximoAluno().getNmAluno());
            System.out.println();
        }
        System.out.println("+---------+----------+--------------------------------+------+-------+----------+--------------------------------+");
    }

    // Objetivo: método de apoio da construção do NOH e que registra o
    //           preenchimento dos dados e da ligação de um elemento da lista
    //
    public NohAluno (Integer idAluno, String nmAluno, Integer sxAluno, Integer idCursoAluno, NohAluno proximoAluno)
    {
        this.idAluno = idAluno;
        this.nmAluno = nmAluno;
        this.idCursoAluno = idCursoAluno;
        this.sxAluno = sxAluno;
        this.proximoAluno = proximoAluno;
    }
    
    // Objetivo: método responsável pela construção de objetos desta classe
    //
    public NohAluno()
    {
        this.idAluno = 0;
        this.nmAluno = " ";
        this.idCursoAluno = 0;
        this.sxAluno = 0;
        this.proximoAluno = null;
    }
}
