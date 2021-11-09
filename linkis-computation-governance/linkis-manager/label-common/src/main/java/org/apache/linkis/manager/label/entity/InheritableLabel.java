/*
 * Copyright 2019 WeBank
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

package org.apache.linkis.manager.label.entity;


/**
 * Mutable label
 */
public class InheritableLabel<T> extends SerializableLabel<T> {

    private static final String FEATURE_KEY = "feature";

    private String labelKey;

    private Feature feature;

    public void setLabelKey(String labelKey){
        this.labelKey = labelKey;
    }


    @Deprecated
    public void setFeature(Feature feature){
        this.feature = feature;
    }

    @Override
    public final String getLabelKey() {
        return labelKey;
    }

    @Override
    public final T getValue() {
        return value;
    }

    @Override
    public Feature getFeature() {
        return feature;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String getFeatureKey() {
        return FEATURE_KEY;
    }
}