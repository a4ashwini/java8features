package com.mypackage.expressions.supplier;

import java.util.function.Supplier;

public class OTP {
    public static void main(String[] args) {
        Supplier<String> S = () -> {
            String otp = "";
            for (int i = 1; i <= 6; i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println(S.get());
    }
}
