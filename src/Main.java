public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun Maveick");

        int anoDeLançamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLançamento);
        boolean incluidoNoPlano = true;
        double noDoFilme = 8.1;
        //Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLançamento;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);


    }
}