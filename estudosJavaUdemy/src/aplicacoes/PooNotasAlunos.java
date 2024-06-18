package aplicacoes;

import entites.NotasAlunos;
import java.util.Locale;
import java.util.Scanner;

public class PooNotasAlunos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        NotasAlunos student = new NotasAlunos();

        student.name = sc.nextLine();
        student.firstGrade = sc.nextDouble();
        student.secondGrade = sc.nextDouble();
        student.thirdGrade = sc.nextDouble();

        student.finalGrade();

        System.out.println(student);
    }
}
