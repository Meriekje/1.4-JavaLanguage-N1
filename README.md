# 1.4-JavaLanguage-N1
S'ha utilitzat Junit com a unit testing en aquest exercici. Per aquest motiu, no he demanat a ningú que m'ho corregís. \
Falta l'exercici del nivell 2 que lliuraré en un altre repositori.

Aquest projecte implementa diversos exercicis en Java i els valida mitjançant proves unitàries amb JUnit. Els exercicis inclouen la gestió d'una col·lecció de llibres en una biblioteca, el càlcul de la lletra del DNI a Espanya i la gestió d'excepcions per llançar ArrayIndexOutOfBoundsException.\

**Tecnologies Utilitzades**
- Java
- JUnit 5 per a proves unitàries
- Maven com a gestor de dependències

**Exercicis Disponibles**
**Exercici 1:** Gestió de Biblioteca de Llibres: consisteix en crear una classe Java que gestioni una col·lecció de llibres en una biblioteca. \
La classe ha de permetre realitzar les següents operacions:

Mètode: addBook(String title)\
Descripció: Afegeix un llibre a la col·lecció de llibres.\
Obtenir tots els llibres

Mètode: getBooks()\
Descripció: Recupera una llista de tots els llibres a la biblioteca.\
Obtenir un llibre per posició

Mètode: getBookAt(int index)\
Descripció: Recupera el títol d'un llibre en una posició específica de la llista.\
Afegir un llibre a una posició específica

Mètode: addBookAt(int index, String title)\
Descripció: Afegeix un llibre a una posició específica de la llista de llibres.\
Eliminar un llibre

Mètode: removeBook(String title)\
Descripció: Elimina un llibre de la llista utilitzant el seu títol.

_**Proves amb JUnit:**_
Es van implementar les següents proves per validar el correcte funcionament de la classe:\
* Verificar que la llista de llibres no sigui nul·la després de crear un nou objecte.
* Confirmar que la llista té la mida esperada després d'afegir diversos llibres.
* Verificar que la llista conté un llibre específic en la seva posició correcta.
* Assegurar-se que no hi ha llibres duplicats a la llista.
* Comprovar que es pot recuperar el títol d'un llibre donada una posició específica.
* Comprovar que afegir un llibre modifica correctament la llista.
* Confirmar que eliminar un llibre disminueix la mida de la llista.

**Exercici 2: Càlcul de la Lletra del DNI** - Aquest exercici consisteix en crear una classe anomenada CalculoDni que calcula la lletra del DNI a Espanya a partir d'un número de DNI donat.

Mètode: calculateLetter(int dniNumber)\
Descripció: Calcula la lletra del DNI basant-se en el número proporcionat.

_**Proves amb JUnit:**_\
Es va crear una classe JUnit que valida el correcte funcionament del càlcul de la lletra del DNI per a 10 números de DNI predefinits. Les proves confirmaran que la lletra és calculada correctament per cada número de DNI.

**Exercici 3:** Aquest exercici consisteix en crear una classe amb un mètode que llança una excepció ArrayIndexOutOfBoundsException.\
**Llançar l'excepció\
Mètode: triggerException()\
Descripció: Llança una excepció ArrayIndexOutOfBoundsException quan es tracta d'accedir a un índex invàlid d'un array.\

_**Proves amb JUnit:**_
Es va implementar un test JUnit per assegurar-se que l'excepció es llança correctament quan s'intenta accedir a un índex fora de l'array.


**Excepcions i Gestió de Respostes HTTP**
Excepcions Personalitzades\
ArrayIndexOutOfBoundsException: Es llança quan s'intenta accedir a un índex fora de l'array
