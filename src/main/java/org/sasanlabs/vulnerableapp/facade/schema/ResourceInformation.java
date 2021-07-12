package org.sasanlabs.vulnerableapp.facade.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** @author preetkaran20@gmail.com KSASAN */
public class ResourceInformation {

    @JsonProperty("htmlResource")
    private ResourceURI htmlResource;

    @JsonProperty("staticResources")
    private List<ResourceURI> staticResources;

    public ResourceURI getHtmlResource() {
        return htmlResource;
    }

    public void setHtmlResource(ResourceURI htmlResource) {
        this.htmlResource = htmlResource;
    }

    public List<ResourceURI> getStaticResources() {
        return staticResources;
    }

    public void setStaticResources(List<ResourceURI> staticResources) {
        this.staticResources = staticResources;
    }
}
