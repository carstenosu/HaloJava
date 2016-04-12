
package halo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Enemy {

    private String BaseId;
    private List<String> Attachments = new ArrayList<String>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The BaseId
     */
    public String getBaseId() {
        return BaseId;
    }

    /**
     * 
     * @param BaseId
     *     The BaseId
     */
    public void setBaseId(String BaseId) {
        this.BaseId = BaseId;
    }

    /**
     * 
     * @return
     *     The Attachments
     */
    public List<String> getAttachments() {
        return Attachments;
    }

    /**
     * 
     * @param Attachments
     *     The Attachments
     */
    public void setAttachments(List<String> Attachments) {
        this.Attachments = Attachments;
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
        return new HashCodeBuilder().append(BaseId).append(Attachments).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Enemy) == false) {
            return false;
        }
        Enemy rhs = ((Enemy) other);
        return new EqualsBuilder().append(BaseId, rhs.BaseId).append(Attachments, rhs.Attachments).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
