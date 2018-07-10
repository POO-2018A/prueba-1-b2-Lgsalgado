/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebab2;

/**
 *
 * @author ESFOT
 */
public class Frutas {
    private String codigo;
    private String nombreFrutas;
    private double precio;

    public Frutas() {
    }

    public Frutas(String codigo, String nombreFrutas, double precio) {
        this.codigo = codigo;
        this.nombreFrutas = nombreFrutas;
        this.precio = precio;
    }

    public Frutas(String nombreFrutas, double precio) {
        this.nombreFrutas = nombreFrutas;
        this.precio = precio;
    }

    public Frutas(String codigo, String nombreFrutas) {
        this.codigo = codigo;
        this.nombreFrutas = nombreFrutas;
    }

    Frutas(Object selectedItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreFrutas() {
        return nombreFrutas;
    }

    public void setNombreFrutas(String nombreFrutas) {
        this.nombreFrutas = nombreFrutas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  nombreFrutas;
    }
    
    
    
}
