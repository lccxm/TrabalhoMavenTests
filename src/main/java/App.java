public class App {
    public static void main(String args[]) {

        ContaMagica conta = new ContaMagica();


        System.out.println(conta.getStatus());
        conta.deposito(51000);
        System.out.println(conta.getStatus());
        conta.deposito(200000);
        System.out.println(conta.getStatus());
        System.out.println(conta.getSaldo());
    }
}
