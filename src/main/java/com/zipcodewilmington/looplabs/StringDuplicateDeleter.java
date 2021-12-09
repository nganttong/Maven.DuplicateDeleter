package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(number -> getOccurance(number) < maxNumberOfDuplications)
                .toArray(String[]::new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(t -> getOccurance(t) != exactNumberOfDuplications)
                .toArray(String[]::new);
    }

    public long getOccurance (String number) {
        return Arrays.stream(array)
                .filter(anotherNumber -> anotherNumber.equals(number)).count();
    }
}
