class Nome {
    String nome;
    String sobrenome;

    public Nome(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void exibirNome() {
        System.out.println(nome + " " + sobrenome);
    }
}

interface FabricaDeNomes {
    Nome criarNome(String nome, String sobrenome);
}

class FabricaDeNomesF1 implements FabricaDeNomes {
    @Override
    public Nome criarNome(String nome, String sobrenome) {
        return new Nome(nome, sobrenome);
    }
}

class FabricaDeNomesF2 implements FabricaDeNomes {
    @Override
    public Nome criarNome(String nome, String sobrenome) {
        return new Nome(sobrenome, nome);
    }
}

public class Main {
    public static void main(String[] args) {
        FabricaDeNomes fabricaDeNomesF1 = new FabricaDeNomesF1();
        FabricaDeNomes fabricaDeNomesF2 = new FabricaDeNomesF2();

        Nome nome1 = fabricaDeNomesF2.criarNome("McNealy", "Scott");
        nome1.exibirNome();

        Nome nome2 = fabricaDeNomesF1.criarNome("James", "Gosling");
        nome2.exibirNome();

        Nome nome3 = fabricaDeNomesF2.criarNome("Naughton", "Patrick");
        nome3.exibirNome();
    }
}
