package org.sasanlabs.vulnerableapp.facade.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChallengeCardHint {

    @JsonProperty("order")
    private int order;

    @JsonProperty("text")
    private String text;

    public int getOrder() {
        return this.order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
