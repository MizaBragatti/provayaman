package passos;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;
import paginas.CadastroPO;

public class Cadastro {
	
	@Dado("^que eu acesse a \"([^\"]*)\" de cadastro$")
	public void acessaLogin(String pagina) throws Throwable{
		CadastroPO.abre_Navegador(pagina);
	}
	
	@E("^preencha os campos \"([^\"]*)\" \"([^\"]*)\" e \"([^\"]*)\"$") 
	public void preencheCampos(String nome, String email, String senha) throws Throwable{
		CadastroPO.form_nome().sendKeys(email);
		CadastroPO.form_email().sendKeys(email);
		CadastroPO.form_senha().sendKeys(senha);
	}
	
	@Quando("^eu clicar no botao cadastrar$") 
	public void botaoCadastrar() throws Throwable{
		CadastroPO.botao_Cadastrar().click();
	}
	
	@Entao("^o cadastro sera realizado$") 
	public void validaCadastro() throws Throwable{
		
		if(CadastroPO.validar().getText().equals("Usuário inserido com sucesso"))
			System.out.println("ok");
		else
			if(CadastroPO.validar().getText().equals("Endereço de email já utilizado"))
				System.out.println("ok");
			else
				System.out.println("Nok");
		
		CadastroPO.fecharNavegador();
	}

}
