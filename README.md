# Relatóriode Organização de Estruturas de Arquivos
Esse relatório será separado explicando os quatro arquviso de java usados.

##Hash.java
Este é o arquivo da classe Hash, contendo os métodos criarTabela, criarHash e ler.

criarTabela cria uma tabela onde os atributos de todas as posições são preenchidos com -1, criando entao uma taberla vazia.

criarHash faz uma procura na tabela para uma posição especificada por uma conta utilizando o CEP, se o CEP da posição especificada for -1, então um Hash é criado naquela posição, porém, se o CEP for diferente de -1 significa que já tem um Hash criado naquela posição, acontecendo a colisão, quando essa colisão acontece o criarHash muda o atributo Próximo existente para a posição onde ficara esse Hash que será criado.

ler esse método faz uma procura do CEP, que foi fornecido pelo usuário, na tabela e quando ele acha esse CEP ele imprime as informações do enderço como Logradouro, Bairro, Cidade, etc.

##Elemento.java
Este é o arquvio da classe Elemento, que será usada para compor o Hash, com os atributos CEP,Endereço e Próximo, todos sendo private e do tipo long, logo a classe tem seus getters e setters.

CEP sendo o número do CEP, Endereço sendo o índice no hash e Próximo que aponta para o próximo elemento caso tenha acontecido alguma colisão. Essa classe também contém, além dos getters e setters, dois métodos, escreveCEP e leCEP.

escreveCEP que escrever os atributos na posição especificada da tabela.

leCEP, que le os atributos na posição especificada na tabela.

##Endereço.java
Este é o arquivo da classe Endereço, que contém as informações de endereço do CEP, com os atributos Logradouro, Bairro, Cidade, Estado, Sigla e CEP, todos sendo private e do tipo String, logo a classe tem seus getters e setters.

Essa classe também contém, além dos vários getters e setters, um método, leEndereço.

leEndereço pega o arquivo fornecido, que contém os Logradouros, Bairros, Cidades, etc, e lê esse arquivo pegando essas informações, que estão em formato de byte, e muda elas de byte para String.

##Principal.java
Este é o arquivo que contém o método main, que é onde acontece todo o processo e onde os métodos das outras classes são usados.

O main começa com a criação de um scanner para que o usuário possa fazer uma escolha entre criar índice do Hash ou procurar um CEP, essas duas opções estão divididas em dois cases.

###Case 1


###Case 2
