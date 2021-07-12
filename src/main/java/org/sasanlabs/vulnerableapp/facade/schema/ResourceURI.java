package org.sasanlabs.vulnerableapp.facade.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/** @author preetkaran20@gmail.com KSASAN */
public class ResourceURI {

    @JsonProperty("resourceType")
    private String resourceType = ResourceType.HTML.name();

    @JsonProperty("isAbsolute")
    private boolean isAbsolute;

    @JsonProperty("uri")
    private String uri;

    public ResourceURI(boolean isAbsolute, String uri) {
        super();
        this.isAbsolute = isAbsolute;
        this.uri = uri;
    }

    public ResourceURI(boolean isAbsolute, String uri, String resourceType) {
        super();
        this.isAbsolute = isAbsolute;
        this.uri = uri;
        this.resourceType = resourceType;
    }

    public boolean isAbsolute() {
        return isAbsolute;
    }

    public String getUri() {
        return uri;
    }

    public String getResourceType() {
        return resourceType;
    }
}
