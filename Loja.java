class Livro {

    public String nome;
    public float preco;
    public String autor;

    Livro(String nome, float preco, String autor) {
        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
    }

    public void display() {
        System.out.println("Livro: " + nome + " "
                + " o preco e: "
                + preco);
    }
}
class Cd {

    public String nome;
    public float preco;
    public int faixas;

    Cd(String nome, float preco, int faixas) {
        this.nome = nome;
        this.preco = preco;
        this.faixas = faixas;
    }

    public void display() {
        System.out.println("Cd: " + nome + ", Seu preço é: "+ preco+" E possui: "+faixas+" faixas");
    }
}
class Dvd {

    public String nome;
    public float preco;
    public int duracao;

    Dvd(String nome, float preco, int duracao) {
        this.nome = nome;
        this.preco = preco;
        this.duracao = duracao;
    }

    public void display() {
        System.out.println("Dvd: " + nome + " Seu preço é: "+ preco + " E possui " + duracao + "mins de duração");
    }
}
public class store {

    public static void main(String[] args) {
        Livro[] l = new Livro[2];
        l[0] = new Livro("REDES DE COMPUTADORES", 122f, "ANDREW TANENBAUM");
        l[1] = new Livro("PROGRAMACAO JAVA", 233F, "PAUL DEITEL");
        l[0].display();
        l[1].display();
        
        Cd[] cd = new Cd[2];
        cd[0] = new Cd("Chorão", 22f, 23);
        cd[1] = new Cd("Armandinho", 21F, 14);
        cd[0].display();
        cd[1].display();
        
        Dvd[] dvd = new Dvd[2];
        dvd[0] = new Dvd("Harry pótter", 25f, 122);
        dvd[1] = new Dvd("O Hobbit", 23F, 144);
        dvd[0].display();
        dvd[1].display();
    }
}