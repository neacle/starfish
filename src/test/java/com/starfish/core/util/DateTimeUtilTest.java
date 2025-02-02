package com.starfish.core.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * DateTimeUtilTest
 *
 * @author sunkolin
 * @version 1.0.0
 * @since 2015-01-05
 */
@Slf4j
class DateTimeUtilTest {

    @Test
    void parseTest() {
        Date date = DateTimeUtil.parse("2020-01-01");
        log.info("{}", date);
        Assertions.assertNotNull(date);

        Date date2 = DateTimeUtil.parse("2020-01-01 12:00:00");
        log.info("{}", date2);
        Assertions.assertNotNull(date2);

        Date date3 = DateTimeUtil.parse("2020-01-01");
        log.info("{}", date3);
        Assertions.assertNotNull(date3);

        Date date4 = DateTimeUtil.parse("20200101");
        log.info("{}", date4);
        Assertions.assertNotNull(date4);

        Date date5 = DateTimeUtil.parse("2020-01-01 12:00:00", "yyyy-MM-dd HH:mm:ss");
        log.info("{}", date5);
        Assertions.assertNotNull(date5);

        Date date6 = DateTimeUtil.parse(1634106492000L);
        log.info("{}", date6);
        Assertions.assertNotNull(date6);
    }

    @Test
    void dateBetweenTest() {
        List<String> expectedValue = Arrays.asList("2020-01-01", "2020-01-02", "2020-01-03");
        List<String> actualValue = DateTimeUtil.dateBetween("2020-01-01", "2020-01-03");
        log.info("{}", actualValue);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void getMonthStartTest() {
        // 时间是2020-10-15 09:00:00，当月第一天是2020-10-01 00:00:00，时间戳是1601481600000
        long expectedValue = 1601481600000L;
        Date monthStart = DateTimeUtil.getMonthStart(new Date(1602723600000L));
        long actualValue = monthStart.getTime();
        log.info("{}", actualValue);
        Assertions.assertEquals(expectedValue, actualValue);
    }

}
