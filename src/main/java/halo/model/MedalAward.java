
package halo.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class MedalAward {

    private String MedalId;
    private String Count;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The MedalId
     */
    public String getMedalId() {
        return MedalId;
    }

    /**
     * 
     * @param MedalId
     *     The MedalId
     */
    public void setMedalId(String MedalId) {
        this.MedalId = MedalId;
    }

    /**
     * 
     * @return
     *     The Count
     */
    public String getCount() {
        return Count;
    }

    /**
     * 
     * @param Count
     *     The Count
     */
    public void setCount(String Count) {
        this.Count = Count;
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
        return new HashCodeBuilder().append(MedalId).append(Count).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedalAward) == false) {
            return false;
        }
        MedalAward rhs = ((MedalAward) other);
        return new EqualsBuilder().append(MedalId, rhs.MedalId).append(Count, rhs.Count).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
