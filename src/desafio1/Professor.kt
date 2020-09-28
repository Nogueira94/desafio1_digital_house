package desafio1

abstract class Professor(val codProfessor: Int, val nome: String, val sobrenome: String, var tempoCasa: Int) {
    override fun equals(other: Any?): Boolean {
        return if (other is Professor) {
            other.codProfessor == this.codProfessor
        } else false
    }

    override fun toString(): String {
        return "$nome $sobrenome, codigo = $codProfessor \n"
    }
}