miVariable = 3
print(miVariable)
miVariable = "Hello world"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(id(x))
# las literales se escriben x480,la variable y = 224 , la variable z = 544
print(id(y))
print(id(z))

#Type int,float,string,bool

x = 10
print(x)
print(type(x))

x = 14.5
print(x)
print(type(x))

x = "Hello good morning"
print(x)
print(type(x))

x = True
print(x)
print(type(x))

x = False
print(x)
print(type(x))

#manejo de cadenas (String)

miGrupoFavorito = "The Imagine Dragons" 
carateristicas = "The best rock band in england"
print("My favorite band is:", miGrupoFavorito , carateristicas)

numero1 = "7"
numero2 = "8"
print(int(numero1) +int(numero2))

# Tipos booleanos(bool)
miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es Verdadero")
else:
    print("El resultado es Falso")

# Procesar la entrada del usuario
#funcion input
#resultado = input("Ingrese un numero entero: ") # regresa un dato tipo string
#print (resultado)


#conversion de la entrada de datos
#numero1 =  int(input("Escribe el primer numero: "))
#numero2 = int(input ("Escribe el segundo numero: "))
#resultado = numero1 + numero2
#print ("El resultado de la suma es: ", resultado)

#operadores logicos
"""
a = False
b= False
resultado = a and b
print(resultado)

#operador or

resultado = a or b
print(resultado)

#Operador not
resultado = not a
print(resultado)
"""
"""
#ejercicio : Valor dentro de un rango
valor = int(input("Digite un numero dentro del rango 0 al 5:  "))
valorMinimo = 0
valorMaximo = 5
dentroRango = (valor >= valorMinimo and valor <= valorMaximo)
if dentroRango:
    print(f"el valor {valor} esta dentro del rango")
else:
    print(f"el valor -1 {valor} no esta dentro del rango")
"""

"""
#ejercicio con el operador or, operador not
vacaciones = True
diaDescanso = True

if not (vacaciones or diaDescanso):
    print("Tiene trabajo por hacer")
else:
    print("Puede asistir al juego")
"""
"""
#Ejercicio rango entre las edades 20 y 30 años
edad = int(input("Digite su edad: "))
#veinte = edad >= 20 and edad < 30
#print(veinte)
#treinta = edad >= 30 and edad <40
#print(treinta)

if (20<= edad < 30) or (30 <= < 40):
    print("estas dentro del rango de los(20/0) a (30\0) años") #sintaxis simplificada del operador and
#if veinte or treinta:
    #print("estas dentro del rango de los(20/0) a (30\0) años")
#else:
    #print("no estas dentro del rango de los(20/0) a (30\0) años")
else:
    print("no estas dentro del rango de los(20/0) a (30\0) años")
"""

"""
#ejercicio : El numero mayor de dos numeros
numero1 = int(input("Digite el valor para el numero1: "))
numero2 = int(input("Digite el valor para el numero2: "))

if numero1>numero2:
    print("El numero 1 es mayor")
else:
    print("El numero 2 es mayor")
"""

# ejercicio : tienda de libros
print("Digite los siguientes datos del libro")
nombre = (input("Digite el nombre de el libro: "))
id= int(input("Digite el UD del libro: "))
precio=float(input("Digite el precio del libro: "))
envioGratuito= input ("Indicar si el libro es gratuito (True/False): " )

if envioGratuito == 'True':
    envioGratuito = True
elif envioGratuito == 'False':
    envioGratuito  = False
else:
    envioGratuito = "El valor es incorrecto , debe escribir True/False"
print(f'''
    nombre : {nombre}
    id : {id}
    precio : {precio}
    Envio Gratuito? : {envioGratuito}
''')

print("hola")








