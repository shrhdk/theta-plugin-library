/*
 * Copyright 2019 Ricoh Company, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.theta360.pluginlibrary.values;

/**
 * The mode of the OLED display.
 */
public enum OLEDMode {
    /**
     * Basic mode.
     */
    BASIC("basic"),

    /**
     * Plug-in mode.
     */
    PLUG_IN("plug-in");

    private final String value;

    OLEDMode(String value) {
        this.value = value;
    }

    /**
     * Returns the text representation of the mode.
     *
     * @return The text representation of the mode.
     */
    @Override
    public String toString() {
        return value;
    }
}
