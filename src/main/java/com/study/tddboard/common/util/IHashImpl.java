package com.study.tddboard.common.util;

import java.util.*;

public class IHashImpl implements IHash {
    @Override
    public String encode(String input) {
        return new String(Base64.getEncoder().encode(input.getBytes()));
    }

    @Override
    public String decode(String input) {
        return new String(Base64.getDecoder().decode(input));
    }
}
