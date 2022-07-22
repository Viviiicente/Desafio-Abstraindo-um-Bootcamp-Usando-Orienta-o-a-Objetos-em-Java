package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTituolo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTituolo("Curso JavaS");
        curso2.setDescricao("Descrição curso JavaS");
        curso2.setCargaHoraria(20);


        Mentoria mentoria = new Mentoria();

        mentoria.setTituolo("mentoria Java");
        mentoria.setDescricao("mentoria Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVitoria = new Dev();
        devVitoria.inscreverBootcamp(bootcamp);
        devVitoria.setNome("Vitória");
        System.out.println("Conteudos Inscritos Vitoria:" + devVitoria.getConteudosInscritos());
        devVitoria.progredir();
        devVitoria.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Vitoria:" + devVitoria.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Vitoria:" + devVitoria.getConteudosConcluidos());
        System.out.println("XP:" + devVitoria.calcularXp());

        System.out.println("----------------------");

        Dev devAlysson = new Dev();
        devAlysson.inscreverBootcamp(bootcamp);
        devAlysson.setNome("Alysson");
        System.out.println("Conteudos Inscritos Alysson:" + devAlysson.getConteudosInscritos());
        devAlysson.progredir();
        devVitoria.progredir();
        devVitoria.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Alysson:" + devAlysson.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Alysson:" + devAlysson.getConteudosConcluidos());
        System.out.println("XP:" + devAlysson.calcularXp());


    }



}
