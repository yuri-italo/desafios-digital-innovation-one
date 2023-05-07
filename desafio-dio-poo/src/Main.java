import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso de Java","Descrição do curso de Java",10);
        Curso curso2 = new Curso("Curso de Python","Descrição do curso de Python",8);

        Mentoria mentoria1 = new Mentoria("Mentoria de Java",
                "Descrição da mentoria de Java",
                LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Mentoria de Python",
                "Descrição da mentoria de Python",
                LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp de Java");
        bootcamp.setDescricao("Descrição do Bootcamp de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devYuri = new Dev();
        devYuri.setNome("Yuri Italo");
        devYuri.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos inscritos Yuri -> " + devYuri.getConteudosInscritos());
        devYuri.progredir();
        devYuri.progredir();
        System.out.println("Conteudos inscritos Yuri -> " + devYuri.getConteudosInscritos());
        System.out.println("Conteudos concluidos Yuri -> " + devYuri.getConteudosConcluidos());
        System.out.println("XP Yuri -> " + devYuri.calcularXp());

        System.out.println("-------------");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos Almeida");
        devCarlos.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos inscritos Carlos -> " + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        System.out.println("Conteudos inscritos Carlos -> " + devCarlos.getConteudosInscritos());
        System.out.println("Conteudos concluidos Carlos -> " + devCarlos.getConteudosConcluidos());
        System.out.println("XP Carlos -> " + devCarlos.calcularXp());


    }
}
