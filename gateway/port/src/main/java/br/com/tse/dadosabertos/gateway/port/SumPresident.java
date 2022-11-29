package br.com.tse.dadosabertos.gateway.port;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class SumPresident implements Serializable {
    private Integer codigoPleito;
    private Integer codigoEleicao;
    private Integer codigoCargo;
    private String siglaUF;
    private String dataTotalizacao;
    private BigDecimal quantidadeSecaoTotal;
    private BigDecimal quantidadeSecoesAptosTotal;
    private BigDecimal quantidadeSecoesTotal;
    private BigDecimal quantidadeSecoesTotalAcumulado;
    private BigDecimal percentualSecoesTotalAcumulado;
    private BigDecimal quantidadeAptosTotal;
    private BigDecimal quantidadeAptosTotalAcumulado;
    private BigDecimal quantidadeVotosTotal;
    private BigDecimal quantidadeVotosTotalAcumulado;
    private BigDecimal quantidadeDeVotosConcorrentes;
    private BigDecimal quantidadeDeVotosConcorrentesAcumulado;
    private BigDecimal lulaQuantidadeTotalDeVotos;
    private BigDecimal lulaQuantidadeVotosTotAcumulado;
    private BigDecimal lulaPercentualVotosTotalAcumulado;
    private BigDecimal jairBolsonaroQuantidadeVotosTotal;
    private BigDecimal jairBolsonaroQuantidadeVotosTotalAcumulado;
    private BigDecimal jairBolsonaroPercentualVotosTotalAcumulado;
    private BigDecimal brancoQuantidadeDeVotos;
    private BigDecimal brancoQuantidadeVotosTotalAcumulado;
    private BigDecimal brancPercentualVotosTotalAcumulado;
    private BigDecimal nuloQuantidadeVotosTotal;
    private BigDecimal nuloQuantidadeVotosTotalAcumulado;
    private BigDecimal nuloPercentualVotosTotalAcumulado;

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

    public BigDecimal getPercentualSecoesTotalAcumulado() {
        return percentualSecoesTotalAcumulado;
    }

    public void setPercentualSecoesTotalAcumulado(BigDecimal percentualSecoesTotalAcumulado) {
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

    public BigDecimal getLulaPercentualVotosTotalAcumulado() {
        return lulaPercentualVotosTotalAcumulado;
    }

    public void setLulaPercentualVotosTotalAcumulado(BigDecimal lulaPercentualVotosTotalAcumulado) {
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

    public BigDecimal getJairBolsonaroPercentualVotosTotalAcumulado() {
        return jairBolsonaroPercentualVotosTotalAcumulado;
    }

    public void setJairBolsonaroPercentualVotosTotalAcumulado(BigDecimal jairBolsonaroPercentualVotosTotalAcumulado) {
        this.jairBolsonaroPercentualVotosTotalAcumulado = jairBolsonaroPercentualVotosTotalAcumulado;
    }

    public BigDecimal getBrancoQuantidadeDeVotos() {
        return brancoQuantidadeDeVotos;
    }

    public void setBrancoQuantidadeDeVotos(BigDecimal brancoQuantidadeDeVotos) {
        this.brancoQuantidadeDeVotos = brancoQuantidadeDeVotos;
    }

    public BigDecimal getBrancoQuantidadeVotosTotalAcumulado() {
        return brancoQuantidadeVotosTotalAcumulado;
    }

    public void setBrancoQuantidadeVotosTotalAcumulado(BigDecimal brancoQuantidadeVotosTotalAcumulado) {
        this.brancoQuantidadeVotosTotalAcumulado = brancoQuantidadeVotosTotalAcumulado;
    }

    public BigDecimal getBrancPercentualVotosTotalAcumulado() {
        return brancPercentualVotosTotalAcumulado;
    }

    public void setBrancPercentualVotosTotalAcumulado(BigDecimal brancPercentualVotosTotalAcumulado) {
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

    public BigDecimal getNuloPercentualVotosTotalAcumulado() {
        return nuloPercentualVotosTotalAcumulado;
    }

    public void setNuloPercentualVotosTotalAcumulado(BigDecimal nuloPercentualVotosTotalAcumulado) {
        this.nuloPercentualVotosTotalAcumulado = nuloPercentualVotosTotalAcumulado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SumPresident that = (SumPresident) o;
        return Objects.equals(codigoPleito, that.codigoPleito) && Objects.equals(codigoEleicao, that.codigoEleicao) && Objects.equals(codigoCargo, that.codigoCargo) && Objects.equals(siglaUF, that.siglaUF) && Objects.equals(dataTotalizacao, that.dataTotalizacao) && Objects.equals(quantidadeSecaoTotal, that.quantidadeSecaoTotal) && Objects.equals(quantidadeSecoesAptosTotal, that.quantidadeSecoesAptosTotal) && Objects.equals(quantidadeSecoesTotal, that.quantidadeSecoesTotal) && Objects.equals(quantidadeSecoesTotalAcumulado, that.quantidadeSecoesTotalAcumulado) && Objects.equals(percentualSecoesTotalAcumulado, that.percentualSecoesTotalAcumulado) && Objects.equals(quantidadeAptosTotal, that.quantidadeAptosTotal) && Objects.equals(quantidadeAptosTotalAcumulado, that.quantidadeAptosTotalAcumulado) && Objects.equals(quantidadeVotosTotal, that.quantidadeVotosTotal) && Objects.equals(quantidadeVotosTotalAcumulado, that.quantidadeVotosTotalAcumulado) && Objects.equals(quantidadeDeVotosConcorrentes, that.quantidadeDeVotosConcorrentes) && Objects.equals(quantidadeDeVotosConcorrentesAcumulado, that.quantidadeDeVotosConcorrentesAcumulado) && Objects.equals(lulaQuantidadeTotalDeVotos, that.lulaQuantidadeTotalDeVotos) && Objects.equals(lulaQuantidadeVotosTotAcumulado, that.lulaQuantidadeVotosTotAcumulado) && Objects.equals(lulaPercentualVotosTotalAcumulado, that.lulaPercentualVotosTotalAcumulado) && Objects.equals(jairBolsonaroQuantidadeVotosTotal, that.jairBolsonaroQuantidadeVotosTotal) && Objects.equals(jairBolsonaroQuantidadeVotosTotalAcumulado, that.jairBolsonaroQuantidadeVotosTotalAcumulado) && Objects.equals(jairBolsonaroPercentualVotosTotalAcumulado, that.jairBolsonaroPercentualVotosTotalAcumulado) && Objects.equals(brancoQuantidadeDeVotos, that.brancoQuantidadeDeVotos) && Objects.equals(brancoQuantidadeVotosTotalAcumulado, that.brancoQuantidadeVotosTotalAcumulado) && Objects.equals(brancPercentualVotosTotalAcumulado, that.brancPercentualVotosTotalAcumulado) && Objects.equals(nuloQuantidadeVotosTotal, that.nuloQuantidadeVotosTotal) && Objects.equals(nuloQuantidadeVotosTotalAcumulado, that.nuloQuantidadeVotosTotalAcumulado) && Objects.equals(nuloPercentualVotosTotalAcumulado, that.nuloPercentualVotosTotalAcumulado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoPleito, codigoEleicao, codigoCargo, siglaUF, dataTotalizacao, quantidadeSecaoTotal, quantidadeSecoesAptosTotal, quantidadeSecoesTotal, quantidadeSecoesTotalAcumulado, percentualSecoesTotalAcumulado, quantidadeAptosTotal, quantidadeAptosTotalAcumulado, quantidadeVotosTotal, quantidadeVotosTotalAcumulado, quantidadeDeVotosConcorrentes, quantidadeDeVotosConcorrentesAcumulado, lulaQuantidadeTotalDeVotos, lulaQuantidadeVotosTotAcumulado, lulaPercentualVotosTotalAcumulado, jairBolsonaroQuantidadeVotosTotal, jairBolsonaroQuantidadeVotosTotalAcumulado, jairBolsonaroPercentualVotosTotalAcumulado, brancoQuantidadeDeVotos, brancoQuantidadeVotosTotalAcumulado, brancPercentualVotosTotalAcumulado, nuloQuantidadeVotosTotal, nuloQuantidadeVotosTotalAcumulado, nuloPercentualVotosTotalAcumulado);
    }
}
