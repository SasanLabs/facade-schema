package org.sasanlabs.vulnerableapp.facade.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChallengeCardPayload {

    @JsonProperty("description")
    private String description;

    @JsonProperty("value")
    private String value;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
