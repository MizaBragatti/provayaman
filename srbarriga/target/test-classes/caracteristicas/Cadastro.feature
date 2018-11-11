#language: pt
#Author: Mizael Bragatti
@cadastro
Funcionalidade: Realizando o cadastro no site do Sr Barriga

  Esquema do Cenario: cadastrar usuario 
    Dado que eu acesse a <pagina> de cadastro
    E preencha os campos <nome> <email> e <senha>
    Quando eu clicar no botao cadastrar
    Entao o cadastro sera realizado

    Exemplos: 
      | pagina     | nome     | email                          | senha     |
      #| "cadastro" | "Mizael" | "mizael.bragatti@yaman.com.br" | "yaman10" |
      | "cadastro" | "Kleber" | "kleber.ferlin@yaman.com.br"   | "yaman10" |
