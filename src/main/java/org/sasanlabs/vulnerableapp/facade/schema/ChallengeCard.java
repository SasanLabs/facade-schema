package org.sasanlabs.vulnerableapp.facade.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

public class ChallengeCard {

    @JsonProperty("challengeText")
    private String challengeText;

    @JsonProperty("hints")
    private List<ChallengeCardHint> hints = new ArrayList<>();

    @JsonProperty("payload")
    private ChallengeCardPayload payload;

    public String getChallengeText() {
        return this.challengeText;
    }

    public void setChallengeText(String challengeText) {
        this.challengeText = challengeText;
    }

    public List<ChallengeCardHint> getHints() {
        return this.hints;
    }

    public void setHints(List<ChallengeCardHint> hints) {
        this.hints = hints;
    }

    public ChallengeCardPayload getPayload() {
        return this.payload;
    }

    public void setPayload(ChallengeCardPayload payload) {
        this.payload = payload;
    }
}
