public class Escrita {

    public static void main (String [] args ){
        
    }

}

// Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de escrita. Esses padrões estão expressos nos itens abaixo:

// Arquivo .java: Todo arquivo .java deve começar com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra deve também ser maiúscula, exemplo:

// Calculadora.java, CalculadoraCientifica.java

// Nome da classe no arquivo: A classe deve possuir o mesmo nome do arquivo.java, exemplo:

// Copy
//  arquivo CalculadoraCientifica.java

// public class CalculadoraCientifica {

// }

//  Nome de variável: toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser MAIÚSCULA, exemplo: ano e anoFabricacao. O nome dessa prática para nomear variáveis dessa forma se chama "camelCase".

// Existe uma regra adicional para variáveis, quando na mesma queremos identificar que ela não sofrerá alteração de valor, exemplo: queremos determinar que uma variável de nome br sempre representará "Brasil" e nunca mudará seu valor, logo, determinamos como escrita o código abaixo:

// Copy
// String BR = "Brasil"
// double PI = 3.14
// int ESTADOS_BRASILEIRO = 27
// int ANO_2000 = 2000
// Recomendações: Para declarar uma variável nós podemos utilizar caracteres, números e símbolos, porém, devemos seguir algumas regras da linguagem.

// Deve conter apenas letras, _ (underline), $ ou os números de 0 a 9;

// Deve obrigatoriamente se iniciar por uma letra (preferencialmente), _ ou $, jamais com número;

// Deve iniciar com uma letra minúscula (boa prática – ver abaixo);

// Não pode conter espaços;

// Não podemos usar palavras-chave da linguagem;

// O nome deve ser único dentro de um escopo.

// Copy
// Declação inválida de variáveis

// int numero&um = 1; //Os únicos símbolos permitidos são _ e $
// int 1numero = 1;    //Uma variável não pode começar com númerico
// int numero um = 1; //Não pode ter espaço no nome da variável
// int long = 1; //long faz parte das palavras reservadas da linguagem

//   Declaração válida de veriáveis
// int numero$um = 1;
// int numero1 = 1;
// int numeroum = 1;
// int longo = 1;
		
// Declarando variáveis e métodos
// Como identificar a diferença entre, declaração de variáveis e métodos em nossa programa? Existe uma estrutura comum para ambas as finalidades, exemplo:

// Declarar uma variável em Java segue sempre a seguinte estrutura:

// Copy
//  Estrutura

// Tipo NomeBemDefinido = Atribuicao (opcional em alguns casos)

// Exemplo

// int idade = 23;
// double altura = 1.62;
// Dog spike; //observe que aqui a variável spike não tem valor, é normal
// Declarar métodos em Java segue uma estrutura bem simples:

// Copy
// Estrutura

// TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

// Exemplo

// int somar (int numeroUm, int numero2)

// String formatarCep (long cep)
// Como parte da estrutura de declaração de variáveis e métodos, também temos o aspecto da visibilidade, mas ainda não é necessário nesta etapa de estudos.