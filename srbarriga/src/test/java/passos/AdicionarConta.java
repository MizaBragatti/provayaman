package passos;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import paginas.AdicionarContaPO;

@SuppressWarnings("static-access")
public class AdicionarConta {
	int tempo = 1000;

	@E("^clicar no dropdown para adicionar contas$") 
	public void clicaContas() throws Throwable{
		Thread.currentThread().sleep(tempo);
		AdicionarContaPO.botao_Contas().click();
	}
	
	
	@E("^clicar em adicionar$") 
	public void clicaAdicionar() throws Throwable{
		Thread.currentThread().sleep(tempo);
		AdicionarContaPO.botao_Adicionar().click();
	}
	
	
	@E("^preencher as contas e salvar$") 
	public void preencherCampoNomeESalvar() throws Throwable{
		String contas[] = {"Luz", "Agua", "Condominio"};
		
		for(int i = 0; i < contas.length; i++) {
			Thread.currentThread().sleep(tempo);
			clicaContas();
			clicaAdicionar();
			AdicionarContaPO.form_NomeConta().sendKeys(contas[i]);
			AdicionarContaPO.botao_Salvar().click();
			validaAdicionar();
		}
			
	}
	
	
	@Entao("^a conta sera adicionada$") 
	public void validaAdicionar() throws Throwable{
		
		if(AdicionarContaPO.validar().getText().equals("Conta adicionada com sucesso!"))
			System.out.println("ok");
		else
			System.out.println("Nok");
		
		//AdicionarContaPO.fecharNavegador();
	}

}
