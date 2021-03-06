/**
 * Copyright 2013 Nitor Creations Oy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nitorcreations.robotframework.eclipseide.editors.outline;

import com.nitorcreations.robotframework.eclipseide.structure.ParsedString;

public class ParsedStringEntry {
    final RootCategoryEntry parent;
    final ParsedString parsedString;

    public ParsedStringEntry(RootCategoryEntry parent, ParsedString parsedString) {
        this.parent = parent;
        this.parsedString = parsedString;
    }

    public RootCategoryEntry getParent() {
        assert parent != null;
        return parent;
    }

    @Override
    public String toString() {
        return parsedString.getValue();
    }
}