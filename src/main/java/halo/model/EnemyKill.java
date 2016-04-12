
package halo.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class EnemyKill {

    private Enemy Enemy;
    private String TotalKills;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Enemy
     */
    public Enemy getEnemy() {
        return Enemy;
    }

    /**
     * 
     * @param Enemy
     *     The Enemy
     */
    public void setEnemy(Enemy Enemy) {
        this.Enemy = Enemy;
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
        return new HashCodeBuilder().append(Enemy).append(TotalKills).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnemyKill) == false) {
            return false;
        }
        EnemyKill rhs = ((EnemyKill) other);
        return new EqualsBuilder().append(Enemy, rhs.Enemy).append(TotalKills, rhs.TotalKills).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
