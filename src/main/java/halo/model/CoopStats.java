
package halo.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Generated("org.jsonschema2pojo")
public class CoopStats {

    private Int internal;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("int")
    public Int getInternal() {
        return internal;
    }

    public void setInternal(Int internal) {
        this.internal = internal;
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
        return new HashCodeBuilder().append(internal).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CoopStats) == false) {
            return false;
        }
        CoopStats rhs = ((CoopStats) other);
        return new EqualsBuilder().append(internal, rhs.internal).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
