public class Modelagem  extends UnidadeCurricular{
  
    @Override
    public void exibirCargaHoraria(){
    setCargaHoraria(280);
    System.out.println("Unidade Currucular: " + getNome());
    System.out.println("Dia: " + getDia());
    System.out.println("Horario: " + getHorario());
    System.out.println("Sala: " + getSala());
    System.out.println("Carga Horaria: " + getCargaHoraria() + " horas");

    }
}
