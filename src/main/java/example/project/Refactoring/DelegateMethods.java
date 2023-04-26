package example.project.Refactoring;

public class DelegateMethods {

    /**
     * This method creates a random integer ranging from min to max.
     * However, this method is private and cannot be accessed from outside of this class.
     * To use this method, we need to create a public method that delegates the call to this method.
     *
     * @param min The minimum number (inclusive).
     * @param max The maximum number (exclusive).
     * @return A random integer ranging from min to max.
     */
    private static int createRandomValue(int min, int max) {
        return min + (int) (Math.random() * (max - min));
    }

    /**
     * We want to hide the possibility of controlling the minimum value.
     * So, we create a public method that delegates the call to `createRandomValue()` method with only the max param.
     * TODO: complete the method below using `delegate methods` refactoring technique.
     * TODO: note that only the max parameter is used.
     *
     * @param max The maximum number (exclusive).
     * @return A random integer ranging from 0 to max.
     */
    public static int createRandomInteger(int max) {
        // TODO: delegate the call to `createRandomValue()` method.
        return -1;
    }
}
