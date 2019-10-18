package com.profesorp.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profesorp.configclient.bean.BeanConfiguration;

@RestController
public class ConfigServiceController {
	
	@Value("${first.name}")
	String firstName;
	
	@Value("${last.name}")
	String lastName;
	
	@Autowired
	private Configuration configuration;

	@Autowired
	private ConfigurationData configurationData;

	@GetMapping("/limites")
	public BeanConfiguration getConfiguracion()
	{
		return new BeanConfiguration(configuration.getMinimum(),
				configuration.getMaximum(),firstName,lastName);
	}
	
	
	@GetMapping("/refrescado")
	public BeanConfiguration getConfiguracionRefrescada(@Value("${last.name}") String lastName)
	{
		return new BeanConfiguration(configuration.getMinimum(),
				configuration.getMaximum(),firstName,lastName);
	}
	@GetMapping("/datos")
	public ConfigurationData retrieveDatosFromConfigurations() {
		return configurationData;
	}
	
}
