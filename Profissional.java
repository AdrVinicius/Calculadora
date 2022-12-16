import java.util.Scanner;

public class Profissional {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();


        System.out.println("Digite seu nome");
        Scanner sc = new Scanner(System.in);
        calculadora.Nome = sc.nextLine();
        
        
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
        System.out.println(" " );

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
            System.out.println(" ");
        }

        double valorTotalSistema = calculadora.CalcularValorHora() * totalHorasTelas;

        System.out.println("Valor Total do Orçamento: " + valorTotalSistema);
        System.out.println("----------------------------------------------------------------------------------------------------------------------" );



        System.out.println("Você deseja o item 1? Digite S para (sim) ou digite N para (não) ");
        String digitadoPrimeiro = sc.nextLine();

        if (digitadoPrimeiro.equals("s")){
            System.out.println("Item 1 selecionado.");
            //int valorPrimeiro = 24;

        }

        int valorPrimeiro = 72;


        System.out.println("Você deseja o item 2? Digite S para (sim) ou digite N para (não) ");
        String digitadoSegundo = sc.nextLine();

        if (digitadoSegundo.equals("s")){
            System.out.println("Item 2 selecionado.");
            //int valorSegundo = 48;

        }
        
        int valorSegundo = 72;


        System.out.println("Você deseja o item 3? Digite S para (sim) ou digite N para (não) ");
        String digitadoTerceiro = sc.nextLine();

        if (digitadoTerceiro.equals("s")){
            System.out.println("Item 3 selecionado.");
            //int valorTerceiro = 72;

        }

        int valorTerceiro = 48;



        String digitadoQuarto = sc.nextLine();
        if (digitadoQuarto.equals("s")){
            System.out.println("Item 4 selecionado.");
            //int valorTerceiro = 72;

        }

        int valorquarto = 24;



        if(digitadoPrimeiro.equals("s") && digitadoSegundo.equals("s") && digitadoTerceiro.equals("s") && digitadoQuarto.equals("s")){
            int resultaFinalHoras = valorPrimeiro + valorSegundo + valorTerceiro + valorquarto;
            // 1 = 24 horas
            // 2 = 48 horas
            // 3 = 72 horas
            System.out.println(" ");
            System.out.println("A quantidade de horas é " + resultaFinalHoras + " e o valor em reais é " + 32.86 *resultaFinalHoras);
            System.out.println("Com o acrescimo da taixa de gestão, o valor final fica em " + (32.85 *resultaFinalHoras) *1.32 );

        }

        sc.close();
    }

 
    
}
