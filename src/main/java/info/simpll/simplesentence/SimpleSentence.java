package info.simpll.simplesentence;

import java.util.regex.Pattern;

/**
 * Match a Simple Sentence or a partial sentence<br />
 * Suitable for matching
 * <ul>
 * <li>People Names (to some extent)</li>
 * <li>Product Titles (to some extent)</li>
 * <li>Correct use of apostrophe (to some extent)</li>
 * </ul>
 *
 * @author Bhathiya
 */
public class SimpleSentence {

    private static final String SIMPLE_SENTENCE
            = "([a-zA-Z]+(\\.|\\. |'(s |re |t |m |ll )|s' | )?)+";
    private static final Pattern SIMPLE_SENTENCE_PATTERN = Pattern.compile(
            SIMPLE_SENTENCE);

    public static boolean match(String toTest) {
        if (toTest == null) {
            return false;
        }

        String trimmed = toTest.trim();

        return (trimmed.length() > 2 
                && !trimmed.startsWith("'") && !trimmed.endsWith("'")
                && SIMPLE_SENTENCE_PATTERN.matcher(trimmed).matches());
    }
}
