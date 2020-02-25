package com.dks.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
		System.out.println("In Main Method");
	}


	/*@Bean(name = "h2DataSource")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource getDataSource() {
		return DataSourceBuilder.create().build();
	}*/
/*
	@Bean(name = "h2DbTemplate")
	public NamedParameterJdbcTemplate jdbcTemplate(@Qualifier("h2DataSource") DataSource dataSource) {
		return new NamedParameterJdbcTemplate(dataSource);
	}
*/

}
