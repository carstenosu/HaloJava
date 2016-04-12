
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
public class WeaponId {

    private String StockId;
    private List<String> Attachments = new ArrayList<String>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The StockId
     */
    public String getStockId() {
        return StockId;
    }

    /**
     * 
     * @param StockId
     *     The StockId
     */
    public void setStockId(String StockId) {
        this.StockId = StockId;
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
        return new HashCodeBuilder().append(StockId).append(Attachments).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WeaponId) == false) {
            return false;
        }
        WeaponId rhs = ((WeaponId) other);
        return new EqualsBuilder().append(StockId, rhs.StockId).append(Attachments, rhs.Attachments).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
