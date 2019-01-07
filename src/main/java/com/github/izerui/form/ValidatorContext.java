package com.github.izerui.form;


import com.github.izerui.form.parser.Form;
import com.github.izerui.form.validator.Validator;

import java.util.List;

/**
 * Created by serv on 2016/12/3.
 */
public interface ValidatorContext {

    /**
     * 执行验证
     * @param form 表单名称
     * @param obj 要验证的对象
     * @return Results 验证结果
     * @throws ValidatorException
     */
    Results validate(String form, Object obj) throws ValidatorException;

    /**
     * 所有验证器
     * @return
     */
    List<Validator> getValidators();

    /**
     * 获取所有验证的表单
     * @return
     */
    List<Form> getForms();

}
