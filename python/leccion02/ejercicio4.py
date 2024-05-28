def etapa_de_vida(edad):
    if 0 <= edad <= 10:
        return "La infancia es increíble."
    elif 10 < edad <= 19:
        return "Tienes muchos cambios, mucho que estudiar."
    elif 20 <= edad <= 29:
        return "Amor y comienza el trabajo."
    elif 30 <= edad <= 39:
        return "Consolidación de carrera y posibles responsabilidades familiares."
    elif 40 <= edad <= 49:
        return "Balance entre trabajo y vida familiar, y reflexión sobre logros personales."
    elif 50 <= edad <= 59:
        return "Tiempo para disfrutar de lo logrado y preparar la jubilación."
    elif 60 <= edad <= 69:
        return "Disfrute de la junilación y tiempo libre para hobbies."
    elif 70 <= edad <= 79:
        return "Reflexión sobre la vida y disfrutar de la familia."
    elif 80 <= edad:
        return "Sabiduría y compartir experiencia de vida."
    else:
        return "Edad no válida."

try:
    edad = int(input("Por favor, ingresa tu edad: "))
    print(etapa_de_vida(edad))
except ValueError:
    print("Por favor, ingresa un número válido.")