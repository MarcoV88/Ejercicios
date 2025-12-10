import java.util.Scanner;
import java.util.Scanner;
import java.util.ArrayList;
// Crea una clase Coche con marca, modelo y velocidad.
// Implementa métodos para acelerar y frenar.
// Completa lo que falta.
//

class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    // Constructor COMPLETAR
    public Coche (String marca, String modelo, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getVelocidad(){
        return velocidad;
    }

    public void setMarca(){
        this.marca = marca;
    }

    public void setModelo(String  modelo){
        this.modelo = modelo;
    }

    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }

    // Método acelerar (suma +10) COMPLETAR
    public void acelerar () {
        setVelocidad(getVelocidad() + 10);
        System.out.println ("Has incrementado tu velodicad en 10 km/h, ahora mismo vas a "+setVelocidad()+ " km/h.");
    }


    // Método frenar (resta -10 y nunca menor que 0) COMPLETAR
    public void frenar () {
        if (getVelocidad() >= 10) {
            setVelocidad(getVelocidad() - 10);
            System.out.println ("Has reducido tu velocidad en 10 km/h, ahora mismo vas a "+setVelocidad()+ " km/h");
        } else {
            System.out.println ("No puede frenar ya que va a menos de 10 km/h. ");
        }
    }


    // Método mostrarDatos COMPLETAR
    public void mostrarDatos (){
        System.out.println ("Modelo: "+getModelo());
        System.out.println ("Marca: "+getMarca());
        System.out.println ("Velocidad: "+getVelocidad());
    }

}



// Un Alumno tiene nombre y una lista de notas (ArrayList<Integer>)
// Implementa: añadirNota, calcularMedia, mostrarInfo.
// Deja todo lo necesario para que el alumno complete.
//




class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;

    // Constructor COMPLETAR
    public class Alumno (String nombre){
        this.nombre = nombre;
        this.ArrayList<Integer> = new ArrayList;
    }
   

    // Método añadirNota COMPLETAR
    public static void añadirNota(){
        Scanner sc = new MyScanner(System in);
        boolean continuar = true;

        do{
            System.out.println ("¿Vas a guardar alguna nota?(s/n)");
            String guardar = sc.next();

            if (guardar.equals("s")){
                System.out.println ("¿Cual es la nota que ha sacado?");
                int nota = sc.nextInt();
                notas.add(nota);
                continuar = true;
            } else if (guardar.equals("n")){
                System.out.println ("Hasta luego, tenga un buen día!");
                continuar = false;
            } else {
                System.out.println ("Te has equivocado de tecla, no pasa nada!")
                continuar = true;
            }

        }while (continuar) 
    }
    // Método calcularMedia COMPLETAR
    public static void calcularMedia(){
        double media = 0;
        double suma = 0;
        double total = notas.length;
        for (int i, i < total; i++){
            suma += notas [i];
        }
        media = suma / total;

        System.out.println ("Su media es de "+media)
    }

    // Método mostrarInfo COMPLETAR
    public static void mostrarInfo(){
        Scanner sc = new MyScanner(System in);
        System.out.println ("Indique su nombre: ")
        nombre = sc.next(); 
    }
}




// La CuentaBancaria debe tener titular, saldo y métodos
// ingresar(), retirar() y mostrarSaldo().
// Añade control para no permitir saldo negativo.
//


class CuentaBancaria {

    // atributos COMPLETAR
    private String titular;
    private double saldo;

    // constructor COMPLETAR
    public CuentaBancaria (String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getSaldo(){
        return saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    // método ingresar COMPLETAR
    public static void ingresar(){
        Scanner sc = new MyScanner(System in);
        System.out.println ("Indique cuanto dinero desea ingresar: ")
        int ingresa = sc.nextInt();
        setSaldo(getSaldo()+ingresa);
        System.out.println ("El dinero ha sido ingresado correctamente")
    }

    // método retirar COMPLETAR
    public static void retirar(){
        Scanner sc = new MyScanner(System in);
        System.out.println ("Indique cuanto dinero desea retirar: ")
        int retira = sc.nextInt();
        setSaldo(getSaldo()-retira);
        System.out.println ("El dinero ha sido retirado correctamente")        
    }
   

    // método mostrarSaldo COMPLETAR
    public static void mostrarSaldo(){
        System.out.println ("Su saldo es de "+getSaldo()+ " €")
    }
}




// Clase Libro: titulo, autor, disponible.
// Clase Biblioteca: ArrayList<Libro>, métodos añadirLibro,
// prestarLibro(titulo), devolverLibro(titulo).
// Deja huecos para que lo desarrollen.
//


class Libro {

    // atributos COMPLETAR
    private String titulo;
    private String autor;
    private boolean disponible;
    
    
    // constructor COMPLETAR
    public String getTitulo() {
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public boolean getDisponible(){
        return disponible;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setDisponible(boolena disponible){
        this.disponible = disponible;
    }    
   

    // método mostrarInfo COMPLETAR
    public static void mostrarInfo(){
        System.out.println ("Título: "+titulo)
        System.out.println ("Autor: "+autor)
        System.out.println ("Disponibilidad: "+disponible)
    }
}



class Biblioteca {

    // lista de libros COMPLETAR
    

    // añadirLibro COMPLETAR
    

    // prestarLibro COMPLETAR
    

    // devolverLibro COMPLETAR
    
}




// Producto: nombre, precio.
// Carrito: lista de productos, añadirProducto(), calcularTotal().
//


class Producto {

    // atributos COMPLETAR
   

    // constructor COMPLETAR
    

    // getters opcionales COMPLETAR
    
}



class Carrito {

    // lista de productos COMPLETAR
    

    // añadirProducto COMPLETAR
    

    // calcularTotal COMPLETAR
    

}




// El main está vacío para que cada alumno pruebe los ejercicios
// que quiera. Pueden crear objetos y llamar métodos.
//

public class Main {
    public static void main(String[] args) {
        
        Coche coche = new Coche (Seat, Ibiza, 60);
        Coche.mostrarDatos();
        Coche.acelerar();
        Coche.frenar();

        Alumno.mostrarInfo();
        Alumno.añadirNota();
        Alumno.calcularMedia();

        CuentaBancaria cuenta = new CuentaBancaria ("Juan", 1600)
        cuenta.ingresar();
        cuenta.retirar();
        cuenta.mostrarSaldo();

        Libro libro = new Libro ("El Quijote", "Cervantes", True)
        libro.mostrarInfo();
    }
}

