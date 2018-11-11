package passos;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;
import paginas.LoginPO;

public class Login {
	
	@Dado("^que eu acesse a \"([^\"]*)\" de login$")
	public void acessaLogin(String pagina) throws Throwable{
		LoginPO.abre_Navegador(pagina);
	}
	
	@E("^preencha os campos \"([^\"]*)\" e \"([^\"]*)\"$") 
	public void preencheCampos(String email, String senha) throws Throwable{
		LoginPO.form_email().sendKeys(email);
		LoginPO.form_senha().sendKeys(senha);
	}
	
	@Quando("^eu clicar no botao entrar$") 
	public void clicaEntrarLogin() throws Throwable{
		LoginPO.botao_Entrar().click();
	}
	
	@Entao("^o login sera realizado$") 
	public void validaLogin() throws Throwable{
		
		if(LoginPO.validar().getText().equals("Bem vindo, Mizael!"))
			System.out.println("ok");
		else
			System.out.println("Nok");
		
		LoginPO.fecharNavegador();
	}

}
