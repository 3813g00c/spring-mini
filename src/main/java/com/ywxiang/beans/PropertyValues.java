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
        propertyValueList.add(value);
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue propertyValue : propertyValueList) {
            if (propertyValue.getName().equals(propertyName)) {
                return propertyValue;
            }
        }
        return null;
    }

    public List<PropertyValue> getPropertyValueList() {
        return propertyValueList;
    }
}
