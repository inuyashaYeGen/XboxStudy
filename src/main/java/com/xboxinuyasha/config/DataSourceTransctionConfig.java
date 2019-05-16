package com.xboxinuyasha.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;

/**
 *  数据存储配置
 */
@Configuration
public class DataSourceTransctionConfig {

    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        DataSourceTransactionManager tm = new DataSourceTransactionManager();
        tm.setDataSource(dataSource);
        return tm;
    }

    @Bean
    public DefaultTransactionDefinition transactionDefinition() {
        return new DefaultTransactionDefinition();
    }

    static {
        System.setProperty("mybatis.config-location", "classpath:mybatis.xml");
        System.setProperty("mybatis.mapper-locations", "classpath:mybatis/**/*.xml");
    }

}
