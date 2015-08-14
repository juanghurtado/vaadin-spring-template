package demo.lib.model;

import org.apache.commons.lang3.builder.EqualsBuilder;

public abstract class BaseDTO {

    // Public API
    // ------------------------------------------------------------------------
    /**
     * Compares this DTO with a given one. Not instance comparing, just
     * attributes.
     *
     * @return boolean indicating if given dto is equal to this one
     */
    public boolean compareTo(Object dto) {
        return EqualsBuilder.reflectionEquals(this, dto);
    }

}
