package seedu.address.model.self;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Objects;

/**
 * Represents a User in the diet tracker of EYLAH.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Self {

    // Data fields
    private final Height height;
    private final Weight weight;

    /**
     * Every field must be present
     * height and weight fields must not be null.
     */
    public Self(Height height, Weight weight) {
        requireAllNonNull(height, weight);
        this.height = height;
        this.weight = weight;
    }

    public Height getHeight() {
        return height;
    }

    public Weight getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(height, weight);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(" Height: ")
                .append(getHeight())
                .append(" Weight: ")
                .append(getWeight());
        return builder.toString();
    }
}
