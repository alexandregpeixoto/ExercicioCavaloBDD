package cachorrobdd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
Dave Atkins traz seu Doberman de estimação chamado Fofo na clínica para exames de rotina. 
O veterinário cobra dele a consulta de rotina e a vacinação contra a raiva. 
Dave paga em dinheiro antes de ele sair para o trabalho e lhe é fornecido um recibo de pagamento para os serviços."
*/

public class veterinarioSteps {

   veterinario veterinarioManager;
  /*
    @Given("Dave Atkins traz seu Doberman de estimação chamado Fofo na clínica para exames de rotina.")
    public void dave_traz_doberman_na_clinica_para_exame() throwable {
            
            }
*/
    @When("O veterinário cobra dele a consulta de rotina e a vacinação contra a raiva")
    public void veterinario_cobra_consulta_de_rotina_e_vacinacao_da_raiva(double _valorConsulta) throws Throwable {
		veterinarioManager.cobraConsulta(_valorConsulta);
            }
/*          
    @Then("Dave paga em dinheiro antes de ele sair para o trabalho e lhe é fornecido um recibo de pagamento para os serviços."")
    public void dave_paga_em_dinheiro_e_recebe_recibo_do_serviço
            {
            }
*/
}
