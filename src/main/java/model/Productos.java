package model;

public class Productos {

    private int id;
    private String nombre;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Productos(int id, String nombre, String descripcion, int cantidad, double precio) {


        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;

    }

    @Override
    public String toString() {
        return "Productos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }


    public double getPrecio() {
        return precio;
    }


    public int getId() {
        return id;
    }


    public int getCantidad() {
        return cantidad;
    }

}
