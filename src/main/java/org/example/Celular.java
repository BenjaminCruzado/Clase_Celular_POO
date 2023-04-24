package org.example;
public class Celular {
    String marca;
    String color;
    int fechaDeLanzamiento;
    String tipoDeCamaraFrontal;
    String tipoDeCamaraTrasera;
    public void encender(){
        System.out.println("El celular se encendio");
    }
    public void apagar(){
        System.out.println("El celular se apago");
    }
    public void reiniciar(){
        System.out.println("El celular se reinicio");
    }
    public void llamar(String contacto){
        System.out.println("Llamando a "+ contacto);
    }
}
