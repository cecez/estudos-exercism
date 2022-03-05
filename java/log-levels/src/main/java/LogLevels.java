public class LogLevels {

    public static String message(String logLine) {
        int indiceDoisPontos = logLine.indexOf(":");
        String mensagemNaoFormatada = logLine.substring(indiceDoisPontos + 1);

        return mensagemNaoFormatada.strip();
    }

    public static String logLevel(String logLine) {
        int indiceAbreColchetes = logLine.indexOf("[");
        int indiceFechaColchetes = logLine.indexOf("]");
        String nivelNaoFormatado = logLine.substring(indiceAbreColchetes + 1, indiceFechaColchetes);
        String nivelFormatado = nivelNaoFormatado.toLowerCase();

        return nivelFormatado;
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }

}
