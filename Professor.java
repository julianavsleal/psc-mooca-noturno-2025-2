/**
* Classe que representa um Professor.
* Contém informações básicas (matrícula, nome, e-mail) e alguns campos
* de notas que, nesta versão, são apenas atributos locais da classe.
*
* Observação: as operações de lançar nota atualmente imprimem mensagens
* no console e não atualizam o estado do objeto `Aluno`. Dependendo do
* requisito, pode ser necessário armazenar as notas no próprio `Aluno`
* ou em uma estrutura de notas separada.
*/
public class Professor {

// Matrícula do professor
private String matricula;
// Nome completo do professor
private String nome;
// E-mail do professor
private String email;
// Campos de notas (exemplo); atualmente usados apenas na exibição
private double notaA1;
private double notaA2;
private double notaA3;

/**
* Recupera a matrícula do professor.
* @return matrícula como String
*/
public String getMatricula() {
return matricula;
}

/**
* Define a matrícula do professor.
* @param matricula - nova matrícula
*/
public void setMatricula(String matricula) {
this.matricula = matricula;
}

/**
* Recupera o nome do professor.
* @return nome completo
*/
public String getNome() {
return nome;
}

/**
* Define o nome do professor.
* @param nome - novo nome
*/
public void setNome(String nome) {
this.nome = nome;
}

/**
* Recupera o e-mail do professor.
* @return e-mail
*/
public String getEmail() {
return email;
}

/**
* Define o e-mail do professor.
* @param email - novo e-mail
*/
public void setEmail(String email) {
this.email = email;
}

/**
* Lança a nota de A1 para um aluno.
* Atualmente apenas imprime a ação no console.
* @param aluno - instância de Aluno cujo nome será exibido
* @param notaA1 - valor da nota da avaliação A1
*/
/**
* Lança a nota A1 para o aluno: atualiza o atributo correspondente no objeto Aluno.
* @param aluno - aluno que receberá a nota
* @param notaA1 - valor da nota A1
*/
public void lancarNota(Aluno aluno, double notaA1){
System.out.println("Lançando a nota da A1 para " + aluno.getNome() + " : " + notaA1);
// Armazena a nota no objeto Aluno
aluno.setNotaA1(notaA1);

}

/**
* Lança a nota de A2 para um aluno. Variante que recebe um tipo de avaliação.
* Atualmente apenas imprime a ação no console.
* @param aluno - instância de Aluno
* @param notaA2 - valor da nota da avaliação A2
* @param tipoAvaliação - descrição do tipo de avaliação (ex: 'substituição')
*/
/**
* Lança a nota A2 para o aluno (variante com tipo de avaliação).
* @param aluno - aluno que receberá a nota
* @param notaA2 - valor da nota A2
* @param tipoAvaliação - tipo/descritivo da avaliação
*/
public void lancarNota(Aluno aluno, double notaA2, String tipoAvaliação){
System.out.println("Lançando a nota da A2 para " + aluno.getNome() + " : " + notaA2 + " (" + tipoAvaliação + ")");
// Armazena a nota A2 no objeto Aluno
aluno.setNotaA2(notaA2);

}

/**
* Lança notas compostas (por exemplo, nota do curso + nota do projeto).
* Nesta implementação apenas exibe no console uma concatenação dos valores.
* @param aluno - instância de Aluno
* @param notaCurso - nota referente à parte do curso
* @param notaProjeto - nota referente ao projeto
*/
/**
* Lança notas compostas para o aluno (por exemplo: nota do curso + nota do projeto)
* e armazena o resultado como A3 no objeto Aluno.
* @param aluno - aluno que receberá as notas
* @param notaCurso - nota da parte de curso
* @param notaProjeto - nota do projeto
*/
public void lancarNota(Aluno aluno, double notaCurso, double notaProjeto){
double soma = notaCurso + notaProjeto;
System.out.println("Lançando notas compostas para " + aluno.getNome() + ": Curso=" + notaCurso + " Projeto=" + notaProjeto + " -> A3=" + soma);
// Armazena a soma como nota A3 no aluno
aluno.setNotaA3(soma);

}

/**
* Exibe as notas internas associadas ao professor.
* Observação: estas notas não estão ligadas diretamente a um aluno
* nesta classe; apenas imprimem os valores dos atributos locais.
*/
/**
* Exibe as notas armazenadas no próprio professor (se houver).
* Nota: após alterações, as notas do aluno são armazenadas em Aluno,
* então prefira chamar {@link Aluno#visualizarNota()} para ver as notas
* de um aluno específico.
*/
public void visualizarNota(){

System.out.println("(Professor) Avaliação 1: " + notaA1);
System.out.println("(Professor) Avaliação 2: " + notaA2);
System.out.println("(Professor) Avaliação 3: " + notaA3);

}

/**
* Exibe informações básicas do aluno passado como parâmetro, incluindo suas notas.
* @param aluno - aluno a ser visualizado
*/
public void visualizarAluno(Aluno aluno){
if (aluno == null) {
System.out.println("Aluno nulo.");
return;
}
// Imprime informações básicas do aluno
System.out.println("Aluno: " + aluno.getNome());
System.out.println("RA: " + (aluno.getRa() != null ? aluno.getRa() : "(não informado)"));
System.out.println("E-mail: " + (aluno.getEmail() != null ? aluno.getEmail() : "(não informado)"));
// Chama o método do aluno para exibir suas notas
aluno.visualizarNota();
}


}