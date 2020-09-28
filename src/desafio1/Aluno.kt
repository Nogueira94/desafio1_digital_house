package desafio1

class Aluno (val codAluno: Int, val nome: String, val sobrenome: String) {
    override fun equals(other: Any?): Boolean {
        return if (other is Aluno) {
            other.codAluno == this.codAluno
        } else false
    }

    override fun toString(): String {
        return "Aluno $nome $sobrenome, codigo = $codAluno \n"
    }
}