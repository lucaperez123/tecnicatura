
def obtener_estacion(mes):
    if mes in [10, 11, 12]:
        return "Primavera"
    elif mes in [1, 2, 3]:
        return "Verano"
    elif mes in [4, 5, 6]:
        return "Otoño"
    elif mes in[7,8,9]:
        return "Invierno"

while True:
    try:
        mes = int(input("Ingresa un número correspondiente a un mes del año (entre 1 y 12): "))
        if 1 <= mes <= 12:
            estacion = obtener_estacion(mes)
            print(f"El mes {mes} corresponde a la estación: {estacion}")
            break
        else:
            print("Por favor, ingresa un número válido entre 1 y 12.")
    except ValueError:
        print("Por favor, ingresa un número entero válido.")