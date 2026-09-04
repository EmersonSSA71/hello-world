public class Main {
    public static void main(String[] args) {
        System.out.println("____________________________");
        new UsuarioService(new WhatsappNotificador()).registrar("Emerson");
        System.out.println("____________________________");
        new UsuarioService(new EmailNotificador()).registrar("João");
        System.out.println("____________________________");
        new UsuarioService(new SmsNotificador()).registrar("Maria");
        System.out.println("____________________________");
    }
}
