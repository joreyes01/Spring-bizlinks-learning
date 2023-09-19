package com.learnbizlinks.demo.spring;

import com.dizstance.modelexample.model.Address;

public record PersonWhitAddress(
        String name,
        int age,
        Address address
) {
}
