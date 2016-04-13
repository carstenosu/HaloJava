
package halo.model.stats;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class CoopStats {

    private Internal internal;

    public Internal getInternal() {
        return internal;
    }

    public void setInternal(Internal internal) {
        this.internal = internal;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
