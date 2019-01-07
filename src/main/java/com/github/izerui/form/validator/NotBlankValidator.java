package com.github.izerui.form.validator;


import com.github.izerui.form.ValidatorException;

import static org.apache.commons.validator.GenericValidator.isBlankOrNull;

/**
 * Created by serv on 2017/5/18.
 */
public class NotBlankValidator implements Validator<String>{
    @Override
    public boolean isValid(Object obj, Property<String> property) throws ValidatorException {
        return !isBlankOrNull(property.getValue());
    }

    @Override
    public String name() {
        return "not_blank";
    }

    @Override
    public Class<String> pType() {
        return String.class;
    }
}
