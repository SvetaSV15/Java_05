package Utils;

public class Utils {
    public static boolean isStringNotNullAndNotEmpty(String text) {
        if (text != null)

            return !text.trim().isEmpty();

        return false;
    }
}
