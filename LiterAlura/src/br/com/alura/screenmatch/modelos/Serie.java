package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporada;
    private boolean ativa;
    private int epsPorTemporada;
    private int minutorPorEps;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsPorTemporada() {
        return epsPorTemporada;
    }

    public void setEpsPorTemporada(int epsPorTemporada) {
        this.epsPorTemporada = epsPorTemporada;
    }

    public int getMinutorPorEps() {
        return minutorPorEps;
    }

    public void setMinutorPorEps(int minutorPorEps) {
        this.minutorPorEps = minutorPorEps;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporada * epsPorTemporada * minutorPorEps;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
