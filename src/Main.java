import java.time.LocalDate;

import com.br.dio.desafio.dominio.Curso;
import com.br.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Desafio DIO ---");

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição: JAVA");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição: JS");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Descrição: MENTORIA");
        mentoria.setData(LocalDate.now());
        
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        

    }
}
