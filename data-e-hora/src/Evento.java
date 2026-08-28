import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Evento {

        private String nome;
        private LocalDateTime dataHora;
        private DiaDaSemana diaDaSemana;

    public Evento(String nome, LocalDateTime dataHora, DiaDaSemana diaDaSemana) {
        this.nome = nome;
        this.dataHora = dataHora;
        this.diaDaSemana = diaDaSemana;
    }

    public String exibirEvento(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return nome + " | " + dataHora.format(formatter);
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
