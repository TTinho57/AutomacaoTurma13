
@tag
Feature: Abertura de conta
  

  @tag1
  Scenario: Fluxo do formulario de abertura de pessoa fisica
  Given que o usuario acesse a rul "https://www.original.com.br/"
  And selecionar o botão abrir nova conta
  And selecionar o botão abrir conta para você
  When o usuario preencher o formulario
  And selecionar o botão quero ser cliente
  Then valido o texto falta pouco  
  
