package br.com.api;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private static final String mensagem = "oi, %s";
	private static AtomicLong contador = new AtomicLong();
	
	@RequestMapping("/teste")
	public HelloWorld helloworld(@RequestParam(value = "name", defaultValue = "mundo") String name) {
		
		return new HelloWorld(contador.incrementAndGet(), String.format(mensagem, name));
	}
}
