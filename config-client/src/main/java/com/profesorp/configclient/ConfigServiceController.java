package com.profesorp.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profesorp.configclient.bean.BeanConfiguration;

@RestController
public class ConfigServiceController {
	
	@Value("${valores.valor_fijo}")
	String valorFijo;
	
	@Autowired
	private Configuration configuration;

	@Autowired
	private ConfigurationData configurationData;

	@GetMapping("/limites")
	public BeanConfiguration getConfiguracion()
	{
		return new BeanConfiguration(configuration.getMinimum(),
				configuration.getMaximum(),valorFijo);
	}
	
	
	@GetMapping("/refrescado")
	public BeanConfiguration getConfiguracionRefrescada()
	{
		return new BeanConfiguration(configuration.getMinimum(),
				configuration.getMaximum(),valorFijo);
	}
	@GetMapping("/datos")
	public ConfigurationData retrieveDatosFromConfigurations() {
		return configurationData;
	}
	
}
