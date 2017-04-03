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
package difflib.algorithm.myers;

/**
 * Base class for all exceptions emanating from this package.
 *
 * @version $Revision: 69 $ $Date: 2003-10-13 11:00:44 +0300 (Пнд, 13 Окт 2003) $
 *
 * @author <a href="mailto:juanco@suigeneris.org">Juanco Anez</a>
 */
public class DiffException extends Exception {

    private static final long serialVersionUID = 1L;

    public DiffException() {
    }

    public DiffException(String msg) {
        super(msg);
    }
}
