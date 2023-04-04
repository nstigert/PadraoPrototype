public class Animal implements Cloneable {
    private String nome;
    private String tipo;
    private Pessoa tutor;
    private String raca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pessoa getTutor() {
        return tutor;
    }

    public void setTutor(Pessoa tutor) {
        this.tutor = tutor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Animal(String nome, String tipo, Pessoa tutor, String raca) {
        this.nome = nome;
        this.tipo = tipo;
        this.tutor = tutor;
        this.raca = raca;
    }

    @Override
    public Animal clone() throws CloneNotSupportedException {
        Animal animalClone = (Animal) super.clone();
        animalClone.tutor = (Pessoa) animalClone.tutor.clone();
        return animalClone;
    }
}
