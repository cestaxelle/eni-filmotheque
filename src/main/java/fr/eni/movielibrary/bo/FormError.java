package fr.eni.movielibrary.bo;

import java.util.ArrayList;

public class FormError {
    String field;
    String errorMessage;

    public FormError(String field, String errorMessage) {
        this.field = field;
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return errorMessage;
    }
}

