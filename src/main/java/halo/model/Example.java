
package halo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Example {

    private List<Result> results = new ArrayList<Result>();
    private Object links;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Results
     */
    public List<Result> getResults() {
        return Results;
    }

    /**
     * 
     * @param Results
     *     The Results
     */
    public void setResults(List<Result> Results) {
        this.Results = Results;
    }

    /**
     * 
     * @return
     *     The Links
     */
    public Object getLinks() {
        return Links;
    }

    /**
     * 
     * @param Links
     *     The Links
     */
    public void setLinks(Object Links) {
        this.Links = Links;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Results).append(Links).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Example) == false) {
            return false;
        }
        Example rhs = ((Example) other);
        return new EqualsBuilder().append(Results, rhs.Results).append(Links, rhs.Links).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
