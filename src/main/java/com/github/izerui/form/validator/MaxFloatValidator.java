package com.github.izerui.form.validator;

import com.github.izerui.form.ValidatorException;

import static org.apache.commons.validator.GenericTypeValidator.formatFloat;
import static org.apache.commons.validator.GenericValidator.maxValue;

/**
 * float最大验证器
 * Created by serv on 2016/12/6.
 */
public class MaxFloatValidator implements Validator<Float> {
    @Override
    public boolean isValid(Object obj, Property<Float> property) throws ValidatorException {
        return maxValue(property.getValue(), formatFloat(property.getVar()));
    }

    @Override
    public String name() {
        return "max";
    }

    @Override
    public Class<Float> pType() {
        return Float.class;
    }
}
