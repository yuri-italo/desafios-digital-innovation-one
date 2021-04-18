# Desafio
Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o novo sistema de cadastro, e pediram a sua ajuda. Sua task é fazer o código que valide as senhas que são cadastradas, para isso você deve atentar aos requisitos a seguir:

A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
Além disso, a senha pode ter de 6 a 32 caracteres.
## Entrada
A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha cada item dos requisitos solicitados anteriormente, ou “Senha invalida.”, se um ou mais requisitos não forem atendidos.

## Saída
Para cada caso de teste, escreva a palavra devidamente corrigida. Analise os exemplos para verificar o padrão, de modo a consertar todos os casos.

### Exemplo de Entrada	
Digital Innovation One<br>
AbcdEfgh99<br>	
DigitalInnovationOne123<br>
Digital Innovation One 123<br>	
Aass9<br>	
Aassd9<br>	

### Exemplo de Saída
Senha invalida.<br>
Senha valida.<br>
Senha valida.<br>
Senha invalida.<br>
Senha invalida.<br>
Senha valida.<br>
