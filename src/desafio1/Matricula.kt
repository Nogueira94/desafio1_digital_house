package desafio1

import java.util.*

data class Matricula (val aluno: Aluno,val curso: Curso,val dtMatricula :  Date = Date()) {
    override fun toString(): String {
        return "Matricula : ${aluno.nome}, ${curso.nome}, $dtMatricula"
    }
}