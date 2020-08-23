package com.smlnskgmail.jaman.hashcheckerlite.calculator.jdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.smlnskgmail.jaman.hashcheckerlite.logic.hashcalculator.HashType;
import com.smlnskgmail.jaman.hashcheckerlite.logic.hashcalculator.jdk.JdkHashCalculator;

import org.junit.Before;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public abstract class BaseJdkHashCalculatorTest {

    private static final String TESTING_TEXT = "TEST";
    private static final String TESTING_FILE = "test.zip";

    private JdkHashCalculator jdkHashCalculator;
//    private Context context;

    @Before
    public void initializeResources() throws NoSuchAlgorithmException {
//        context = InstrumentationRegistry.getContext();
        HashType hashType = getHashType();

        assertNotNull(hashType);

        jdkHashCalculator = new JdkHashCalculator();
        jdkHashCalculator.setHashType(hashType);
    }

    @Test
    public void checkText() {
        String hashValue = getHashValueForTestText();
        assertNotNull(hashValue);

        String hashFromString = jdkHashCalculator.fromString(getTestingText());
        assertNotNull(hashFromString);

        assertEquals(hashValue, hashFromString);
    }

    public String getTestingText() {
        return TESTING_TEXT;
    }

    @Test
    public void checkFile() throws Exception {
//        String hashValue = getHashValueForTestFile();
//        assertNotNull(hashValue);
//
//        String hashFromFile = jdkHashCalculator.fromFile(
//                context.getResources().getAssets().open(getTestingFile())
//        );
//
//        assertNotNull(hashFromFile);
//        assertEquals(hashValue, hashFromFile);
    }

    private String getTestingFile() {
        return TESTING_FILE;
    }

    @NonNull
    protected abstract HashType getHashType();

    @Nullable
    protected abstract String getHashValueForTestText();

    @Nullable
    protected abstract String getHashValueForTestFile();

}