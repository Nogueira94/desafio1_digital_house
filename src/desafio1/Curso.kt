package desafio1

class Curso(val codCurso: Int, val nome: String, var professorTitular: ProfessorTitular? = null, var professorAdjunto: ProfessorAdjunto? = null, var qntAlunos: Int) {
    //lateinit var alunosMat: MutableList<Aluno>;
    var alunosMat = mutableListOf<Aluno>();

    override fun equals(other: Any?): Boolean {
        return if (other is Curso) {
            other.codCurso == this.codCurso
        } else false
    }

    fun adicionarUmAluno(aluno: Aluno): Boolean {
        if ((alunosMat.count() - 1) < qntAlunos) {
            alunosMat.add(aluno)
            return true
        }
        return false
    }

    fun excluirAluno(aluno: Aluno) {
        if (alunosMat.contains(aluno)) {
            alunosMat.remove(aluno)
        } else {
            println("Aluno não encontrado")
        }
    }

    override fun toString(): String {
        return "Curso $nome, codigo $codCurso. Titular = ${professorTitular?.nome}, Adjunto = ${professorAdjunto?.nome} \n"
    }

}