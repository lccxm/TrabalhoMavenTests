# TrabalhoMavenTests

## Relatório de Testes:
verificaSaldoAposDeposito:
    - Verifica se após dois depósitos, de 50.000 e 200.000 (1%) obtém-se o valor esperado (252.000).

verificaSaldoAposRetiradaSimples:
    - Verifica se ao retirar 20.000 de uma conta com, originalmente, 50.000, iremos obter 30.000.  

verificaSaldoAposRetiradaInvalida:
    - Verifica se o saldo permanece o mesmo após tentativa de retirada inválida (que resulte m saldo negativo).

upgradeDeStatusLimMin:
    - Verifica de a conta recebe corretamente os upgrades de status após depósitos de 50.000 e 150.000.

upgradeDeStatusSemPular:
    - Verifica se o progresso do status ocorre adequadamente (sem pular).

testaSaldo:
    - Teste simples para verificar se o saldo é mostrado adequadamente.

retiradaDowngrade:
    - Verifica se a conta recebe corretamente downgrade quando seu saldo fica abaixo dos limite estipulados.

jurosStatus2:
    - Verifica de os depósitos são valorizados adequadamente quando a conta atinge o nível.

## Relatório de defeitos
Inicialmente tivemos falhas ao testar os depósitos, pois havíamos considerado que a conta deveria se tornar Gold ao obter saldo MAIOR que 50.000. 
O teste de valor limite nos ajudou a verificar este erro e corrigi-lo.
Ao fazer a análise de cobertura percebemos que não havíamos testado a valorização de 2,5% dos depósitos das contas Platinum, então incluimos o método jurosStatus2.
