
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
public class Int {

    private String HighestScore;
    private String FastestCompletionTime;
    private List<String> Skulls = new ArrayList<String>();
    private String TotalTimesCompleted;
    private String AllSkullsOn;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The HighestScore
     */
    public String getHighestScore() {
        return HighestScore;
    }

    /**
     * 
     * @param HighestScore
     *     The HighestScore
     */
    public void setHighestScore(String HighestScore) {
        this.HighestScore = HighestScore;
    }

    /**
     * 
     * @return
     *     The FastestCompletionTime
     */
    public String getFastestCompletionTime() {
        return FastestCompletionTime;
    }

    /**
     * 
     * @param FastestCompletionTime
     *     The FastestCompletionTime
     */
    public void setFastestCompletionTime(String FastestCompletionTime) {
        this.FastestCompletionTime = FastestCompletionTime;
    }

    /**
     * 
     * @return
     *     The Skulls
     */
    public List<String> getSkulls() {
        return Skulls;
    }

    /**
     * 
     * @param Skulls
     *     The Skulls
     */
    public void setSkulls(List<String> Skulls) {
        this.Skulls = Skulls;
    }

    /**
     * 
     * @return
     *     The TotalTimesCompleted
     */
    public String getTotalTimesCompleted() {
        return TotalTimesCompleted;
    }

    /**
     * 
     * @param TotalTimesCompleted
     *     The TotalTimesCompleted
     */
    public void setTotalTimesCompleted(String TotalTimesCompleted) {
        this.TotalTimesCompleted = TotalTimesCompleted;
    }

    /**
     * 
     * @return
     *     The AllSkullsOn
     */
    public String getAllSkullsOn() {
        return AllSkullsOn;
    }

    /**
     * 
     * @param AllSkullsOn
     *     The AllSkullsOn
     */
    public void setAllSkullsOn(String AllSkullsOn) {
        this.AllSkullsOn = AllSkullsOn;
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
        return new HashCodeBuilder().append(HighestScore).append(FastestCompletionTime).append(Skulls).append(TotalTimesCompleted).append(AllSkullsOn).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Int) == false) {
            return false;
        }
        Int rhs = ((Int) other);
        return new EqualsBuilder().append(HighestScore, rhs.HighestScore).append(FastestCompletionTime, rhs.FastestCompletionTime).append(Skulls, rhs.Skulls).append(TotalTimesCompleted, rhs.TotalTimesCompleted).append(AllSkullsOn, rhs.AllSkullsOn).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
