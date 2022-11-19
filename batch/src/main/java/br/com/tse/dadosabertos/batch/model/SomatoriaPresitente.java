package br.com.tse.dadosabertos.batch.model;

import java.math.BigDecimal;
import java.util.Objects;

public class SomatoriaPresitente{
    private Integer codigoPleito;
    private Integer codigoEleicao;
    private Integer codigoCargo;
    private String siglaUF;
    private String dataTotalizacao;
    private BigDecimal quantidadeSecaoTotal;
    private BigDecimal quantidadeSecoesAptosTotal;
    private BigDecimal quantidadeSecoesTotal;
    private BigDecimal quantidadeSecoesTotalAcumulado;
    private String percentualSecoesTotalAcumulado;
    private BigDecimal quantidadeAptosTotal;
    private BigDecimal quantidadeAptosTotalAcumulado;
    private BigDecimal quantidadeVotosTotal;
    private BigDecimal quantidadeVotosTotalAcumulado;
    private BigDecimal quantidadeDeVotosConcorrentes;
    private BigDecimal quantidadeDeVotosConcorrentesAcumulado;
    private BigDecimal lulaQuantidadeTotalDeVotos;
    private BigDecimal lulaQuantidadeVotosTotAcumulado;
    private String lulaPercentualVotosTotalAcumulado;
    private BigDecimal jairBolsonaroQuantidadeVotosTotal;
    private BigDecimal jairBolsonaroQuantidadeVotosTotalAcumulado;
    private String jairBolsonaroPercentualVotosTotalAcumulado;
    private BigDecimal brancoQuantidadeDeVotosAcumulado;
    private BigDecimal brancoQuantidadeVotosTotalAcumulado;
    private String brancPercentualVotosTotalAcumulado;
    private BigDecimal nuloQuantidadeVotosTotal;
    private BigDecimal nuloQuantidadeVotosTotalAcumulado;
    private String nuloPercentualVotosTotalAcumulado;

    public Integer getCodigoPleito() {
        return codigoPleito;
    }

    public void setCodigoPleito(Integer codigoPleito) {
        this.codigoPleito = codigoPleito;
    }

    public Integer getCodigoEleicao() {
        return codigoEleicao;
    }

    public void setCodigoEleicao(Integer codigoEleicao) {
        this.codigoEleicao = codigoEleicao;
    }

    public Integer getCodigoCargo() {
        return codigoCargo;
    }

    public void setCodigoCargo(Integer codigoCargo) {
        this.codigoCargo = codigoCargo;
    }

    public String getSiglaUF() {
        return siglaUF;
    }

    public void setSiglaUF(String siglaUF) {
        this.siglaUF = siglaUF;
    }

    public String getDataTotalizacao() {
        return dataTotalizacao;
    }

    public void setDataTotalizacao(String dataTotalizacao) {
        this.dataTotalizacao = dataTotalizacao;
    }

    public BigDecimal getQuantidadeSecaoTotal() {
        return quantidadeSecaoTotal;
    }

    public void setQuantidadeSecaoTotal(BigDecimal quantidadeSecaoTotal) {
        this.quantidadeSecaoTotal = quantidadeSecaoTotal;
    }

    public BigDecimal getQuantidadeSecoesAptosTotal() {
        return quantidadeSecoesAptosTotal;
    }

    public void setQuantidadeSecoesAptosTotal(BigDecimal quantidadeSecoesAptosTotal) {
        this.quantidadeSecoesAptosTotal = quantidadeSecoesAptosTotal;
    }

    public BigDecimal getQuantidadeSecoesTotal() {
        return quantidadeSecoesTotal;
    }

    public void setQuantidadeSecoesTotal(BigDecimal quantidadeSecoesTotal) {
        this.quantidadeSecoesTotal = quantidadeSecoesTotal;
    }

    public BigDecimal getQuantidadeSecoesTotalAcumulado() {
        return quantidadeSecoesTotalAcumulado;
    }

    public void setQuantidadeSecoesTotalAcumulado(BigDecimal quantidadeSecoesTotalAcumulado) {
        this.quantidadeSecoesTotalAcumulado = quantidadeSecoesTotalAcumulado;
    }

    public String getPercentualSecoesTotalAcumulado() {
        return percentualSecoesTotalAcumulado;
    }

    public void setPercentualSecoesTotalAcumulado(String percentualSecoesTotalAcumulado) {
        this.percentualSecoesTotalAcumulado = percentualSecoesTotalAcumulado;
    }

