package Clases;

import uy.edu.ort.aed2.obligatorio.Sistema;

public class Pasajero {
    String cedula;
    String nombre;
    String teléfono;
    Sistema.Categoria categoria;

    public Pasajero(String cedula, String nombre, String teléfono, Sistema.Categoria categoria) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.categoria = categoria;
    }
}
