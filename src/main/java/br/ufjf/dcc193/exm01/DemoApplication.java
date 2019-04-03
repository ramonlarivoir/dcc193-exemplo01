package br.ufjf.dcc193.exm01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		PessoaRepository rep = ctx.getBean(PessoaRepository.class);
		Pessoa p1 = new Pessoa("Fulano", 23);
		rep.save(p1);
		rep.save(new Pessoa("Beltrano", 17));
		rep.save(new Pessoa("Ciclano", 37));
		System.out.println(rep.findAll().toString());
	}

}
