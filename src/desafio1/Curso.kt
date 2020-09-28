package desafio1

class Curso(val codCurso: Int, val nome: String, val professorTitular: ProfessorTitular? = null, val professorAdjunto: ProfessorAdjunto? = null, val qntAlunos: Int) {
    //lateinit var alunosMat: MutableList<Aluno>;
    var alunosMat = mutableListOf<Aluno>();

    override fun equals(other: Any?): Boolean {
        return if (other is Curso){
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
        if (alunosMat.count() > 0) {
            alunosMat.remove(aluno)
        }
    }

}