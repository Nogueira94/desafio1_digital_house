package desafio1

import java.util.*

data class Matricula (val aluno: Aluno,val curso: Curso,val dtMatricula :  Date = Date()) {
    init {
        println("Matricula do aluno ${aluno.nome} no curso ${curso.nome} realizada com sucesso na data ${dtMatricula}")
    }
}