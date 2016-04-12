
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
public class FlexibleStats {

    private List<MedalStatCount> MedalStatCounts = new ArrayList<MedalStatCount>();
    private List<ImpulseStatCount> ImpulseStatCounts = new ArrayList<ImpulseStatCount>();
    private List<MedalTimelapse> MedalTimelapses = new ArrayList<MedalTimelapse>();
    private List<ImpulseTimelapse> ImpulseTimelapses = new ArrayList<ImpulseTimelapse>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The MedalStatCounts
     */
    public List<MedalStatCount> getMedalStatCounts() {
        return MedalStatCounts;
    }

    /**
     * 
     * @param MedalStatCounts
     *     The MedalStatCounts
     */
    public void setMedalStatCounts(List<MedalStatCount> MedalStatCounts) {
        this.MedalStatCounts = MedalStatCounts;
    }

    /**
     * 
     * @return
     *     The ImpulseStatCounts
     */
    public List<ImpulseStatCount> getImpulseStatCounts() {
        return ImpulseStatCounts;
    }

    /**
     * 
     * @param ImpulseStatCounts
     *     The ImpulseStatCounts
     */
    public void setImpulseStatCounts(List<ImpulseStatCount> ImpulseStatCounts) {
        this.ImpulseStatCounts = ImpulseStatCounts;
    }

    /**
     * 
     * @return
     *     The MedalTimelapses
     */
    public List<MedalTimelapse> getMedalTimelapses() {
        return MedalTimelapses;
    }

    /**
     * 
     * @param MedalTimelapses
     *     The MedalTimelapses
     */
    public void setMedalTimelapses(List<MedalTimelapse> MedalTimelapses) {
        this.MedalTimelapses = MedalTimelapses;
    }

    /**
     * 
     * @return
     *     The ImpulseTimelapses
     */
    public List<ImpulseTimelapse> getImpulseTimelapses() {
        return ImpulseTimelapses;
    }

    /**
     * 
     * @param ImpulseTimelapses
     *     The ImpulseTimelapses
     */
    public void setImpulseTimelapses(List<ImpulseTimelapse> ImpulseTimelapses) {
        this.ImpulseTimelapses = ImpulseTimelapses;
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
        return new HashCodeBuilder().append(MedalStatCounts).append(ImpulseStatCounts).append(MedalTimelapses).append(ImpulseTimelapses).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlexibleStats) == false) {
            return false;
        }
        FlexibleStats rhs = ((FlexibleStats) other);
        return new EqualsBuilder().append(MedalStatCounts, rhs.MedalStatCounts).append(ImpulseStatCounts, rhs.ImpulseStatCounts).append(MedalTimelapses, rhs.MedalTimelapses).append(ImpulseTimelapses, rhs.ImpulseTimelapses).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
