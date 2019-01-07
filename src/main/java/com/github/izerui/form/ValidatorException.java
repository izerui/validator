package com.github.izerui.form;

/**
 * Created by serv on 2016/12/3.
 */
public class ValidatorException extends Exception {

    public ValidatorException() {
        super();
    }

    public ValidatorException(String message) {
        super(message);
    }

    public ValidatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidatorException(Throwable cause) {
        super(cause);
    }
}
