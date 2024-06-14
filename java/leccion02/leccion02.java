package leccion02;

class leccion02 {
    public static void main(String[] args) {
        var condicion = "True";
        if (condicion == "True"){
            System.out.println("Condición verdadera");
        } else {
            System.out.println("Condición falsa");
        }
        var numero = 2;
        var numeroTexto = "Numero deconocido";
        if(numero == 1){
            numeroTexto = "Numero uno";
        }
        else if(numero == 2){
            numeroTexto = "Numero dos";
        }
        else if(numero == 3){
            numeroTexto = "Numero tres";
        }
        else if(numero == 4){
            numeroTexto = "Numero cuatro";
        }
        else if(numero == 5){
            numeroTexto = "Numero cinco";
        }
        else{
            numeroTexto = "Numero desconocido";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }

    
}