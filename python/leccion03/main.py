#ciclo while (mientras o durante)
"""contador = 0
while contador< 3:
    print("EJECUTAMOS NUESTRO CICLO WHILE", contador)
    contador +=1;
else:
    print ("Fin del ciclo while")"""

#imprimir numero del 0 al 5 con el ciclo while (crecien)
"""maximo = 5
contador = 0
while contador <= maximo:
    print (contador)
    contador +=1"""

#ejercicio decreciente
"""minimo = 1
contador = 5
while contador >= minimo:
    print(contador)
    contador -=1"""

#ciclo for
"""cadena = "Hello"
for letra in cadena:
    print(letra)
else:
    print ("Fin del ciclo for")"""

#Palabra reservada break
"""for letra in "Alemania":
    if letra == "a":
        print("letra encontrada: ", letra)
        break
else:
    print("Fin del ciclo for")"""

#palabra reservada continue
for i in range(6):
    if i % 2 == 0:
        print(f"valor:", i)

for i in range(6):
    if i % 2 != 0:
        continue
    print(f"valor:", i)

