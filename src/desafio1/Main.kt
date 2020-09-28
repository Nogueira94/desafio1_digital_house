package desafio1

fun main() {

    val digitalHouse = DigitalHouseManager()

    digitalHouse.registrarProfessorTitular("João", "Pedro", 1, "Java")
    digitalHouse.registrarProfessorTitular("Maria", "Clara", 2, "Kotlin")
    digitalHouse.registrarProfessorAdjunto("Marcio", "Antonio", 3, 12)
    digitalHouse.registrarProfessorAdjunto("Joana", "Santos", 4, 13)
    digitalHouse.registrarProfessorAdjunto("Joana", "Santos", 4, 13) // erro de professor ja cadastrado
    digitalHouse.registrarProfessorTitular("João", "Paulo", 5, "JS")

    println(digitalHouse.professores)

    digitalHouse.excluirProfessor(5)

    println(digitalHouse.professores)

    digitalHouse.registrarCurso("Full Stack", 2001, 3)
    digitalHouse.registrarCurso("Android", 2002, 2)
    digitalHouse.registrarCurso("Front End", 2003, 2)

    println(digitalHouse.cursos)

    digitalHouse.excluirCurso(2003)

    println(digitalHouse.cursos)


    digitalHouse.matricularAluno("Guilherme", "Nogueira", 1)
    digitalHouse.matricularAluno("Marcos", "Paulo", 2)
    digitalHouse.matricularAluno("Aline", "Santos", 3)

    println(digitalHouse.alunos)

    digitalHouse.alocarProfessores(2001, 1, 3)
    digitalHouse.alocarProfessores(2002, 2, 4)
    digitalHouse.alocarProfessores(2003, 2, 4)

    println(digitalHouse.cursos)

    digitalHouse.matricularAluno(1, 2001)
    digitalHouse.matricularAluno(2, 2001)

    digitalHouse.matricularAluno(1, 2002)
    digitalHouse.matricularAluno(2, 2002)
    digitalHouse.matricularAluno(3, 2002)

    digitalHouse.matricularAluno(6, 2002)

    digitalHouse.matricularAluno(3, 2003)


/*    val professorTitular1 = ProfessorTitular(1,"João","Pedro",especialidade = "Java")
    val professorTitular2 = ProfessorTitular(2,"Maria","Clara",especialidade = "Kotlin")
    val professorAdjunto1 = ProfessorAdjunto(3,"Marcio","Antonio",hrsMonitoria = 12)
    val professorAdjunto2 = ProfessorAdjunto(4,"Joana","Santos",hrsMonitoria = 13)

    var cursoFullStack = Curso(20001,"Full Stack",qntAlunos = 3)
    var crusoAndroid = Curso(20002,"Android",qntAlunos = 2)
    */
}