package executores;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import paginas.LoginPO;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {"@cadastro, @login"}, 
		glue = {"" }, 
		features = "src/test/java/caracteristicas/",
		monochrome = true
		)

public class Rodar {
	
	@Before
	public void before() throws Exception {
		
	}

	@Test
	public void test() {

	}
	
	@After
	public void after() throws Exception {
		//LoginPO.fecharNavegador();
	}
	
}
