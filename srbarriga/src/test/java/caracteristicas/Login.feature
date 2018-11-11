#language: pt
#Author: Mizael Bragatti
@login
Funcionalidade: Realizando login no site do Sr Barriga

  Esquema do Cenario: login com usuario cadastrado
    Dado que eu acesse a <pagina> de login
    E preencha os campos <email> e <senha>
    Quando eu clicar no botao entrar
    Entao o login sera realizado

    Exemplos: 
      | pagina  | email                          | senha     |
      | "login" | "kleber.ferlin@yaman.com.br"   | "yaman10" |
      #| "login" | "mizael.bragatti@yaman.com.br" | "yaman10" |
      #| "login" | "mizael.bragatti@yaman.com.br" | ""        |
      #| "login" | ""                             | "yaman10" |
      #| "login" | ""                             | ""        |
