public class Validador {

    public static boolean validarBalanceamento(String expressao) {

        Pilha pilha = new Pilha(expressao.length());

        for (int i = 0; i < expressao.length(); i++) {

            char caractere = expressao.charAt(i);

            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.empilhar(caractere);
            }

            if (caractere == ')' || caractere == ']' || caractere == '}') {

                if (pilha.vazia()) {
                    return false;
                }

                char abertura = pilha.desempilhar();

                if (caractere == ')' && abertura != '(') {
                    return false;
                }

                if (caractere == ']' && abertura != '[') {
                    return false;
                }

                if (caractere == '}' && abertura != '{') {
                    return false;
                }
            }
        }

        return pilha.vazia();
    }
}