/*-
 * #%L
 * java-diff-utils
 * %%
 * Copyright (C) 2009 - 2017 java-diff-utils
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 * #L%
 */
package difflib.text;

import java.util.LinkedList;
import java.util.List;

final class StringUtils {

    /**
     * Replaces all opening an closing tags with <code>&lt;</code> or <code>&gt;</code>.
     *
     * @param str
     * @return
     */
    public static String htmlEntites(String str) {
        return str.replace("<", "&lt;").replace(">", "&gt;");
    }

    public static String normalize(String str) {
        return htmlEntites(str).replace("\t", "    ");
    }

    public static List<String> normalize(List<String> list) {
        List<String> result = new LinkedList<>();
        for (String line : list) {
            result.add(normalize(line));
        }
        return result;
    }

    public static List<String> wrapText(List<String> list, int columnWidth) {
        List<String> result = new LinkedList<>();
        for (String line : list) {
            result.add(wrapText(line, columnWidth));
        }
        return result;
    }

    /**
     * Wrap the text with the given column width
     *
     * @param line the text
     * @param columnWidth the given column
     * @return the wrapped text
     */
    public static String wrapText(String line, int columnWidth) {
        int lenght = line.length();
        int delimiter = "<br>".length();
        int widthIndex = columnWidth;

        for (int count = 0; lenght > widthIndex; count++) {
            line = line.subSequence(0, widthIndex + delimiter * count) + "<br>"
                    + line.substring(widthIndex + delimiter * count);
            widthIndex += columnWidth;
        }

        return line;
    }
    
    private StringUtils() {
    }
}
