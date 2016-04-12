
package halo.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ImpulseTimelapse {

    private String Id;
    private String Timelapse;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Id
     */
    public String getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The Timelapse
     */
    public String getTimelapse() {
        return Timelapse;
    }

    /**
     * 
     * @param Timelapse
     *     The Timelapse
     */
    public void setTimelapse(String Timelapse) {
        this.Timelapse = Timelapse;
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
        return new HashCodeBuilder().append(Id).append(Timelapse).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImpulseTimelapse) == false) {
            return false;
        }
        ImpulseTimelapse rhs = ((ImpulseTimelapse) other);
        return new EqualsBuilder().append(Id, rhs.Id).append(Timelapse, rhs.Timelapse).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
