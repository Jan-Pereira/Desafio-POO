import java.time.LocalDate;
import br_com_dio_desafio_dominio.Mentoria;
import br_com_dio_desafio_dominio.Bootcamp;
import br_com_dio_desafio_dominio.Curso;
import br_com_dio_desafio_dominio.Dev;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJanderson = new Dev();
        devJanderson.setNome("Janderson");
        devJanderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Janderson:" + devJanderson.getConteudosInscritos());
        devJanderson.progredir();
        devJanderson.progredir();

        System.out.println("-");

        System.out.println("Conteúdos Inscritos Janderson:" + devJanderson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Janderson:" + devJanderson.getConteudosConcluidos());
        System.out.println("XP:" + devJanderson.calcularTotalXp());

        System.out.println("---------------------------------");

        Dev devErika = new Dev();
        devErika.setNome("Érika");
        devErika.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Érika:" + devErika.getConteudosInscritos());
        devErika.progredir();
        devErika.progredir();
        devErika.progredir();

        System.out.println("-");

        System.out.println("Conteúdos Inscritos Érika:" + devErika.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Érika:" + devErika.getConteudosConcluidos());
        System.out.println("XP:" + devErika.calcularTotalXp());

        System.out.println("--");

    }

}
