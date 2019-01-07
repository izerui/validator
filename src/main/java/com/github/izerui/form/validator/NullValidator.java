package com.github.izerui.form.validator;

import com.github.izerui.form.ValidatorException;

/**
 * 空验证器
 * Created by serv on 2016/12/5.
 */
public class NullValidator implements Validator<Object> {

    @Override
    public boolean isValid(Object obj, Property<Object> property) throws ValidatorException {
        return property.getValue()==null;
    }

    @Override
    public String name() {
        return "null";
    }

    @Override
    public Class<Object> pType() {
        return Object.class;
    }
}
