package com.github.izerui.form.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidatorFactory {

    private Logger logger = LoggerFactory.getLogger(ValidatorFactory.class);


    private List<Validator> instantiationClasses(Class... classList) {
        List<Validator> list = new ArrayList<>();
        for (Class tClass : classList) {
            try {
                Class[] interfaces = tClass.getInterfaces();
                if(interfaces == null || interfaces.length == 0){
                    logger.warn("错误的验证器类型: " + tClass.getName());
                    continue;
                }
                if(!Arrays.asList(interfaces).contains(Validator.class)){
                    logger.warn("错误的验证器类型: " + tClass.getName());
                    continue;
                }
                list.add((Validator) tClass.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public List<Validator> getValidators() {
        return instantiationClasses(
                AfterNowValidator.class,
                BeforeNowValidator.class,
                BlankValidator.class,
                CreditCardValidator.class,
                DatePatternFormatValidator.class,
                EmailValidator.class,
                MaxDoubleValidator.class,
                MaxFloatValidator.class,
                MaxIntValidator.class,
                MaxLongValidator.class,
                MinDoubleValidator.class,
                MinFloatValidator.class,
                MinIntValidator.class,
                MinLongValidator.class,
                NotBlankValidator.class,
                NotNullValidator.class,
                NullValidator.class,
                Property.class,
                RangeDoubleValidator.class,
                RangeFloatValidator.class,
                RangeIntValidator.class,
                RangeLongValidator.class,
                RangeShortValidator.class,
                RegexpValidator.class,
                UrlValidator.class
        );
    }
}
