package com.ywxiang.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangyaowei
 * @date 2021/11/16
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue value) {
        for (int i = 0; i < this.propertyValueList.size(); i++) {
            PropertyValue propertyValue = this.propertyValueList.get(i);
            if (propertyValue.getName().equals(value.getName())) {
                this.propertyValueList.set(i, value);
                return;
            }
        }
        this.propertyValueList.add(value);
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue propertyValue : propertyValueList) {
            if (propertyValue.getName().equals(propertyName)) {
                return propertyValue;
            }
        }
        return null;
    }

    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public List<PropertyValue> getPropertyValueList() {
        return propertyValueList;
    }
}
