#####################################
Anotacions sobre múltiples instàncies
#####################################

* Autor/a: Angelo Montenegro

* Data: 9/02/2023

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de *múltiples
instàncies* dins de la *programació orientada a objectes*.

Les anotacions responen a diferents preguntes sobre aquest codi:

::

    01    public class GatRenat {
    02        public int vides = 7;   // vides disponibles del gat Renat
    03
    04        public static void main(String[] args) {
    05            GatRenat renatI;
    06            renatI = new GatRenat();               // crea un primer gat Renat
    07            System.out.println("El gat Renat I té  " + renatI.vides + " vides");
    08
    09            GatRenat renatII = new GatRenat();     // crea un segon gat Renat!
    10            System.out.println("El gat Renat II té " + renatII.vides + " vides");
    11
    12            renatI.vides++;
    13            System.out.println("El gat Renat I té  " + renatI.vides + " vides");
    14            System.out.println("El gat Renat II té " + renatII.vides + " vides");
    15
    16            renatII = renatI; // atenció: la instància de Renat II es perd!
    17            System.out.println("El gat Renat I té  " + renatI.vides + " vides");
    18            System.out.println("El gat Renat II té " + renatII.vides + " vides");
    19
    20            renatI.vides++;
    21            System.out.println("El gat Renat I té  " + renatI.vides + " vides");
    22            System.out.println("El gat Renat II té " + renatII.vides + " vides");
    23        }
    24    }

Pregunta 1. Sortida
===================

La sortida en executar el programa anterior és:

::

    $ java GatRenat 
El gat Renat I té  7 vides
El gat Renat II té 7 vides
El gat Renat I té  8 vides
El gat Renat II té 7 vides
El gat Renat I té  8 vides
El gat Renat II té 8 vides
El gat Renat I té  9 vides
El gat Renat II té 9 vides


Pregunta 2. Memòria
===================

La memòria que ocupa, com a mínim, una instància de ``GatRenat`` és 32 bits 

Baso els meus càlculs en que la instancia se basa en una declaracion y asignacion de una variable integer(creo yo);


Pregunta 3. Fins la línia 5
===========================

El nombre d'instànces de ``GatRenat`` tot just executat el codi fins la línia 5 (inclosa) és:
public class GatRenat {
    public int vides = 7;   // vides disponibles del gat Renat
    public static void main(String[] args) {
        GatRenat renatI;
        renatI = new GatRenat();

Pregunta 4. Fins la línia 6
===========================

El nombre d'instànces de ``GatRenat`` tot just executat el codi fins la línia 6 (inclosa) és: 

public class GatRenat {
    public int vides = 7;   // vides disponibles del gat Renat
    public static void main(String[] args) {
        GatRenat renatI;
        renatI = new GatRenat();               // crea un primer gat Renat
        System.out.println("El gat Renat I té  " + renatI.vides + " vides");

Pregunta 5. Fins la línia 9
===========================

El nombre d'instànces de ``GatRenat`` tot just executat el codi fins la línia 9 (inclosa) és 

public class GatRenat {
    public int vides = 7;   // vides disponibles del gat Renat
    public static void main(String[] args) {
        GatRenat renatI;
        renatI = new GatRenat();               // crea un primer gat Renat
        System.out.println("El gat Renat I té  " + renatI.vides + " vides");
        GatRenat renatII = new GatRenat();     // crea un segon gat Renat!
        System.out.println("El gat Renat II té " + renatII.vides + " vides");
        renatI.vides++;

Pregunta 6. Vides iguals a 7 i 10
=================================

Les línies 7 i 10 mostren les mateixes vides pels gats Renat I i Renat II,
perquè muestran los miso valores porque las dos instancias apuntan al mismo espacio de memoria donde estan almacenadas las vidas del Gat Renat I y II.

Pregunta 7. Vides diferents a 13 i 14
=====================================

Les línies 13 i 14 mostren diferent nombre de vides pels gats Renat I i
Renat II, perquè el valor alterado es unicamente el de la instancia que apunta al GatRenatI y por tanto el gat renat va a seguir teniendo la misma cantidad de vidas

Pregunta 8. El comentari de la línia 16
=======================================

Penso que el comentari de la línia 16 vol dir quiere decir que una vez que la istancia deja de apungtar al valor que encapsulaba esta se pierde y comienza a tomar un uevo valor que en este caso sera la misma casilla a la que apunta el Gat Renat I ya que GatRenatII= GatRenatI

Pregunta 9. Vides iguals a 17 i 18
==================================

Les línies 17 i 18 mostren les mateixes vides pels gats Renat I i Renat
II, perquè porque las intsancias apuntan al mismo espacio de memoria donde esta guardado el valor delas vidas 


Pregunta 10. Vides iguals a 21 i 22
===================================

Les línies 21 i 22 mostren les mateixes vides pels gats Renat I i Renat II
malgrat la instrucció de la línia 20, perquè porque en la linea 16 se menciona que el GatRenatII=GatRenatI por lo que el valor a l que apuntaba la instancia del gatRenat II dejo de existir y ahora punta siempre al valor del gat I

Pregunta 11. Nombre d'instàncies
================================

El nombre d'instàncies hi ha quan s'executa la línia 20 una ya que apuntan a la instancia igual con el mismo valor
