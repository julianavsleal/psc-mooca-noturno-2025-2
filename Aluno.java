 /**
* Classe que representa um Aluno com informações básicas.
* Contém campos para RA (registro acadêmico), nome e e-mail,
* além de métodos de acesso (getters/setters) para cada campo.
* O método visualizarNota é um placeholder para exibir notas do aluno
* e deve ser implementado conforme os requisitos da aplicação.
*/
public class Aluno {
// RA (Registro Acadêmico) do aluno
private String ra;
// Nome completo do aluno
private String nome;
// E-mail do aluno
private String email;
// Notas do aluno: A1, A2 e A3
private double notaA1;
private double notaA2;
private double notaA3;

/**
* Recupera o RA do aluno.
* @return ra - o registro acadêmico
*/
public String getRa() {
return ra;
}

/**
* Define o RA do aluno.
* @param ra - novo valor para o registro acadêmico
*/
public void setRa(String ra) {
this.ra = ra;
}

/**
* Recupera o nome do aluno.
* @return nome - nome completo
*/
public String getNome() {
return nome;
}

/**
* Define o nome do aluno.
* @param nome - novo nome
*/
public void setNome(String nome) {
this.nome = nome;
}

/**
* Recupera o e-mail do aluno.
* @return email - endereço de correio eletrônico
*/
public String getEmail() {
return email;
}

/**
* Define o e-mail do aluno.
* @param email - novo endereço de e-mail
*/
public void setEmail(String email) {
this.email = email;
}

/**
* Método placeholder para visualizar as notas do aluno.
* Exibe as três notas (A1, A2, A3) do aluno no console.
* Se uma nota não for definida, o valor padrão 0.0 será exibido.
*/
public void visualizarNota() {
System.out.println("Aluno: " + (nome != null ? nome : "(sem nome)"));
System.out.println("Avaliação A1: " + notaA1);
System.out.println("Avaliação A2: " + notaA2);
System.out.println("Avaliação A3: " + notaA3);
}

/**
* Recupera a nota A1 do aluno.
*/
public double getNotaA1() {
return notaA1;
}

/**
* Define a nota A1 do aluno.
*/
public void setNotaA1(double notaA1) {
this.notaA1 = notaA1;
}

/**
* Recupera a nota A2 do aluno.
*/
public double getNotaA2() {
return notaA2;
}

/**
* Define a nota A2 do aluno.
*/
public void setNotaA2(double notaA2) {
this.notaA2 = notaA2;
}

/**
* Recupera a nota A3 do aluno.
*/
public double getNotaA3() {
return notaA3;
}

/**
* Define a nota A3 do aluno.
*/
public void setNotaA3(double notaA3) {
this.notaA3 = notaA3;
}

}