package lab03;

public class Contato {
    private String nome;
    private String sobrenome;
    private String numero;

    public Contato(String nome, String sobrenome, String numero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numero = numero;
    }


    public String getNome() {

        return this.nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }


    public String getSobrenome() {

        return sobrenome;
    }


    public void setSobrenome(String sobrenome) {

        this.sobrenome = sobrenome;
    }


    public String getNumero() {

        return numero;
    }


    public void setNumero(String numero) {

        this.numero = numero;
    }

    public String toString() {
        return "\n" + this.getNome() + " " + this.getSobrenome() + " " + "-" + " " + this.getNumero();
    }

    public String imprimeContato(){
       return "-" + " " + this.getNome() + " " + this.getSobrenome();
    }
}
