import java.util.Set;
import java.util.HashSet;
import com.Pessoa.entity.Pessoa;

public class Main {
    public static void main(String[] args) {

        Set<Pessoa> usuarios = new HashSet<>();

        Pessoa pessoa1 = new Pessoa("Emerson", 25);
        Pessoa pessoa2 = new Pessoa("Emerson", 25);
        Pessoa pessoa3 = new Pessoa("Emerson", 25);
        Pessoa pessoa4 = new Pessoa("Emerson", 25);
        Pessoa pessoa5 = new Pessoa("Emerson", 25);
        Pessoa pessoa6 = new Pessoa("Emerson", 25);
        Pessoa pessoa7 = new Pessoa("Emerson", 25);

        usuarios.add(pessoa1);
        usuarios.add(pessoa2);
        usuarios.add(pessoa3);
        usuarios.add(pessoa4);
        usuarios.add(pessoa5);
        usuarios.add(pessoa6);
        usuarios.add(pessoa7);

        System.out.println();
        for (Pessoa pessoa : usuarios) {
            System.out.println("pessoa = " + pessoa);
        }

        System.out.println("""
                \nQuando dou o comando 'new Pessoa' crio um endereço de memoria novo e guardo na variavel 'pessoaX'.
                Ao chamar o metodo '.add()' da minha variavel 'usuarios' que é um 'HashSet<>', por debaixo dos panos automaticamente
                ele chama o metodo 'hashCode()' do meu objeto para abrir meio que um 'endereço' do tipo 'int' baseado nos dados recebidos.
                (Como no java cada objeto tem seu endereço de memoria, usamos os metodos 'hashCode()' e 'equals()' para compara-los.
                Seria dificil comparar um objeto com o outro usando '.equals()' no main.)
                Entretanto, na primeira vez que o java viu que o 'HashSet<>' estava vazio, ignorou o metodo 'equals()' dentro do objeto.
                Na segunda vez e nas demais ele viu que o 'HashSet<>' estava sendo ocupado pelo mesmo 'int' retornado na
                primeira vez. Dito isso, para fazer uma verificação chama o metodo 'equals()' e retornar um 'boolean'. Se os dados do objeto forem
                iguais aos do que já está guardado ali ele descarta, se não, salva. É assim que o java não acumula na memoria objetos identicos.""");
    }
}
