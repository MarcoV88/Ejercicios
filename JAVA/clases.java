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
    public static void ingresar(Double ingresa){
        setSaldo(getSaldo()+ingresa);
        System.out.println ("El dinero ha sido ingresado correctamente")
    }

    // método retirar COMPLETAR
    public static void retirar(Double retira){
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
    List<String> libros = new ArrayList<>();

    // añadirLibro COMPLETAR
    public static void añadirLibro(){
        boolean continuar = true;
        Scanner sc = new MyScanner(System in);
        do {
            System.out.println("¿Quiere añadir un libro?(s/n) ");
            String añadir = sc.next();
            if (añadir.equals("s"){
                System.out.println("Indique el título del libro: ");
                String titulo = sc.next();
                System.out.println("Indique el autor del libro: ");
                String autor = sc.next();
                System.out.println("Indique la disponibilidad del libro: ");
                boolean disponible = sc.nextBoolean();

                Libro libro = new Libro (titulo, autor, disponible);
                continuar = true;
            } else if (añadir.equals ("n"){
                System.out.println ("Hasta luego!");
                continuar = false;
            } else {
                System.out.println ("Responda con 's' (sí) o 'n' (no)");
                continuar = true;
            }
        }while (continuar)
    }

    // prestarLibro COMPLETAR
    public static void prestarLibro(){
        boolean seguir = true;
        Scanner sc = new MyScanner(System in);
        do {
            System.out.println("Quieres prestar un libro?(s/n) ");
            if (añadir.equals("s"){                
                System.out.println("Indique el título del libro: ");
                String titulo = sc.next();
                System.out.println("Indique la disponibilidad del libro: ");
                boolean disponible = sc.nextBoolean();
                for (Libros libro : libros){
                    if (libro.titulo == titulo && disponible) {
                        System.out.println ("El libro ha sido prestado");
                        libro.disponible == False;
                        }
                    }      
                seguir = true;
            } else if (añadir.equals("n"){
                System.out.println("Hasta luego!");
                seguir = false;
            } else{
                System.out.println ("Responda con 's' (sí) o 'n' (no)");
                seguir = true;
            }        
        }while(seguir)
    
    }

    // devolverLibro COMPLETAR
    public class devolverLibro(){
        boolean avanzar = true;
        Scanner sc = new MyScanner(System in);
        do {
            System.out.println("Quieres prestar un libro?(s/n) ");
            if (añadir.equals("s"){                
                System.out.println("Indique el título del libro: ");
                String titulo = sc.next();
                System.out.println("Indique la disponibilidad del libro: ");
                boolean disponible = sc.nextBoolean();
                for (Libros libro : libros){
                    if (libro.titulo == titulo && !disponible) {
                        System.out.println ("El libro ha sido prestado");
                        libro.disponible == True;
                        }
                    }      
                avanzar = true;
            } else if (añadir.equals("n"){
                System.out.println("Hasta luego!");
                avanzar = false;
            } else{
                System.out.println ("Responda con 's' (sí) o 'n' (no)");
                avanzar = true;
            }        
        }while(avanzar)
    
    }
    
}




// Producto: nombre, precio.
// Carrito: lista de productos, añadirProducto(), calcularTotal().
//


class Producto {

    // atributos COMPLETAR
    private String nombre;
    private double precio;
   

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

