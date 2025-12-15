import java.util.ArrayList;
// Crea una clase Coche con marca, modelo y velocidad.
// Implementa métodos para acelerar y frenar.
// Completa lo que falta.
//


class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 30;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    // Método acelerar (suma +10) COMPLETAR
    public void acelerar() {
        setVelocidad(getVelocidad()+10);
        System.out.println("Has incrementado tu velocidad en 10 km/h, ahora mismo vas a " + velocidad + " km/h.");
    }

    // Método frenar (resta -10 y nunca menor que 0) COMPLETAR
    public void frenar() {
        if (getVelocidad() >= 10) {
            setVelocidad(getVelocidad-10);
            System.out.println("Has reducido tu velocidad en 10 km/h, ahora mismo vas a " + velocidad + " km/h");
        } else {
            velocidad = 0;
            System.out.println("El coche se ha detenido completamente.");
        }
    }


    // Método mostrarDatos COMPLETAR

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad + " km/h");
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
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }


    // Método añadirNota COMPLETAR
    public void añadirNota(int nota) {
        if (nota >= 0 && nota <= 10) {
            notas.add(nota);
            System.out.println("Nota " + nota + " añadida correctamente.");
        } else {
            System.out.println("La nota debe estar entre 0 y 10.");
        }
    }
    // Método calcularMedia COMPLETAR
    public double calcularMedia() {
        double suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }

    // Método mostrarInfo COMPLETAR
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Notas: " + notas);
        System.out.println("Media: " + calcularMedia());
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
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // método ingresar COMPLETAR
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            setSaldo(getSaldo()+cantidad);
            System.out.println("Se han ingresado " + cantidad + " € correctamente.");
        } else {
            System.out.println("La cantidad a ingresar debe ser positiva.");
        }
    }

    // método retirar COMPLETAR
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (saldo >= cantidad) {
                setSaldo(getSaldo()-cantidad);
                System.out.println("Se han retirado " + cantidad + " € correctamente.");
            } else {
                System.out.println("Saldo insuficiente. Saldo actual: " + getSaldo() + " €");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }

    // método mostrarSaldo COMPLETAR
    public void mostrarSaldo() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo actual: " + getSaldo() + " €");
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

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }


    // constructor COMPLETAR

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // método mostrarInfo COMPLETAR

    public void mostrarInfo() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Disponible: " + (isDisponible() ? "Sí" : "No"));
    }
}

class Biblioteca {
    // lista de libros COMPLETAR
    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // añadirLibro COMPLETAR
    public void añadirLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro '" + libro.getTitulo() + "' añadido a la biblioteca.");
    }

    // prestarLibro COMPLETAR

    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                if (libro.isDisponible()) {
                    libro.setDisponible(false);
                    System.out.println("Libro '" + titulo + "' prestado correctamente.");
                } else {
                    System.out.println("El libro '" + titulo + "' no está disponible.");
                }
                return;
            }
        }
        System.out.println("No se encontró el libro '" + titulo + "'.");
    }

    // devolverLibro COMPLETAR

    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                if (!libro.isDisponible()) {
                    libro.setDisponible(true);
                    System.out.println("Libro '" + titulo + "' devuelto correctamente.");
                } else {
                    System.out.println("El libro '" + titulo + "' ya estaba disponible.");
                }
                return;
            }
        }
        System.out.println("No se encontró el libro '" + titulo + "'.");
    }

    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca:");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
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

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // getters opcionales COMPLETAR

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

class Carrito {

    // lista de productos COMPLETAR
    private ArrayList<Producto> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }

    // añadirProducto COMPLETAR

    public void añadirProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto '" + producto.getNombre() + "' añadido al carrito.");
    }

    // calcularTotal COMPLETAR

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

}


// El main está vacío para que cada alumno pruebe los ejercicios
// que quiera. Pueden crear objetos y llamar métodos.
//


    public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche("Seat", "Ibiza");
        coche.mostrarDatos();
        coche.acelerar();
        coche.frenar();

        System.out.println("--------------");
        System.out.println("--------------");


        Alumno alumno = new Alumno("Juan");
        alumno.añadirNota(8);
        alumno.añadirNota(7);
        alumno.añadirNota(9);
        alumno.mostrarInfo();

        System.out.println("--------------");
        System.out.println("--------------");


        CuentaBancaria cuenta = new CuentaBancaria("Roberto", 1000);
        cuenta.mostrarSaldo();
        cuenta.ingresar(500);
        cuenta.retirar(200);
        cuenta.mostrarSaldo();

        System.out.println("--------------");
        System.out.println("--------------");


        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("El Quijote", "Cervantes");
        Libro libro2 = new Libro("Cien años de soledad", "García Márquez");

        biblioteca.añadirLibro(libro1);
        biblioteca.añadirLibro(libro2);
        biblioteca.mostrarLibros();
        System.out.println("--------------");
        biblioteca.prestarLibro("El Quijote");
        biblioteca.mostrarLibros();
        System.out.println("--------------");
        biblioteca.devolverLibro("El Quijote");
        biblioteca.mostrarLibros();

        System.out.println("--------------");
        System.out.println("--------------");


        Carrito carrito = new Carrito();
        Producto producto1 = new Producto("Tomate", 2.30);
        Producto producto2 = new Producto("Leche", 1.50);
        Producto producto3 = new Producto("Pan", 0.80);

        carrito.añadirProducto(producto1);
        carrito.añadirProducto(producto2);
        carrito.añadirProducto(producto3);
    }
}
