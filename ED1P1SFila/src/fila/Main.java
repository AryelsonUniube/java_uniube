/*
 * Projeto.: Lista Simplesmente Ligada
 * Autor...: Professor Dreco
 * Classe..: Sfila / 2025-S1
 * Objetivo: Projeto fila Simplesmente Ligada
 */
package fila;

import static fila.Msg.msg_nl;

public class Main
{
    public static void main(String[] args)
    {
        LseAlunos fila_Alunos = new LseAlunos();
        LseCursos fila_Cursos = new LseCursos();
        
        int    tamanho = 0;
        int    posicao = 0;
        int    conteudo_int = 0;
        String conteudo_str = " ";
        
        int opcl = Msg.opcao_lista();
        int opc = 0;
        
        while (opcl != 0)
        {
            switch (opcl)
            {
                case 1:
                {
                    opc = Msg.opcao_principal("Alunos");

                    while (opc != 0)
                    {
                        switch (opc)
                        {
                            case 1: // Inserção
                                Msg.limpatela();

                                fila_Alunos.inserir_final();

                                Msg.enter();
                                break;

                            case 2: // Remoção
                                Msg.limpatela();

                                if (fila_Alunos.vazia())
                                {
                                    Msg.msg_central ("A fila_Alunos está vazia, remoção não processada!");
                                }
                                else
                                {
                                    fila_Alunos.remover_inicio();
                                }
                                Msg.enter();
                                break;

                            case 3: // Consulta
                                Msg.limpatela();

                                if (fila_Alunos.vazia())
                                {
                                    Msg.msg_central ("A fila_Alunos está vazia, consulta não processada!");
                                    Msg.enter();
                                }
                                else
                                {
                                    opc = Msg.opcao_consulta();

                                    Msg.limpatela();

                                    switch (opc)
                                    {
                                        case 1: // Consulta Geral
                                            fila_Alunos.consultar_geral();
                                            Msg.enter();
                                            break;

                                        case 2: // Consulta Posição
                                            posicao = Msg.solicita_posicao();

                                            if (posicao < 1)
                                            {
                                                Msg.msg_central ("Consulta nao realizada!");
                                            }
                                            else
                                            {
                                                fila_Alunos.consultar_posicao(posicao);
                                            }
                                            Msg.enter();
                                            break;

                                        case 3: // Consulta Conteúdo INT
                                            conteudo_int = Msg.solicita_conteudo_int();

                                            if (conteudo_int == 0)
                                            {
                                                Msg.msg_central ("Consulta nao realizada!");
                                            }
                                            else
                                            {
                                                fila_Alunos.consultar_conteudo_int(conteudo_int);
                                            }
                                            Msg.enter();
                                            break;

                                        case 4: // Consulta Conteúdo STR
                                            conteudo_str = Msg.solicita_conteudo_str();

                                            if (conteudo_str.isEmpty())
                                            {
                                                Msg.msg_central ("Consulta nao realizada!");
                                            }
                                            else
                                            {
                                                fila_Alunos.consultar_conteudo_str(conteudo_str);
                                            }
                                            Msg.enter();
                                            break;

                                        default:
                                            Msg.limpatela();
                                            Msg.msg_central ("Opção inválida, retornando...");
                                            Msg.enter();
                                    }
                                }
                                break;

                            case 4: // Inicialização
                                Msg.limpatela();

                                if (fila_Alunos.vazia())
                                {
                                    Msg.msg_central ("A fila_Alunos está vazia, inicialização não processada!");
                                }
                                else
                                {
                                    fila_Alunos.inicializar();
                                }
                                Msg.enter();
                                break;

                            case 5: // Tamanho da Lista
                                Msg.limpatela();

                                if (fila_Alunos.vazia())
                                {
                                    Msg.msg_central(">> A lista está vazia.");
                                }
                                else
                                {
                                    tamanho = fila_Alunos.tamanho();

                                    if (tamanho == 0)
                                    {
                                        Msg.msg_central (">> Aguarde a implementação do cálculo de tamanho!");
                                    }
                                    else
                                    {
                                        Msg.msg_central (">> O tamanho da deque é: ["+tamanho+"]\n\n");
                                    }

                                    tamanho = 0;
                                }

                                Msg.enter();
                                break;

                            case 6: // Especial 06

                                Msg.limpatela();
                                Msg.msg_central ("Especial 06");
                                Msg.enter();
                                break;

                            case 7: // Especial 07

                                Msg.limpatela();
                                Msg.msg_central ("Especial 07");
                                Msg.enter();
                                break;

                            case 8: // Especial 08

                                Msg.limpatela();
                                Msg.msg_central ("Especial 08");
                                Msg.enter();
                                break;

                            case 9: // Especial 09

                                Msg.limpatela();
                                Msg.msg_central ("Especial 09");
                                Msg.enter();
                                break;

                            case 10: // Especial 10

                                Msg.limpatela();
                                Msg.msg_central ("Especial 10");
                                Msg.enter();
                                break;

                            case 11: // Especial 11

                                Msg.limpatela();
                                Msg.msg_central ("Especial 11");
                                Msg.enter();
                                break;

                            case 12: // Especial 12

                                Msg.limpatela();
                                Msg.msg_central ("Especial 12");
                                Msg.enter();
                                break;

                            case 13: // Especial 13

                                Msg.limpatela();
                                Msg.msg_central ("Especial 13");
                                Msg.enter();
                                break;

                            case 14: // Especial 14

                                Msg.limpatela();
                                Msg.msg_central ("Especial 14");
                                Msg.enter();
                                break;

                            case 15: // Especial 15

                                Msg.limpatela();
                                Msg.msg_central ("Especial 15");
                                Msg.enter();
                                break;

                            case 0:
                                break;

                            default:
                                Msg.limpatela();
                                Msg.msg_central ("Opção inválida, retornando...");
                                Msg.enter();
                        }

                        opc = Msg.opcao_principal("Alunos");
                    }
                    break;
                }
                case 2:
                {
                    opc = Msg.opcao_principal("Cursos");

                    while (opc != 0)
                    {
                        switch (opc)
                        {
                            case 1: // Inserção
                                Msg.limpatela();

                                fila_Cursos.inserir_final();

                                Msg.enter();
                                break;

                            case 2: // Remoção
                                Msg.limpatela();

                                if (fila_Cursos.vazia())
                                {
                                    Msg.msg_central ("A fila_Cursos está vazia, remoção não processada!");
                                }
                                else
                                {
                                    fila_Cursos.remover_inicio();
                                }
                                Msg.enter();
                                break;

                            case 3: // Consulta
                                Msg.limpatela();

                                if (fila_Cursos.vazia())
                                {
                                    Msg.msg_central ("A fila_Cursos está vazia, consulta não processada!");
                                    Msg.enter();
                                }
                                else
                                {
                                    opc = Msg.opcao_consulta();

                                    Msg.limpatela();

                                    switch (opc)
                                    {
                                        case 1: // Consulta Geral
                                            fila_Cursos.consultar_geral();
                                            Msg.enter();
                                            break;

                                        case 2: // Consulta Posição
                                            posicao = Msg.solicita_posicao();

                                            if (posicao < 1)
                                            {
                                                Msg.msg_central ("Consulta nao realizada!");
                                            }
                                            else
                                            {
                                                fila_Cursos.consultar_posicao(posicao);
                                            }
                                            Msg.enter();
                                            break;

                                        case 3: // Consulta Conteúdo INT
                                            conteudo_int = Msg.solicita_conteudo_int();

                                            if (conteudo_int == 0)
                                            {
                                                Msg.msg_central ("Consulta nao realizada!");
                                            }
                                            else
                                            {
                                                fila_Cursos.consultar_conteudo_int(conteudo_int);
                                            }
                                            Msg.enter();
                                            break;

                                        case 4: // Consulta Conteúdo STR
                                            conteudo_str = Msg.solicita_conteudo_str();

                                            if (conteudo_str.isEmpty())
                                            {
                                                Msg.msg_central ("Consulta nao realizada!");
                                            }
                                            else
                                            {
                                                fila_Cursos.consultar_conteudo_str(conteudo_str);
                                            }
                                            Msg.enter();
                                            break;

                                        default:
                                            Msg.limpatela();
                                            Msg.msg_central ("Opção inválida, retornando...");
                                            Msg.enter();
                                    }
                                }
                                break;

                            case 4: // Inicialização
                                Msg.limpatela();

                                if (fila_Cursos.vazia())
                                {
                                    Msg.msg_central ("A fila_Cursos está vazia, inicialização não processada!");
                                }
                                else
                                {
                                    fila_Cursos.inicializar();
                                }
                                Msg.enter();
                                break;

                            case 5: // Tamanho da Lista
                                Msg.limpatela();

                                if (fila_Cursos.vazia())
                                {
                                    Msg.msg_central(">> A lista está vazia.");
                                }
                                else
                                {
                                    tamanho = fila_Cursos.tamanho();

                                    if (tamanho == 0)
                                    {
                                        Msg.msg_central (">> Aguarde a implementação do cálculo de tamanho!");
                                    }
                                    else
                                    {
                                        Msg.msg_central (">> O tamanho da deque é: ["+tamanho+"]\n\n");
                                    }

                                    tamanho = 0;
                                }

                                Msg.enter();
                                break;

                            case 6: // Especial 06

                                Msg.limpatela();
                                Msg.msg_central ("Especial 06");
                                Msg.enter();
                                break;

                            case 7: // Especial 07

                                Msg.limpatela();
                                Msg.msg_central ("Especial 07");
                                Msg.enter();
                                break;

                            case 8: // Especial 08

                                Msg.limpatela();
                                Msg.msg_central ("Especial 08");
                                Msg.enter();
                                break;

                            case 9: // Especial 09

                                Msg.limpatela();
                                Msg.msg_central ("Especial 09");
                                Msg.enter();
                                break;

                            case 10: // Especial 10

                                Msg.limpatela();
                                Msg.msg_central ("Especial 10");
                                Msg.enter();
                                break;

                            case 11: // Especial 11

                                Msg.limpatela();
                                Msg.msg_central ("Especial 11");
                                Msg.enter();
                                break;

                            case 12: // Especial 12

                                Msg.limpatela();
                                Msg.msg_central ("Especial 12");
                                Msg.enter();
                                break;

                            case 13: // Especial 13

                                Msg.limpatela();
                                Msg.msg_central ("Especial 13");
                                Msg.enter();
                                break;

                            case 14: // Especial 14

                                Msg.limpatela();
                                Msg.msg_central ("Especial 14");
                                Msg.enter();
                                break;

                            case 15: // Especial 15

                                Msg.limpatela();
                                Msg.msg_central ("Especial 15");
                                Msg.enter();
                                break;

                            case 0:
                                break;

                            default:
                                Msg.limpatela();
                                Msg.msg_central ("Opção inválida, retornando...");
                                Msg.enter();
                        }

                        opc = Msg.opcao_principal("Cursos");
                    }
                }
                break;
            }
            
            opcl = Msg.opcao_lista();
        }
        
        Msg.limpatela();

        if (fila_Alunos.vazia())
        {
           Msg.msg_central ("O programa encerrou com a fila_Alunos vazia!");
        }
        else
        {
           Msg.msg_central ("Antes de encerrar, será apresentada a fila_Alunos na situação atual.");

           fila_Alunos.consultar_geral();
        }

        Msg.enter();
        
        if (fila_Cursos.vazia())
        {
           Msg.msg_central ("O programa encerrou com a fila_Cursos vazia!");
        }
        else
        {
           Msg.msg_central ("Antes de encerrar, será apresentada a fila_Cursos na situação atual.");

           fila_Cursos.consultar_geral();
        }
        
        Msg.enter();
    }
}
