grammar Gramatica;

  programa: (declaracao NEWLINE?)+;

  declaracao: declaracaovariavel
            | declaracaofuncao
            | declaracaoestrutura
            | retorno
            | estruturacontrole
            |printar

            ;

            printar:
               'println' '(' TEXTO ')' ';'
               | 'println' '(' ID ')' ';'
               | 'println' '(' NUM_INT ')' ';'
               | 'println' '(' NUM_DEC ')' ';'
               | 'println' '(' (ID|'+'|NUM_DEC|NUM_INT|ID'['(ID|NUM_INT)']'|TEXTO)* ')' ';'
               ;




  declaracaovariavel:
                      tipo ID ';'
                    | tipo ID '=' expressao ';'
                    | tipo ID '=' '(' atribuicaomatematica ')' (atribuicaomatematica|'+'|'/'|'-'|'*'|)atribuicaomatematica ';'
                    | tipo ID '[]' '=' TEXTO ';'
                    | tipo array ';'
                    | tipo array '=' arrayinicializacao ';'
                    ;

  tipo:
        'int'
      | 'float'
      | 'double'
      | 'char'
      | 'boolean'
      | 'void'
      ;

  declaracaofuncao: tipo ID '(' parametros ')' bloco;

  parametros: parametro (',' parametros)?
            | ;

  parametro: tipo ID
           | tipo ID '[]'
           ;

  bloco: '{' (NEWLINE+) (declaracao NEWLINE)+   '}' ;



  expressao: atribuicao | atribuicaomatematica  | comparacao | printar;

  atribuicao: ID '=' expressao
            | ID '+=' expressao
            | ID '-=' expressao
            | ID '*=' expressao
            | ID '/=' expressao
            | ID '%=' expressao
            | ID '&&=' expressao
            | ID '||=' expressao
            | ID '=' ID
            | ID '+=' ID
            | ID '-=' ID
            | ID '*=' ID
            | ID '/=' ID
            | ID '%=' ID
            | ID '&&=' ID
            | ID '||=' ID
            | ID
            | NUM_DEC
            | NUM_INT
            | TEXTO
            ;
          atribuicaomatematica:
             ID '+' ID
            | ID '-' ID
            | ID '/' ID
            | ID '*' ID
            | ID '%' ID
            | ID '+' NUM_INT
            | ID '-' NUM_INT
            | ID '/' NUM_INT
            | ID '*' NUM_INT
            | ID '%' NUM_INT
            | ID '+' NUM_DEC
            | ID '-' NUM_DEC
            | ID '/' NUM_DEC
            | ID '*' NUM_DEC
            | ID '%' NUM_DEC
            |NUM_INT '+' NUM_INT
            | NUM_INT '-' NUM_INT
            | NUM_INT '/' NUM_INT
            | NUM_INT '*' NUM_INT
            | NUM_INT '%' NUM_INT
            |NUM_DEC '+' NUM_DEC
            | NUM_DEC '-' NUM_DEC
            | NUM_DEC '/' NUM_DEC
            | NUM_DEC '*' NUM_DEC
            | NUM_DEC '%' NUM_DEC
            |NUM_INT '+' ID
            | NUM_INT '-' ID
            | NUM_INT '/' ID
            | NUM_INT '*' ID
            | NUM_INT '%' ID
            |NUM_DEC '+' ID
            | NUM_DEC '-' ID
            | NUM_DEC '/' ID
            | NUM_DEC '*' ID
            | NUM_DEC '%' ID
            |NUM_DEC '+' NUM_INT
            | NUM_DEC '-' NUM_INT
            | NUM_DEC '/' NUM_INT
            | NUM_DEC '*' NUM_INT
            | NUM_DEC '%' NUM_INT
            |NUM_INT '+' NUM_DEC
            | NUM_INT '-' NUM_DEC
            | NUM_INT '/' NUM_DEC
            | NUM_INT '*' NUM_DEC
            | NUM_INT '%' NUM_DEC
            |NUM_DEC
            |NUM_INT
            |
            ;

            comparacao:
                ID operator NUM_INT
                | ID operator NUM_DEC
                | ID operator ID
                | NUM_DEC  operator ID
                | NUM_DEC operator NUM_DEC
                | NUM_DEC operator NUM_INT
                | NUM_INT operator NUM_INT
                | NUM_INT operator NUM_DEC
                | NUM_INT operator ID
                ;
            operator :
                 '=='
                |'>='
                |'<='
                |'<'
                |'>'
                ;

            retorno : 'return' ID ';'
                    | 'return' NUM_INT ';'
                    | 'return' TEXTO ';'
                    | 'return' NUM_DEC ';'
                    | 'return' 'null' ';'
                    ;

  estruturacontrole:
                    (NEWLINE?) 'if' '(' expressao ')' bloco
                   |(NEWLINE?)  'if' '(' expressao ')'  bloco  'else' bloco
                   | (NEWLINE?) 'while' '(' expressao ')' bloco
                   | (NEWLINE?) 'for' '(' (('int')? ID '= ' (ID|NUM_INT) )';' ID operatorfor (ID|NUM_INT|ID '.length')';' (ID '++' | ID'--') ')' bloco
                   | (NEWLINE?) 'switch' '(' expressao ')' caselista
                   | (NEWLINE?)'break' ';'
                   | (NEWLINE?)'continue' ';'
                   | (NEWLINE?)'return' expressao ';'
                   |(NEWLINE?) operator
                   ;

  caselista: casedecl*;
   operatorfor :
             '>='
             |'<='
             |'='
             |'<'
             |'>'
             ;

  casedecl: 'case' expressao ':' bloco
          | 'default' ':' bloco
          ;

  declaracaoestrutura: 'struct' ID '{' declaracaovariavel* '}' ';';

  array: ID '[' expressao ']'
       | ID '[]'
       ;

  arrayinicializacao: '{' expressaolista '}';

  expressaolista: expressao (',' expressao)*;

  expressaologica: expressaorelacional
                 | expressaologica '&&' expressaorelacional
                 | expressaologica '||' expressaorelacional
                 | '!' expressaorelacional
                 ;

  expressaorelacional: expressaoaritmetica
                     | expressaoaritmetica '>' expressaoaritmetica
                     | expressaoaritmetica '>=' expressaoaritmetica
                     | expressaoaritmetica '<' expressaoaritmetica
                     | expressaoaritmetica '<=' expressaoaritmetica
                     | expressaoaritmetica '!=' expressaoaritmetica
                     | expressaoaritmetica '==' expressaoaritmetica
                     ;

  expressaoaritmetica: expressaomultiplicativa
                     | expressaoaritmetica '+' expressaomultiplicativa
                     | expressaoaritmetica '-' expressaomultiplicativa
                     ;

  expressaomultiplicativa: expressaounaria
                         | expressaomultiplicativa '*' expressaounaria
                         | expressaomultiplicativa '/' expressaounaria
                         | expressaomultiplicativa '%' expressaounaria
                         ;

  expressaounaria: expressaopostfix
                 | '-' expressaounaria
                 |  expressaopostfix '++'
                 |  expressaopostfix '--'
                 ;

  expressaopostfix: primaria
                  | primaria '[' expressao ']'
                  | primaria '(' argumentos ')'
                  | primaria '.' ID
                  | primaria '->' ID
                  ;

  argumentos: expressaolista
            | ;

  primaria: ID
          | NUM_INT
          | NUM_DEC
          | TEXTO
          | '(' expressao ')'
          ;

  NEWLINE : [\r\n]+  ;

  ID: [a-zA-Z_][a-zA-Z_0-9]*;
  NUM_INT: [0-9]+;
  NUM_DEC: [0-9]+'.'[0-9]*;
  TEXTO: '"' (~["\r\n])* '"';