    public BigDecimal getQuantidadeAptosTotal() {
        return quantidadeAptosTotal;
    }

    public void setQuantidadeAptosTotal(BigDecimal quantidadeAptosTotal) {
        this.quantidadeAptosTotal = quantidadeAptosTotal;
    }

    public BigDecimal getQuantidadeAptosTotalAcumulado() {
        return quantidadeAptosTotalAcumulado;
    }

    public void setQuantidadeAptosTotalAcumulado(BigDecimal quantidadeAptosTotalAcumulado) {
        this.quantidadeAptosTotalAcumulado = quantidadeAptosTotalAcumulado;
    }

    public BigDecimal getQuantidadeVotosTotal() {
        return quantidadeVotosTotal;
    }

    public void setQuantidadeVotosTotal(BigDecimal quantidadeVotosTotal) {
        this.quantidadeVotosTotal = quantidadeVotosTotal;
    }

    public BigDecimal getQuantidadeVotosTotalAcumulado() {
        return quantidadeVotosTotalAcumulado;
    }

    public void setQuantidadeVotosTotalAcumulado(BigDecimal quantidadeVotosTotalAcumulado) {
        this.quantidadeVotosTotalAcumulado = quantidadeVotosTotalAcumulado;
    }

    public BigDecimal getQuantidadeDeVotosConcorrentes() {
        return quantidadeDeVotosConcorrentes;
    }

    public void setQuantidadeDeVotosConcorrentes(BigDecimal quantidadeDeVotosConcorrentes) {
        this.quantidadeDeVotosConcorrentes = quantidadeDeVotosConcorrentes;
    }

    public BigDecimal getQuantidadeDeVotosConcorrentesAcumulado() {
        return quantidadeDeVotosConcorrentesAcumulado;
    }

    public void setQuantidadeDeVotosConcorrentesAcumulado(BigDecimal quantidadeDeVotosConcorrentesAcumulado) {
        this.quantidadeDeVotosConcorrentesAcumulado = quantidadeDeVotosConcorrentesAcumulado;
    }

    public BigDecimal getLulaQuantidadeTotalDeVotos() {
        return lulaQuantidadeTotalDeVotos;
    }

    public void setLulaQuantidadeTotalDeVotos(BigDecimal lulaQuantidadeTotalDeVotos) {
        this.lulaQuantidadeTotalDeVotos = lulaQuantidadeTotalDeVotos;
    }

    public BigDecimal getLulaQuantidadeVotosTotAcumulado() {
        return lulaQuantidadeVotosTotAcumulado;
    }

    public void setLulaQuantidadeVotosTotAcumulado(BigDecimal lulaQuantidadeVotosTotAcumulado) {
        this.lulaQuantidadeVotosTotAcumulado = lulaQuantidadeVotosTotAcumulado;
    }

    public String getLulaPercentualVotosTotalAcumulado() {
        return lulaPercentualVotosTotalAcumulado;
    }

    public void setLulaPercentualVotosTotalAcumulado(String lulaPercentualVotosTotalAcumulado) {
        this.lulaPercentualVotosTotalAcumulado = lulaPercentualVotosTotalAcumulado;
    }

    public BigDecimal getJairBolsonaroQuantidadeVotosTotal() {
        return jairBolsonaroQuantidadeVotosTotal;
    }

    public void setJairBolsonaroQuantidadeVotosTotal(BigDecimal jairBolsonaroQuantidadeVotosTotal) {
        this.jairBolsonaroQuantidadeVotosTotal = jairBolsonaroQuantidadeVotosTotal;
    }

    public BigDecimal getJairBolsonaroQuantidadeVotosTotalAcumulado() {
        return jairBolsonaroQuantidadeVotosTotalAcumulado;
    }

    public void setJairBolsonaroQuantidadeVotosTotalAcumulado(BigDecimal jairBolsonaroQuantidadeVotosTotalAcumulado) {
        this.jairBolsonaroQuantidadeVotosTotalAcumulado = jairBolsonaroQuantidadeVotosTotalAcumulado;
    }

    public String getJairBolsonaroPercentualVotosTotalAcumulado() {
        return jairBolsonaroPercentualVotosTotalAcumulado;
    }

    public void setJairBolsonaroPercentualVotosTotalAcumulado(String jairBolsonaroPercentualVotosTotalAcumulado) {
        this.jairBolsonaroPercentualVotosTotalAcumulado = jairBolsonaroPercentualVotosTotalAcumulado;
    }

