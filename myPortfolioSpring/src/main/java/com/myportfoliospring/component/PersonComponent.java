package com.myportfoliospring.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("personComponent")
public class PersonComponent {

	public static final Log LOG = LogFactory.getLog(PersonComponent.class);

	public void ExamplePersonComponent() {
		LOG.info("METHOD:'ExamplePersonComponent'");

	}
}
