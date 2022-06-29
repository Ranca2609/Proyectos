grammar Gramatica;
options { caseInsensitive = true; }

// Regular Expresion
COMPLEX     : '('[0-9]+ ('.' [0-9]+)? ( 'E'|'e' (('+')?|'-') [0-9]+('.' [0-9]+)?)? ',' [0-9]+ ('.' [0-9]+)? ( 'E'|'e' (('+')?|'-') [0-9]+('.' [0-9]+)?)? ')';
INT : [0-9]+;
DECIMAL:[0-9]+ '.' [0-9]+;
STRING  : '"' (~["\r\n] | '""')* '"'
        |'\'' (~('\\'|'\''))* '\'' ;

COMMENT     :   '!' (~ '\n')* '\n' -> skip;
ID          :   [a-z_][a-z0-9_]* ;
MENORQUE: ('<' | '.lt.');
MAYORQUE: ('>' | '.gt.');
MENORIGUAL: ('<=' |'.le.');
MAYORIGUAL: ('>=' | '.ge.');
IGUALACION: ('==' | '.eq.');
DIFERENCIA: ('/=' |'.ne.');
WS      : [ \t\r\n]+ -> skip ;

//Productions

start: instrucciones;






instrucciones: instruccion (instruccion)* ;

 instruccion:
             declaracion
            |print
            |do
            |arreglos_declaracion
            |lis_declararion
            |asignacion_arreglos
            |if_
            |asignacion
            |if_doble
            |if_else_doble
            |else_if
            |if_triple
            |if_else_triple
            |if_cuadruple
            |if_else_cuadruple
            |arreglos_dos_decla
            |declara_default
            |acceso_arreglo
            |asiganacion_2D
            |dec_1D_arreglos
            |dellocate_1D
            |dec_allocate_1D
            |dec_allocate_2D
            |do_while
            |subrutina
            |call
            |program;

program:'program' ID  'implicit' 'none' instrucciones 'end' 'program' ID;
subrutina: 'subroutine' id1=ID '(' lista_parametros ')' 'implicit' 'none' ldeclp instrucciones 'end' 'subroutine' id2=ID;
lista_parametros: exp (',' exp)*;

call : 'call' ID '(' lista_parametros ')' ;
ldeclp : declaraciones_with_intent+;
declaraciones_with_intent : tipo ',' 'intent''(''in'')'':'':' exp;
if_:'if' '(' exp ')' 'then'
     instrucciones
     'end' 'if';
else_if: 'if' '(' exp ')' 'then'
         hacer1=instrucciones
         'else'
         hacer2=instrucciones
         'end' 'if';
if_doble:'if' '(' exp1=exp ')' 'then'
         hacer1=instrucciones
         'else' 'if' '(' exp2=exp ')' 'then'
         hacer2=instrucciones
         'end' 'if';
if_else_doble:'if' '(' exp1=exp ')' 'then'
              hacer1=instrucciones
              'else' 'if' '(' exp2=exp ')' 'then'
              hacer2=instrucciones
              'else'
              hacer3=instrucciones
              'end' 'if' ;
if_triple: 'if' '(' exp1=exp ')' 'then'
            hacer1=instrucciones
            'else' 'if' '(' exp2=exp ')' 'then'
            hacer2=instrucciones
            'else' 'if' '(' exp3=exp ')' 'then'
            hacer3=instrucciones
            'end' 'if';
if_else_triple: 'if' '(' exp1=exp ')' 'then'
            hacer1=instrucciones
            'else' 'if' '(' exp2=exp ')' 'then'
            hacer2=instrucciones
            'else' 'if' '(' exp3=exp ')' 'then'
            hacer3=instrucciones
            'else'
            hacer4=instrucciones
            'end' 'if';
if_cuadruple: 'if' '(' exp1=exp ')' 'then'
            hacer1=instrucciones
            'else' 'if' '(' exp2=exp ')' 'then'
            hacer2=instrucciones
            'else' 'if' '(' exp3=exp ')' 'then'
            hacer3=instrucciones
            'else' 'if' '(' exp4=exp ')' 'then'
            hacer4=instrucciones
            'end' 'if';
if_else_cuadruple: 'if' '(' exp1=exp ')' 'then'
            hacer1=instrucciones
            'else' 'if' '(' exp2=exp ')' 'then'
            hacer2=instrucciones
            'else' 'if' '(' exp3=exp ')' 'then'
            hacer3=instrucciones
            'else' 'if' '(' exp4=exp ')' 'then'
            hacer4=instrucciones
            'else'
            hacer5=instrucciones
            'end' 'if';

declara_default: tipo ':'':' ID ;

declaracion: tipo ':'':' ID '=' exp;

lis_declararion: tipo ':'':' ID '=' exp ',' ID (',' ID)*;

asignacion: ID '=' exp;
arreglos_dos_decla: tipado_arreglos ',' 'dimension' '(' d1=expre2 ',' d2=expre2 ')' ':'':' ID ;
arreglos_declaracion: tipado_arreglos ',' 'dimension' '(' tam=expre2')' ':'':' nombre=ID ;
dec_1D_arreglos: tipado_arreglos ':' ':' ID '(' exp ')';

dec_allocate_1D: tipado_arreglos ',' 'allocatable' ':' ':' ID'('':'')';
dec_allocate_2D: tipado_arreglos ',' 'allocatable' ':' ':' ID'(' ':' ',' ':' ')';
acceso_arreglo: ID '[' posicion=expre2 ']' '=' valor_array=exp;


asiganacion_2D:ID '[' posicion1=exp ',' posicion2=exp']' '=' valor=exp ;

asignacion_arreglos:ID '=' '(' '/' exp '/'')';
do: 'do' ID '=' inicio=exp ',' final=exp ',' paso=exp instrucciones  'end' 'do';

do_while:'do' 'while' '('condicion=exp')' instrucciones 'end' 'do';

dellocate_1D: 'deallocate' '(' ID ')';

tipado_arreglos:
                'real'
                |'integer'
                | 'character';

tipo:
    'integer'
    |'real'
    |'complex'
    |'character'
    |'logical'
    ;
//dfsdf
 print: 'print' '*' ',' exp;


exp:
        op= '.not.' left = exp #opLogicalNot
        |left=exp op=('.and.'|'.or.') right=exp               #opExp
        | left=exp op=( MENORIGUAL | MAYORIGUAL | MENORQUE | MAYORQUE | IGUALACION | DIFERENCIA ) right=exp  #opExp
        | left=exp op='**' right=exp               #opExp
        | left=exp op=('*' | '/') right=exp       #opExp
        | left=exp op=('+' | '-') right=exp       #opExp
        | left=exp sep=',' right=exp              #comaExp
        | '(' operacion=exp ')'                   #parExp
        | entero=INT                              #enteroExp
        | cadena=STRING                           #cadeExp
        | deci=DECIMAL                            #decExp
        | identificador=ID                        #idExp
        |coml= COMPLEX                            #complejoExp
        |verdadero='.true.'                     #verdadExp
        |falso='.false.'                           #falExp
        |and= '.and.'                           #logicaAnd
        |ID '[' posicion=expre2 ']'                    #aceso_areglo_cor
        |ID '[' posicion1=exp ',' posicion2=exp ']'                    #aceso_areglo_2D
        |'size' '('ID ')'                       #size_array
        | ID '(' exp ')'                #funcExpr
        |                                         #nada
        ;


expre2:INT #numeroArre;