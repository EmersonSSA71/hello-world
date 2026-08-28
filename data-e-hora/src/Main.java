import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        ZoneId brasil = ZoneId.of("America/Sao_Paulo");
        ZoneId gmt = ZoneId.of("GMT");
        int n = 5;

        Evento eventoAtual = new Evento("Evento EBAC", LocalDateTime.now(), DiaDaSemana.SEXTA);

        //Evento atual + n dias
        eventoAtual.setDataHora(LocalDateTime.now().plusDays(n));
        System.out.println(eventoAtual.exibirEvento() + " | Evento daqui a " + n + " dias");

        //Conversão BRT e GMT
        eventoAtual.setDataHora(LocalDateTime.now(brasil).plusDays(n));
        System.out.println(eventoAtual.exibirEvento() + " | Fuso Sao Paulo (BRT)");

        eventoAtual.setDataHora(LocalDateTime.now(gmt).plusDays(n));
        System.out.println(eventoAtual.exibirEvento() + " | Fuso (GMT)");




    }
}
