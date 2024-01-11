# TallerJunit
**integrantes:**  
*Nathaly Crespo  
*Fiorella Quijano  
*Angello Vasconez  
**Pruebas unitarias**     
**metodo Solve**    
**prueba 1**  
Identificador: TestSuma  
Propósito: compara la formula de la suma dada con la esperada  
Entradas: "5+5"  
Salidas esperadas: "5+5=10"  
![WhatsApp Image 2024-01-10 at 17 36 25](https://github.com/Nathscrespo/TallerJunit/assets/89329395/c65505e4-2b94-4323-bf6b-a79cb7fa81a2)  

**prueba 2**  
Identificador: TestCompuesta  
Propósito: compara la formula de una operacion compuesta dada, con la esperada  
Entradas: "2*5+6"  
Salidas esperadas: "2x5+6=16"  
![compuesta](https://github.com/Nathscrespo/TallerJunit/assets/89329395/7d3764b3-3979-45ba-8e45-a34156237bac)  

**prueba 3**
Identificador: testMultiplicationByZero
Proposito: Comprobar que no haya errores al multiplicar un numero con el zero y que se cumple la propiedad comutativa de la multiplicacion con el 0.
Entrada 1: "2*0"
Salida Esperada 1: "2*0=0"

Entrada 2: "0*2"
Salida Esperada2: "0*2=0"

![image](https://github.com/Nathscrespo/TallerJunit/assets/127260680/0183c208-4041-4849-a154-36b821c259e3)

**prueba 4**
Identificador: testNumDivisionWithZero
Proposito: Comprobar que (n/0) no devuelve 0 y que (0/n) si devuelve 0
Entrada 1: "2/0"
Salida Esperada 1: "2/0=0"

Entrada 2: "0/2"
Salida Esperada2: "0/2=0"

![image](https://github.com/Nathscrespo/TallerJunit/assets/127260680/a935f37f-9790-42c7-b1c0-7fa8881b58d7)


**metodo make formula** 

**prueba 1**

Identificador: TestNoNull

Propósito: Verificar que el método MakeFormula no devuelve un resultado nulo.

Entradas: No hay entradas explícitas, ya que la prueba se centra en el resultado del método MakeFormula.

Salidas Esperadas: La salida esperada es que el resultado del método MakeFormula no sea nulo.


**prueba 2**
Identificador: testMakeFormula
Proposito: Comprobar que el retorno del metodo MakeFormula() no sea un String vacio.
Esperado: ""

![image](https://github.com/Nathscrespo/TallerJunit/assets/127260680/4589abe8-4d23-4073-92cd-abd4864817a8)
