public class ContaMagica {
    public static final int SILVER = 0;
    public static final int GOLD = 1;
    public static final int PLATINUM = 2;

    private double saldo;
    private int status;

    public ContaMagica(){
        saldo = 0;
        status = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getStatus() {
        return status;
    }

    public void deposito(int valor){
        if(status == 0){
            saldo += valor;
            if(saldo >= 50000){
                status = 1;
            }
        }else if(status == 1){
            saldo += valor + (valor * 0.01);
            if(saldo >= 200000){
                status = 2;
            }
        }else if(status == 2){
            saldo += valor + (valor * 0.025);
        }
    }

    public void retirada(int valor){
        if((saldo - valor) < 0){
            saldo = saldo;
        }else{
            saldo -= valor;
        }
        if(status == 2 && saldo < 100000){
            status = 1;
        }else if(status == 1 && saldo < 25000){
            status = 0;
        }
    }
}