    public BigDecimal getBrancoQuantidadeDeVotosAcumulado() {
        return brancoQuantidadeDeVotosAcumulado;
    }

    public void setBrancoQuantidadeDeVotosAcumulado(BigDecimal brancoQuantidadeDeVotosAcumulado) {
        this.brancoQuantidadeDeVotosAcumulado = brancoQuantidadeDeVotosAcumulado;
    }

    public BigDecimal getBrancoQuantidadeVotosTotalAcumulado() {
        return brancoQuantidadeVotosTotalAcumulado;
    }

    public void setBrancoQuantidadeVotosTotalAcumulado(BigDecimal brancoQuantidadeVotosTotalAcumulado) {
        this.brancoQuantidadeVotosTotalAcumulado = brancoQuantidadeVotosTotalAcumulado;
    }

    public String getBrancPercentualVotosTotalAcumulado() {
        return brancPercentualVotosTotalAcumulado;
    }

    public void setBrancPercentualVotosTotalAcumulado(String brancPercentualVotosTotalAcumulado) {
        this.brancPercentualVotosTotalAcumulado = brancPercentualVotosTotalAcumulado;
    }

    public BigDecimal getNuloQuantidadeVotosTotal() {
        return nuloQuantidadeVotosTotal;
    }

    public void setNuloQuantidadeVotosTotal(BigDecimal nuloQuantidadeVotosTotal) {
        this.nuloQuantidadeVotosTotal = nuloQuantidadeVotosTotal;
    }

    public BigDecimal getNuloQuantidadeVotosTotalAcumulado() {
        return nuloQuantidadeVotosTotalAcumulado;
    }

    public void setNuloQuantidadeVotosTotalAcumulado(BigDecimal nuloQuantidadeVotosTotalAcumulado) {
        this.nuloQuantidadeVotosTotalAcumulado = nuloQuantidadeVotosTotalAcumulado;
    }

    public String getNuloPercentualVotosTotalAcumulado() {
        return nuloPercentualVotosTotalAcumulado;
    }

    public void setNuloPercentualVotosTotalAcumulado(String nuloPercentualVotosTotalAcumulado) {
        this.nuloPercentualVotosTotalAcumulado = nuloPercentualVotosTotalAcumulado;
    }

