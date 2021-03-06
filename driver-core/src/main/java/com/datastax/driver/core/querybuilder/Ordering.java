/*
 *      Copyright (C) 2012 DataStax Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.datastax.driver.core.querybuilder;

public class Ordering extends Utils.Appendeable {

    private final String name;
    private final boolean isDesc;

    Ordering(String name, boolean isDesc) {
        this.name = name;
        this.isDesc = isDesc;
    }

    void appendTo(StringBuilder sb) {
        Utils.appendName(name, sb);
        sb.append(isDesc ? " DESC" : " ASC");
    }
}
