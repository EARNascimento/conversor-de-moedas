import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        Double valor;
        MoedaER moeda;


        int i = 1;
        while(i != 0){

            System.out.println("**************************************");
            System.out.println("Seja bem-vindo ao Conversor de Moedas!\n");

            System.out.println("1) Dólar ==> Peso Argentino");
            System.out.println("2) Peso Argentino ==> Dólar");
            System.out.println("3) Dólar ==> Real Brasileiro");
            System.out.println("4) Real Brasileiro ==> Dólar");
            System.out.println("5) Dólar ==> Peso Colombiano");
            System.out.println("6) Peso Colombiano ==> Dólar");
            System.out.println("0) Sair do programa");

            System.out.println("Digite a opcao desejada: \n");
            i = leia.nextInt();


            switch(i){
                case 1:
                    System.out.println("Digite o valor em Dólar que irá ser convertido para Peso Argentino: ");
                    valor = leia.nextDouble();
                    moeda = conversorMoeda.buscaMoeda("USD", "ARS", valor);
                    System.out.println("O Valor " + valor + " [USD] " + "corresponde ao valor final de =>> " +
                            moeda.getConversionResult() + " [ARS] ");
                    break;

                case 2:
                    System.out.println("Digite o valor em Peso Argentino que irá ser convertido para Dólar: ");
                    valor = leia.nextDouble();
                    moeda = conversorMoeda.buscaMoeda("ARS", "USD", valor);
                    System.out.println("O Valor " + valor + " [ARS] " + "corresponde ao valor final de =>> " +
                            moeda.getConversionResult() + " [USD] ");
                    break;

                case 3:
                    System.out.println("Digite o valor em Dólar que irá ser convertido para Real Brasileiro: ");
                    valor = leia.nextDouble();
                    moeda = conversorMoeda.buscaMoeda("USD", "BRL", valor);
                    System.out.println("O Valor " + valor + " [USD] " + "corresponde ao valor final de =>> " +
                            moeda.getConversionResult() + " [BRL] ");
                    break;

                case 4:
                    System.out.println("Digite o valor em Real Brasileiro que irá ser convertido para Dólar: ");
                    valor = leia.nextDouble();
                    moeda = conversorMoeda.buscaMoeda("BRL", "USD", valor);
                    System.out.println("O Valor " + valor + " [BRL] " + "corresponde ao valor final de =>> " +
                            moeda.getConversionResult() + " [USD] ");
                    break;

                case 5:
                    System.out.println("Digite o valor em Dólar que irá ser convertido para Peso Colombiano: ");
                    valor = leia.nextDouble();
                    moeda = conversorMoeda.buscaMoeda("USD", "COP", valor);
                    System.out.println("O Valor " + valor + " [USD] " + "corresponde ao valor final de =>> " +
                            moeda.getConversionResult() + " [COP] ");
                    break;

                case 6:
                    System.out.println("Digite o valor em Peso Colombiano que irá ser convertido para Dólar: ");
                    valor = leia.nextDouble();
                    moeda = conversorMoeda.buscaMoeda("COP", "USD", valor);
                    System.out.println("O Valor " + valor + " [COP] " + "corresponde ao valor final de =>> " +
                            moeda.getConversionResult() + " [USD] ");
                    break;

            }
        }
    }
}
