/**
* Classe principal da aplicação com o método main.
* Mostra um exemplo simples de criação de objetos `Aluno` e `Professor`
* e chamadas para lançar/visualizar notas.
*/
public class Main {

/**
* Ponto de entrada do programa.
* Aqui criamos um aluno e um professor e demonstramos o uso
* dos métodos de lançamento de notas.
*/
public static void main(String[] args) {
// Cria uma nova instância de Aluno
Aluno aluno = new Aluno();
// Cria uma nova instância de Professor
Professor danilo = new Professor();

Programacao pg = new Programacao();

Modelagem md = new Modelagem();

// Define o nome do aluno e imprime no console
aluno.setNome("Erick");
System.out.println(aluno.getNome());

// Exemplo de lançamentos de notas usando sobrecarga de métodos
// Lança uma nota simples (A1) para o aluno
danilo.lancarNota(aluno, 21);

// Lança uma nota especificando também o tipo de avaliação
danilo.lancarNota(aluno, 17, "A2");

// Lança notas compostas (por exemplo: nota do curso + nota do projeto)
danilo.lancarNota(aluno, 10, 30);

// Após lançar as notas, pedir ao professor para visualizar os dados do aluno
danilo.visualizarAluno(aluno);

pg.exibirCargaHoraria();

md.exibirCargaHoraria();
}
}