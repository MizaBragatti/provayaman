#language: pt
#Author: Mizael Bragatti
@adicionarconta
Funcionalidade: Adicionar conta no site do Sr Barriga

  Esquema do Cenario: login com usuario cadastrado
    Dado que eu acesse a <pagina> de login
    E preencha os campos <email> e <senha>
    Quando eu clicar no botao entrar
    E preencher as contas e salvar

    Exemplos: 
      | pagina  | email                          | senha     |
      | "login" | "mizael.bragatti@yaman.com.br" | "yaman10" |
