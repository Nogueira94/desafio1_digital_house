package desafio1

class DigitalHouseManager() {
    var alunos = mutableMapOf<Int, Aluno>();
    var professores = mutableListOf<Professor>();
    var cursos = mutableMapOf<Int, Curso>();
    var matriculas = mutableListOf<Matricula>();

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        if (cursos.containsKey(codigoCurso)) {
            println("Codigo de curso ja existente")
        } else {
            val curso = Curso(codigoCurso, nome, qntAlunos = quantidadeMaximaDeAlunos)
            cursos[codigoCurso] = curso
        }
    }

    fun excluirCurso(codigoCurso: Int) {
        if (cursos.containsKey(codigoCurso)) {
            cursos.remove(codigoCurso)
        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        val professor = ProfessorAdjunto(codigoProfessor, nome, sobrenome, hrsMonitoria = quantidadeDeHoras)
        if (professores.contains(professor)) {
            println("Professor ja cadastrado")
        } else professores.add(professor)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        val professor = ProfessorTitular(codigoProfessor, nome, sobrenome, especialidade = especialidade)
        if (professores.contains(professor)) {
            println("Professor ja cadastrado")
        } else professores.add(professor)
    }

    fun excluirProfessor(codigoProfessor: Int){
        val iterator = professores.iterator() // usar o iterator para evitar ConcurrentModificationException
        iterator.forEach {
            if (it.codProfessor == codigoProfessor){
                iterator.remove()
            }
        }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        if (alunos.containsKey(codigoAluno)) {
            println("Aluno ja matriculado")
        } else {
            val aluno = Aluno(codigoAluno, nome, sobrenome)
            alunos.put(codigoAluno, aluno)
        }
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        val curso = cursos.get(codigoCurso)
        val aluno = alunos.get(codigoAluno)
        if (curso == null) return println("Curso não encontrado")
        if (aluno == null) return println("Aluno não encontrado")
        if (matriculas.find { it.curso == curso && it.aluno == aluno } != null) return println("Aluno ja matriculado no curso ${curso.nome}")
        if (curso.alunosMat.count() >= curso.qntAlunos) return println("Não há vagas disponiveis para o curso ${curso.nome}")
        val matricula = Matricula(aluno, curso)
        curso.alunosMat.add(aluno)
        matriculas.add(matricula)
        println("Matricula ${matricula.toString()} realizada com sucesso")
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        val professorTitular = professores.find { it.codProfessor == codigoProfessorTitular }
        val professorAdjunto = professores.find { it.codProfessor == codigoProfessorAdjunto }
        var curso = cursos.get(codigoCurso)
        if (curso == null) return println("Curso não encontrado")
        if (professorTitular == null) return println("Professor Titular não encontrado")
        if (professorAdjunto == null) return println("Professo Adjunto não encontrado")
        curso.professorAdjunto = professorAdjunto as ProfessorAdjunto
        curso.professorTitular = professorTitular as ProfessorTitular
    }
    fun consultarCurso(codAluno: Int) : MutableList<String> {
        val aluno = alunos.get(codAluno)
        val cursos = mutableListOf<String>();
        matriculas.forEach {
            if (it.aluno == aluno){
            cursos.add(it.curso.nome)
            }
        }
        return cursos
    }
}

