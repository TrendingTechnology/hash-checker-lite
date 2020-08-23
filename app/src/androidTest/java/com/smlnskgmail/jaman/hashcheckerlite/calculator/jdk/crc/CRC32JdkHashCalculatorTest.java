package com.smlnskgmail.jaman.hashcheckerlite.calculator.jdk.crc;

import androidx.annotation.NonNull;

import com.smlnskgmail.jaman.hashcheckerlite.calculator.jdk.BaseJdkHashCalculatorTest;
import com.smlnskgmail.jaman.hashcheckerlite.logic.hashcalculator.HashType;

public class CRC32JdkHashCalculatorTest extends BaseJdkHashCalculatorTest {

    @NonNull
    @Override
    protected HashType getHashType() {
        return HashType.CRC_32;
    }

    @NonNull
    @Override
    protected String getHashValueForTestText() {
        return "eeea93b8";
    }

    @NonNull
    @Override
    protected String getHashValueForTestFile() {
        return "60c7400a";
    }

}
