package desafio1

class DigitalHouseManager(var alunos: MutableList<Aluno>, var professores: MutableList<Professor>, var cursos: MutableList<Curso>, var matriculas: MutableList<Matricula>) {

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        val curso = Curso(codigoCurso,nome,qntAlunos = quantidadeMaximaDeAlunos)
        if (cursos.contains(curso)) {
            println("Codigo de curso ja existente")
        } else cursos.add(curso)
    }

    fun excluirCurso(codigoCurso: Int) {

    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {

    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {

    }

    fun excluirProfessor(codigoProfessor: Int) {

    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {

    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {

    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {

    }
}