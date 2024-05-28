def clasificación(nota):
    if 9 <= nota <= 10:
        return "A"
    elif 8 <= nota <= 9:
        return "B"
    elif 7 <= nota <= 8:
        return "C"
    elif 6 <= nota <= 7:
        return "D"
    elif 0 <= nota <= 6:
        return "E"
    else:
        return "El valor ingresado es incorrecto."

try:
    nota = float(input("Por favor, ingresa una calificación del 0 al 10: "))
    print(clasificación(nota))
except ValueError:
    print("Por favor, ingresa un número válido.")