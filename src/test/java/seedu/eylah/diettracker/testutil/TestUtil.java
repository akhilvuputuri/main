package seedu.eylah.diettracker.testutil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import seedu.eylah.commons.core.index.Index;
import seedu.eylah.diettracker.model.DietModel;
import seedu.eylah.diettracker.model.food.Food;

/**
 * A utility class for test cases.
 */
public class TestUtil {

    /**
     * Folder used for temp files created during testing. Ignored by Git.
     */
    private static final Path SANDBOX_FOLDER = Paths.get("src", "test", "data", "sandbox");

    /**
     * Appends {@code fileName} to the sandbox folder path and returns the resulting path.
     * Creates the sandbox folder if it doesn't exist.
     */
    public static Path getFilePathInSandboxFolder(String fileName) {
        try {
            Files.createDirectories(SANDBOX_FOLDER);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return SANDBOX_FOLDER.resolve(fileName);
    }

    /**
     * Returns the middle index of the food in the {@code model}'s food list.
     */
    public static Index getMidIndex(DietModel model) {
        return Index.fromOneBased(model.getFilteredFoodList().size() / 2);
    }

    /**
     * Returns the last index of the food in the {@code model}'s food list.
     */
    public static Index getLastIndex(DietModel model) {
        return Index.fromOneBased(model.getFilteredFoodList().size());
    }

    /**
     * Returns the food in the {@code model}'s food list at {@code index}.
     */
    public static Food getFood(DietModel model, Index index) {
        return model.getFilteredFoodList().get(index.getZeroBased());
    }
}
