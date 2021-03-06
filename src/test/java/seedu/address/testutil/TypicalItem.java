package seedu.address.testutil;

import seedu.address.model.item.Item;

/**
 * A utility class containing a list of {@code Item} objects to be used in tests.
 */
public class TypicalItem {

    public static final Item BEERTOWER = new ItemBuilder().withName("beertower").withPrice(19.60).build();
    public static final Item STEAMBOAT = new ItemBuilder().withName("steamboat").withPrice(39.45).build();


    /**
     * Prevents public from instantiating a Typical Item.
     */
    private TypicalItem () {

    }
}
