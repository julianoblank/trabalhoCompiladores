import java_cup.runtime.Symbol;

/*
Directivas:
public: classe publica
cup: compatibilidade com cup
full: estende o alfabeto com todos os valores de 8 bits
linha: adicionar a variável int yyline, para indicar a linha do lexema
char: adicionar a variável int yychar, para indicar o índice do primeiro caractere do lexema
ignorecase: validar, independentemente de a letra ser maiúscula ou minúscula
eofval: especifica um valor de retorno no final do arquivo
*/

%%

%class Scanner
%cup
%full
%line
%char
%ignorecase
%eofval{
	return new Symbol(Tokens.EOF,new String("Fim do arquivo"));
%eofval}

dois = (d[o][i])\w+
tres = (t[r][e])\w+
quatro = (q[u][a][t])\w+
cinco = (c[i][n])\w+
seis = (s[e][i])\w+
sete = (s[e][t])\w+
oito = (o[i][t])\w+
nove = (n[o][v])\w+
mais = (m[a])\w+
vezes = (v[e])\w+
dividido = (d[i])\w+
menos = (m[e])\w+
dobro = (d[o])\w+
palavra = [a-zA-Z]([a-zA-Z]|\é)*
palavraEsp = \é
digito = [0-9]
letra = [a-zA-Z]
id = [$]({letra}|{digito}|"_")*
espaco = \t|\f|" "|\r|\n

%%


"um"		{return new Symbol(Tokens.UM, yytext());}
{dois}		{return new Symbol(Tokens.DOIS, yytext());}
{tres}      {return new Symbol(Tokens.TRES, yytext());}
{quatro}	{return new Symbol(Tokens.QUATRO, yytext());}
{cinco}		{return new Symbol(Tokens.CINCO, yytext());}
{oito}		{return new Symbol(Tokens.OITO, yytext());}
{mais}		{return new Symbol(Tokens.SOMA, yytext());}
{nove}		{return new Symbol(Tokens.NOVE, yytext());}
{dobro}		{return new Symbol(Tokens.DOBRO, yytext());}
{vezes}		{return new Symbol(Tokens.VEZES, yytext());}
{dividido}  {return new Symbol(Tokens.DIVIDIDO, yytext());}
{menos}		{return new Symbol(Tokens.MENOS, yytext());}
";"			{return new Symbol(Tokens.SEMI, yytext());}
"("			{return new Symbol(Tokens.LPAREN, yytext());}
")"			{return new Symbol(Tokens.RPAREN, yytext());}
{id}		{return new Symbol(Tokens.ID, yytext());}
{digito}+	{return new Symbol(Tokens.NUMERO, new Integer(yytext()));}
{espaco}	{}
{palavra}		{}
{palavraEsp}    {}
.           { System.out.println("Caracter ilegal: " + yytext()); }
