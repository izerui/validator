package com.github.izerui.form.validator;

import com.github.izerui.form.ValidatorException;
import org.apache.commons.validator.GenericValidator;

/**
 * 邮件
 * Created by serv on 2016/12/5.
 */
public class EmailValidator implements Validator<String> {

    @Override
    public boolean isValid(Object obj, Property<String> property) throws ValidatorException {
        return GenericValidator.isEmail(property.getValue());
    }

    @Override
    public Class<String> pType() {
        return String.class;
    }

    @Override
    public String name() {
        return "email";
    }
}
