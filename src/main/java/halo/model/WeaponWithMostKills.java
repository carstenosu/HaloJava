
package halo.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class WeaponWithMostKills {

    private halo.model.WeaponId WeaponId;
    private String TotalShotsFired;
    private String TotalShotsLanded;
    private String TotalHeadshots;
    private String TotalKills;
    private String TotalDamageDealt;
    private String TotalPossessionTime;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The WeaponId
     */
    public halo.model.WeaponId getWeaponId() {
        return WeaponId;
    }

    /**
     * 
     * @param WeaponId
     *     The WeaponId
     */
    public void setWeaponId(halo.model.WeaponId WeaponId) {
        this.WeaponId = WeaponId;
    }

    /**
     * 
     * @return
     *     The TotalShotsFired
     */
    public String getTotalShotsFired() {
        return TotalShotsFired;
    }

    /**
     * 
     * @param TotalShotsFired
     *     The TotalShotsFired
     */
    public void setTotalShotsFired(String TotalShotsFired) {
        this.TotalShotsFired = TotalShotsFired;
    }

    /**
     * 
     * @return
     *     The TotalShotsLanded
     */
    public String getTotalShotsLanded() {
        return TotalShotsLanded;
    }

    /**
     * 
     * @param TotalShotsLanded
     *     The TotalShotsLanded
     */
    public void setTotalShotsLanded(String TotalShotsLanded) {
        this.TotalShotsLanded = TotalShotsLanded;
    }

    /**
     * 
     * @return
     *     The TotalHeadshots
     */
    public String getTotalHeadshots() {
        return TotalHeadshots;
    }

    /**
     * 
     * @param TotalHeadshots
     *     The TotalHeadshots
     */
    public void setTotalHeadshots(String TotalHeadshots) {
        this.TotalHeadshots = TotalHeadshots;
    }

    /**
     * 
     * @return
     *     The TotalKills
     */
    public String getTotalKills() {
        return TotalKills;
    }

    /**
     * 
     * @param TotalKills
     *     The TotalKills
     */
    public void setTotalKills(String TotalKills) {
        this.TotalKills = TotalKills;
    }

    /**
     * 
     * @return
     *     The TotalDamageDealt
     */
    public String getTotalDamageDealt() {
        return TotalDamageDealt;
    }

    /**
     * 
     * @param TotalDamageDealt
     *     The TotalDamageDealt
     */
    public void setTotalDamageDealt(String TotalDamageDealt) {
        this.TotalDamageDealt = TotalDamageDealt;
    }

    /**
     * 
     * @return
     *     The TotalPossessionTime
     */
    public String getTotalPossessionTime() {
        return TotalPossessionTime;
    }

    /**
     * 
     * @param TotalPossessionTime
     *     The TotalPossessionTime
     */
    public void setTotalPossessionTime(String TotalPossessionTime) {
        this.TotalPossessionTime = TotalPossessionTime;
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
        return new HashCodeBuilder().append(WeaponId).append(TotalShotsFired).append(TotalShotsLanded).append(TotalHeadshots).append(TotalKills).append(TotalDamageDealt).append(TotalPossessionTime).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WeaponWithMostKills) == false) {
            return false;
        }
        WeaponWithMostKills rhs = ((WeaponWithMostKills) other);
        return new EqualsBuilder().append(WeaponId, rhs.WeaponId).append(TotalShotsFired, rhs.TotalShotsFired).append(TotalShotsLanded, rhs.TotalShotsLanded).append(TotalHeadshots, rhs.TotalHeadshots).append(TotalKills, rhs.TotalKills).append(TotalDamageDealt, rhs.TotalDamageDealt).append(TotalPossessionTime, rhs.TotalPossessionTime).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
