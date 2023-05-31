package fr.eni.movielibrary.bo;

import java.util.ArrayList;
import java.util.List;

public class ProcessResult {
    List<FormError> errors = new ArrayList<>();

    public List<FormError> getErrors() {
        return errors;
    }

    public void addError(FormError error) {
        errors.add(error);
    }

    public boolean isValid() {
        return errors.size() == 0;
    }
}
