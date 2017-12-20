package com.demo.test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Import(value = AbstarctApplication.config.class)
@ActiveProfiles("test")
public abstract class AbstarctApplication {

//	@Configuration
//	@EnableSolrRepositories(basePackages = "com.demo.test")
//	static class config {
//
//		@Bean
//		public EmbeddedSolrServerFactoryBean solrServerFactoryBean() {
//			EmbeddedSolrServerFactoryBean factory = new EmbeddedSolrServerFactoryBean();
//			factory.setSolrHome("/Users/sushilp/Desktop/test");
//
//			return factory;
//		}
//
//		@Bean
//		public SolrTemplate solrTemplate() throws Exception {
//			return new SolrTemplate(solrServerFactoryBean().getObject());
//		}
//	}
}