    @Override
    public String toString() {
        return "SomatoriaPresitente{" +
                "codigoPleito=" + codigoPleito +
                ", codigoEleicao=" + codigoEleicao +
                ", codigoCargo=" + codigoCargo +
                ", siglaUF='" + siglaUF + '\'' +
                ", dataTotalizacao='" + dataTotalizacao + '\'' +
                ", quantidadeSecaoTotal=" + quantidadeSecaoTotal +
                ", quantidadeSecoesAptosTotal=" + quantidadeSecoesAptosTotal +
                ", quantidadeSecoesTotal=" + quantidadeSecoesTotal +
                ", quantidadeSecoesTotalAcumulado=" + quantidadeSecoesTotalAcumulado +
                ", percentualSecoesTotalAcumulado=" + percentualSecoesTotalAcumulado +
                ", quantidadeAptosTotal='" + quantidadeAptosTotal + '\'' +
                ", quantidadeAptosTotalAcumulado=" + quantidadeAptosTotalAcumulado +
                ", quantidadeVotosTotal=" + quantidadeVotosTotal +
                ", quantidadeVotosTotalAcumulado=" + quantidadeVotosTotalAcumulado +
                ", quantidadeDeVotosConcorrentes=" + quantidadeDeVotosConcorrentes +
                ", quantidadeDeVotosConcorrentesAcumulado=" + quantidadeDeVotosConcorrentesAcumulado +
                ", lulaQuantidadeTotalDeVotos=" + lulaQuantidadeTotalDeVotos +
                ", lulaQuantidadeVotosTotAcumulado=" + lulaQuantidadeVotosTotAcumulado +
                ", lulaPercentualVotosTotalAcumulado=" + lulaPercentualVotosTotalAcumulado +
                ", jairBolsonaroQuantidadeVotosTotal=" + jairBolsonaroQuantidadeVotosTotal +
                ", jairBolsonaroQuantidadeVotosTotalAcumulado=" + jairBolsonaroQuantidadeVotosTotalAcumulado +
                ", jairBolsonaroPercentualVotosTotalAcumulado=" + jairBolsonaroPercentualVotosTotalAcumulado +
                ", brancoQuantidadeDeVotosAcumulado=" + brancoQuantidadeDeVotosAcumulado +
                ", brancoQuantidadeVotosTotalAcumulado=" + brancoQuantidadeVotosTotalAcumulado +
                ", brancPercentualVotosTotalAcumulado=" + brancPercentualVotosTotalAcumulado +
                ", nuloQuantidadeVotosTotal=" + nuloQuantidadeVotosTotal +
                ", nuloQuantidadeVotosTotalAcumulado=" + nuloQuantidadeVotosTotalAcumulado +
                ", nuloPercentualVotosTotalAcumulado=" + nuloPercentualVotosTotalAcumulado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomatoriaPresitente that = (SomatoriaPresitente) o;
        return codigoPleito.equals(that.codigoPleito) && codigoEleicao.equals(that.codigoEleicao) && codigoCargo.equals(that.codigoCargo) && siglaUF.equals(that.siglaUF) && dataTotalizacao.equals(that.dataTotalizacao) && quantidadeSecaoTotal.equals(that.quantidadeSecaoTotal) && quantidadeSecoesAptosTotal.equals(that.quantidadeSecoesAptosTotal) && quantidadeSecoesTotal.equals(that.quantidadeSecoesTotal) && quantidadeSecoesTotalAcumulado.equals(that.quantidadeSecoesTotalAcumulado) && percentualSecoesTotalAcumulado.equals(that.percentualSecoesTotalAcumulado) && quantidadeSecoesAptosTotal.equals(that.quantidadeSecoesAptosTotal) && quantidadeAptosTotalAcumulado.equals(that.quantidadeAptosTotalAcumulado) && quantidadeVotosTotal.equals(that.quantidadeVotosTotal) && quantidadeVotosTotalAcumulado.equals(that.quantidadeVotosTotalAcumulado) && quantidadeDeVotosConcorrentes.equals(that.quantidadeDeVotosConcorrentes) && quantidadeDeVotosConcorrentesAcumulado.equals(that.quantidadeDeVotosConcorrentesAcumulado) && lulaQuantidadeTotalDeVotos.equals(that.lulaQuantidadeTotalDeVotos) && lulaQuantidadeVotosTotAcumulado.equals(that.lulaQuantidadeVotosTotAcumulado) && lulaPercentualVotosTotalAcumulado.equals(that.lulaPercentualVotosTotalAcumulado) && jairBolsonaroQuantidadeVotosTotal.equals(that.jairBolsonaroQuantidadeVotosTotal) && jairBolsonaroQuantidadeVotosTotalAcumulado.equals(that.jairBolsonaroQuantidadeVotosTotalAcumulado) && jairBolsonaroPercentualVotosTotalAcumulado.equals(that.jairBolsonaroPercentualVotosTotalAcumulado) && brancoQuantidadeDeVotosAcumulado.equals(that.brancoQuantidadeDeVotosAcumulado) && brancoQuantidadeVotosTotalAcumulado.equals(that.brancoQuantidadeVotosTotalAcumulado) && brancPercentualVotosTotalAcumulado.equals(that.brancPercentualVotosTotalAcumulado) && nuloQuantidadeVotosTotal.equals(that.nuloQuantidadeVotosTotal) && nuloQuantidadeVotosTotalAcumulado.equals(that.nuloQuantidadeVotosTotalAcumulado) && nuloPercentualVotosTotalAcumulado.equals(that.nuloPercentualVotosTotalAcumulado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoPleito, codigoEleicao, codigoCargo, siglaUF, dataTotalizacao, quantidadeSecaoTotal, quantidadeSecoesAptosTotal, quantidadeSecoesTotal, quantidadeSecoesTotalAcumulado, percentualSecoesTotalAcumulado, quantidadeSecoesAptosTotal, quantidadeAptosTotalAcumulado, quantidadeVotosTotal, quantidadeVotosTotalAcumulado, quantidadeDeVotosConcorrentes, quantidadeDeVotosConcorrentesAcumulado, lulaQuantidadeTotalDeVotos, lulaQuantidadeVotosTotAcumulado, lulaPercentualVotosTotalAcumulado, jairBolsonaroQuantidadeVotosTotal, jairBolsonaroQuantidadeVotosTotalAcumulado, jairBolsonaroPercentualVotosTotalAcumulado, brancoQuantidadeDeVotosAcumulado, brancoQuantidadeVotosTotalAcumulado, brancPercentualVotosTotalAcumulado, nuloQuantidadeVotosTotal, nuloQuantidadeVotosTotalAcumulado, nuloPercentualVotosTotalAcumulado);
    }
}
