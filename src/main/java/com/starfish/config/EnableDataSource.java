package com.starfish.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * DisableDataSource
 *
 * @author sunny
 * @version 1.0.0
 * @since 2021-06-02
 */
//@ConditionalOnExpression("${spring.datasource.enabled:true} || ${application.datasource.enabled:true}")
@ConditionalOnExpression("!${application.datasource.enabled:true}")
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = DataSourceAutoConfiguration.class)})
public class EnableDataSource {

}
