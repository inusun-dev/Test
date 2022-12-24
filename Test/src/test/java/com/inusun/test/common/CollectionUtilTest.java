package com.inusun.test.common;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionUtilTest {

    @Test
    public void test_01() {
        List<Long> a = Arrays.asList(1L, 2L, 3L);
        List<Long> b = Arrays.asList(1L, 3L);

        System.out.println(a.stream()
                .filter(t -> !b.contains(t))
                .collect(Collectors.toList())
        );
    }

}
