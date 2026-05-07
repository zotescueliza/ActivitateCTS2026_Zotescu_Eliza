package ro.ase.cts.Strategy.main;

import ro.ase.cts.Strategy.clase.ProbaOrala;
import ro.ase.cts.Strategy.clase.ProbaScrisa;
import ro.ase.cts.Strategy.clase.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ana");
        student.examinare();
        student.setModSustinereExamen(new ProbaOrala());
        student.examinare();
        student.setModSustinereExamen(new ProbaScrisa());
        student.examinare();
    }
}
