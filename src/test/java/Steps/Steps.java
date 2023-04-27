package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	Metodos m = new Metodos();
    Elementos e = new Elementos();			

	@Given("^que o usuario acesse a rul \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_rul(String url) throws Throwable {
	  m.executarNavegador(url, "Abrindo navegador");
	}

	@Given("^selecionar o botão abrir nova conta$")
	public void selecionar_o_botão_abrir_nova_conta() throws Throwable {
	   m.click(e.getBtnAbrirConta(), "Selecionando botao abrir conta");
	}

	@Given("^selecionar o botão abrir conta para você$")
	public void selecionar_o_botão_abrir_conta_para_você() throws Throwable {
	  // m.pausa(3000, "Pausa para garregar o botao abrir conta");
	   m.click(e.getBtnAbrirConta(), "Selecionando botao abrir conta");
	}

	@When("^o usuario preencher o formulario$")
	public void o_usuario_preencher_o_formulario() throws Throwable {
	   m.preencher(e.getCampoNome(), "FlashCode", "preenchendo o campo nome");
	   m.preencher(e.getCampoTelefone(), "11111111111", "Preenchendo campo telefone");
	   m.preencher(e.getCampoEmail(), "test@test.com.br", "Preenchendo campo email");
	   m.preencher(e.getCampoCPF(), "01072510006", "Preenchendo campo CPF");
	}

	@When("^selecionar o botão quero ser cliente$")
	public void selecionar_o_botão_quero_ser_cliente() throws Throwable {
		m.click(e.getBtnQueroSerCliente(), "Selecionando botao quero ser cliente");
	}

	@Then("^valido o texto falta pouco$")
	public void valido_o_texto_falta_pouco() throws Throwable {
	   
	}

	   //m.preencher(e.getCampoNome(), "Flash Code", "Preenchendo o campo nome");
}
