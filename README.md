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
No case 1 o usuário entra com o arquivo, que só sera lido, e com o nome do arquivo que será criado com a tabela e o hash.
Depois será informado para o usuário como é calculada a função do hash e pedirá que o usuário entre com um número desejado para ser usado nessa função.
Após calcular a função com o n fornecido a tabela será criada e em seguida o hash.

###Case 2
No case 2 o usuário entra com o arquivo que ele deseja fazer a procura do CEP e com o indice do hash.
Depois o usuário entra com o CEP que ele deseja procurar no aquivo.
Após isso, o programa dá duas opções para o usuário, digitar 1 se ele quiser procurar outro CEP nesse mesmo arquivo, ou 2 para sair.
Caso a escolha seja 1 o programa entra em um while que repete o processo de entrar com o CEP para a procura até chegar novamente nas duas opções, de continuar a busca no arquivo ou sair. 
