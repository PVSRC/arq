# Relatóriode Organização de Estruturas de Arquivos
Esse relatório será separado explicando os quatro arquviso de java usados

##Hash.java
Este é o arquivo da classe Hash, contendo os métodos criarTabela, criarHash e ler.

criarTabela cria uma tabela onde os atributos de todas as posições são preenchidos com -1, criando entao uma taberla vazia.

criarHash faz uma procura na tabela para uma posição especificada por uma conta utilizando o CEP, se o CEP da posição especificada for -1, então um Hash é criado naquela posição, porém, se o CEP for diferente de -1 significa que já tem um Hash criado naquela posição, acontecendo a colisão, quando essa colisão acontece o criarHash muda o atributo Próximo existente para a posição onde ficara esse Hash que será criado

ler esse método faz uma procura do CEP, que foi fornecido pelo usuário, na tabela e quando ele acha esse CEP ele imprime as informações do enderço como Logradouro, Bairro, Cidade, etc.

##Elemento.java
Este é o arquvio da classe Elemento, que será usada para compor o Hash, com os atributos CEP,Endereço e Próximo, todos sendo do tipo long, e seus getters e setters. CEP sendo o número do CEP, Endereço sendo o índice no hash e Próximo que aponta para o próximo elemento caso tenha acontecido alguma colisão.
Essa classe também contém dois métodos, escreveCEP e leCEP.

escreveCEP que escrever os atributos na posição especificada da tabela.

leCEP, que le os atributos na posição especificada na tabela
