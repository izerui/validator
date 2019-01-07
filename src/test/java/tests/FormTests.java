package tests;

import com.github.izerui.form.Results;
import com.github.izerui.form.ValidatorContext;
import com.github.izerui.form.ValidatorContextImpl;
import com.github.izerui.form.parser.Form;
import com.github.izerui.form.parser.Parser;
import com.github.izerui.form.validator.Validator;
import com.github.izerui.form.validator.ValidatorFactory;
import org.junit.Test;

import java.util.List;

public class FormTests {

    @Test
    public void validateForm() throws Exception {
        List<Validator> validators = new ValidatorFactory().getValidators();
        List<Form> forms = new Parser().parser(ClassLoader.getSystemClassLoader().getResource("demos/validation.xml"));

        ValidatorContext validatorContext = new ValidatorContextImpl(validators,forms);


        User user = new User();
        user.setName("测试");
        user.setEmail("sdfj3333");
        user.setDateFormat("2018-09-09 12:00:00");

        Results results = validatorContext.validate("ent_type_1", user);
        System.out.println(results);


    }
}
