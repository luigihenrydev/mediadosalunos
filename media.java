import java.util.Scanner;
class MediaNotas {
public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

System.out.print("Informe a quantidade de alunos na turma: ");
int quantidade = entrada.nextInt();

double[] notas = new double[quantidade];
double soma = 0;

for (int i = 0; i < notas.length; i++) {
System.out.print("Informe a nota do aluno " + (i+1) + ": ");
notas[i] = entrada.nextDouble();
soma += notas[i];
}

double media = soma / notas.length;

System.out.println("A média das notas dos " + quantidade + " alunos é: " + media);

entrada.close();
}
}