import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.internal.stubbing.VoidMethodStubbableImpl;


public class ContaMagicaTeste
{
    @BeforeEach
    public void initEach(){
        ContaMagica conta = new ContaMagica();
    }
    @Test
    public void verificaSaldoAposDeposito(){
        ContaMagica conta = new ContaMagica();
        conta.deposito(50000);
        conta.deposito(200000);
        double result = conta.getSaldo();
        Assertions.assertEquals(252000, result);
    }

    @Test
    public void verificaSaldoAposRetiradaSimples(){
        ContaMagica conta = new ContaMagica();
        conta.deposito(50000);
        conta.retirada(30000);
        double result = conta.getSaldo();
        Assertions.assertEquals(20000, result);
    }


    @Test
    public void verificaSaldoAposRetiradaInvalida(){
        ContaMagica conta = new ContaMagica();
        conta.deposito(50000);
        conta.retirada(80000);
        double result = conta.getSaldo();
        Assertions.assertEquals(50000, result);
    }

    @Test
    public void upgradeDeStatusLimMin(){
        ContaMagica conta = new ContaMagica();
        Assertions.assertEquals(0, conta.getStatus());
        conta.deposito(50000);
        Assertions.assertEquals(1, conta.getStatus());
        conta.deposito(150000);
        Assertions.assertEquals(2, conta.getStatus());
    }

    @Test
    public void upgradeDeStatusSemPular(){
        ContaMagica conta = new ContaMagica();
        Assertions.assertEquals(0, conta.getStatus());
        conta.deposito(500000);
        Assertions.assertEquals(1, conta.getStatus());
        conta.deposito(1);
        Assertions.assertEquals(2, conta.getStatus());
    }

    @Test
    public void testaSaldo(){
        ContaMagica conta = new ContaMagica();
        conta.deposito(20);
        Assertions.assertEquals(20,conta.getSaldo());

    }
    @Test
    public void retiradaDowngrade(){
        ContaMagica conta = new ContaMagica();
        conta.deposito(50000);
        conta.deposito(150000);
        conta.retirada(150000);
        Assertions.assertEquals(1,conta.getStatus());
    }

    @Test
    public void jurosStatus2(){
        ContaMagica conta = new ContaMagica();
        conta.deposito(50000);
        conta.deposito(150000);
        conta.deposito(1000);
        Assertions.assertEquals(202525,conta.getSaldo());
    }
}

