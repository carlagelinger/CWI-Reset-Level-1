public class Mario {
    //atributos
    private String nome;
    private int idade;
    private int estamina;
    private double altura;

    //método construtor
    public Mario(){
        this.nome = "Mario Bros";
        this.idade = 40;
        this.estamina = 100;
        this.altura = 1.50;

    }
    public Mario(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.estamina = 100;
        this.altura = altura;
    }
// métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //métodos personalizados
    void imprimeCaracteristicas() {
        System.out.println("Nome: " + nome + " idade: " + idade + " anos, " +estamina +" estamina e " + altura + " de altura.");
    }

    void imprimePoderes(){
        System.out.println("Super força, Super salto, Super vôo e Super agilidade.");
    }
    public void perderEstamina() {
        if (this.getEstamina() >= 10) {
            setEstamina(getEstamina() - 10);
        } else if (this.getEstamina() < 10) {
            this.setEstamina(0);
        }
    }
        public void ganharEstamina(){
            if (this.getEstamina() <100){
                setEstamina(getEstamina() +5);
            } else if (this.getEstamina() == 100){
                this.setEstamina(100);
        }
    }
        public void crescer(){
        this.altura = altura*2;

        }


}

