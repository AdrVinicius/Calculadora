public class Profissional {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.Nome = "Adrian";
        calculadora.SalarioMensal = 2300.00;

        System.out.println("Nome: " + calculadora.Nome);
        System.out.println("Salário Mensal Pretendido: " + calculadora.SalarioMensal);
        System.out.println("Horas Mês: " + calculadora.horasUteisMes);
        System.out.println("Valor/Hora: " + calculadora.CalcularValorHora());

        ItemSistema[] listaItenSistemas = new ItemSistema[4];

        ItemSistema tela1 = new ItemSistema();
        tela1.nomeItem = "Tela de Login";
        tela1.tipoItem = "Login";
        tela1.complexidade = 3;
        listaItenSistemas[0] = tela1;

        ItemSistema tela2 = new ItemSistema();
        tela2.nomeItem = "Tela de Cadastro";
        tela2.tipoItem = "Tela Normal";
        tela2.complexidade = 3;
        listaItenSistemas[1] = tela2;

        ItemSistema tela3 = new ItemSistema();
        tela3.nomeItem = "Tela de Pesquisa";
        tela3.tipoItem = "Tela Normal";
        tela3.complexidade = 2;
        listaItenSistemas[2] = tela3;

        ItemSistema tela4 = new ItemSistema();
        tela4.nomeItem = "Saída com Filtro";
        tela4.tipoItem = "Tela Saída";
        tela4.complexidade = 1;
        listaItenSistemas[3] = tela4;

        int totalHorasTelas = 0;
        int numeroTela = 1;

        for (ItemSistema itemSistema : listaItenSistemas) {
            totalHorasTelas += itemSistema.CalcularQuantidadeHoras();

            System.out.println("Item " + numeroTela + " do orçamento: " + itemSistema.nomeItem);
            System.out.println("Tipo do Item: " + itemSistema.tipoItem);
            System.out.println("Complexidade do Item: " + itemSistema.complexidade);
            System.out.println("Quantidade de Horas Previstas: " + itemSistema.CalcularQuantidadeHoras());
            numeroTela ++;
        }

        double valorTotalSistema = calculadora.CalcularValorHora() * totalHorasTelas;

        System.out.println("Valor Total do Orçamento: " + valorTotalSistema);
    }
}
