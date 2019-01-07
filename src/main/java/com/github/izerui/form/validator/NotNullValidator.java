package com.github.izerui.form.validator;


import com.github.izerui.form.ValidatorException;

/**
 * 非空验证
 * Created by serv on 2016/12/5.
 */
public class NotNullValidator implements Validator<Object> {

    @Override
    public boolean isValid(Object obj, Property<Object> property) throws ValidatorException {
        return property.getValue() != null;
    }

    @Override
    public String name() {
        return "not_null";
    }

    @Override
    public Class<Object> pType() {
        return Object.class;
    }
}
