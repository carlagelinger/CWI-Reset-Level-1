public class Caneta {

      String cor;
      String modelo;
      float ponta;
      int carga;
      boolean tampada;

        void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("está tampada? " + this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
    }
        void rabiscar(){
            if (this.tampada == true) {
                System.out.println("Erro, Não posso rabiscar!");
            } else {
                System.out.println("Estou rabiscando!");
            }
        }
        void tampar(){
            this.tampada = true;
        }
        void destampar(){
            this.tampada = false;
        }
}
