package desafio1

class Curso(val codCurso: Int, val nome: String, val professorTitular: ProfessorTitular, val professorAdjunto: ProfessorAdjunto, val qntAlunos: Int) {
    //lateinit var alunosMat: MutableList<Aluno>;
    var alunosMat = mutableListOf<Aluno>();
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