
package halo.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

public class CoopStats {

    private Int internal;

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
}
