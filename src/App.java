public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando a aplicação de caluclar o valor elevado na 2");

        double valor;

        if (args.length == 0) {
            System.out.println("Insira um valor");
            return;
        } else {
            valor = Double.parseDouble(args [0]);
            //valor = 2;
            double result = Math.pow(valor, 2.0);
            System.out.println("O valor de "+valor+" elevado na 2.0 é "+result);
        }

    }
}
