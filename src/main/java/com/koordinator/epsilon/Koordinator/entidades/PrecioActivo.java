package com.koordinator.epsilon.Koordinator.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PreciosActivos")
public class PrecioActivo {
    //compuesto por dos activos
    @Id
    private String id;
    private double precio;
    @JsonIgnore
    private String parBase;
    @JsonIgnore
    private String parContra;


    public PrecioActivo(String id, double precio, String parBase, String parContra) {
        this.id = id;
        this.precio = precio;
        this.parBase = parBase;
        this.parContra = parContra;
    }

    public PrecioActivo() {
    }

    @Override
    public String toString() {
        return "PrecioActivo{" +
                "id='" + id + '\'' +
                ", precio=" + precio +
                ", parBase='" + parBase + '\'' +
                ", parContra='" + parContra + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getParBase() {
        return parBase;
    }

    public void setParBase(String parBase) {
        this.parBase = parBase;
    }

    public String getParContra() {
        return parContra;
    }

    public void setParContra(String parContra) {
        this.parContra = parContra;
    }
}
