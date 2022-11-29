package br.com.tse.dadosabertos.metrics.port;

import java.math.BigDecimal;

public class Gauge {

    private final VoteType voteType;
    private final BigDecimal quantity;

    public Gauge(VoteType voteType, BigDecimal quantity) {
        this.voteType = voteType;
        this.quantity = quantity;
    }

    public VoteType getVoteType() {
        return voteType;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }
}
