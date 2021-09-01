public class ContaBanco  {
    //atributos
    public int numeroConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void statusAtual(){
        System.out.println("Conta " + this.getNumeroConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.isStatus());

    }

    //métodos especiais

    //método construtor

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

  //  public ContaBanco(float saldo, boolean status) {
    //    this.saldo = saldo;
      //  this.status = status;
    //}

       // métodos getters e setters

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // métodos personalizados

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo =="CC"){
            this.setSaldo(50); }
        else if (tipo == "CP"){
            this.setSaldo(150);
            }
        System.out.println("Conta aberta com sucesso!");
        }
    public void fecharConta(){
        if (this.getSaldo()>0) {
            System.out.println("Conta com dinheiro, não pode ser fechada! ");
            }
            else if (this.getSaldo() <0) {
                System.out.println("Conta com débito, nao pode ser encerrada. ");
            }
            else{
                this.setStatus(false); //verificar se usar Set ou Get, se Get, é isStatus por ser boolean
                System.out.println("Conta encerrada com sucesso. ");
            }
        }

    public void depositar(float valor){
        if (this.isStatus()){  //verificar se usar Set ou Get, se Get, é isStatus por ser boolean
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
            } else {
            System.out.println("Impossivel depositar em conta encerrada. ");
        }
    }
    public void sacar(float valor){
        if (this.isStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossivel sacar de uma cinta fechada.");
        }
    }


    public void pagarMensalidade(int valor){
        if (this.getTipo() == "CC"){
            valor = 12;
        } else if (this.getTipo() == "CP"){
            valor = 20;
        } if (isStatus()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso por "+ this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada. ");
        }

    }
}