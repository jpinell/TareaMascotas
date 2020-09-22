package com.jpinell.tareamascotas;

public class Mascota {
    private int foto;
    private String nombre;
    private int huesoBlanco;
    private String contador;
    private int huesoAmarillo;

    public Mascota(int foto, String nombre, int huesoBlanco, String contador, int huesoAmarillo) {
        this.foto = foto;
        this.nombre = nombre;
        this.huesoBlanco = huesoBlanco;
        this.contador = contador;
        this.huesoAmarillo = huesoAmarillo;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHuesoBlanco() {
        return huesoBlanco;
    }

    public void setHuesoBlanco(int huesoBlanco) {
        this.huesoBlanco = huesoBlanco;
    }

    public String getContador() {
        return contador;
    }

    public void setContador(String contador) {
        this.contador = contador;
    }

    public int getHuesoAmarillo() {
        return huesoAmarillo;
    }

    public void setHuesoAmarillo(int huesoAmarillo) {
        this.huesoAmarillo = huesoAmarillo;
    }


}
