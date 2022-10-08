public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        byte idade = 123;
        short ano = 2021;
        int cep = 19803010; //se começar com zero, talvez seja necessário usar String
        long cpf = 84562754687L; //se começar com zero, talvez seja necessário usar String
        float pi = 3.14F; //utilizar o F no final, quando usar FLOAT
        double salario = 2587.85;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //short numeroCurto2 = numeroNormal; - nao pode converter int para short
        //por Java ser fortemente tipada
        short numeroCurto2 = (short) numeroNormal; //Recurso casting, converte um 
        //tipo mais abrangente, para um mais coerente.

        int numero = 1;

        numero = 2;

        final double VALOR_DE_PI = 3.14; //final é para variaveis constantes e
        //sempre com nome todo em caixa alta
   }
}
