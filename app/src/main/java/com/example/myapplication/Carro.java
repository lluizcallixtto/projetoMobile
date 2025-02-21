package com.example.myapplication;

public class Carro {
    String marca;
    String modelo;
    String cor;
    String combustivel;

    public Carro(String marca, String modelo, String cor, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String Ligar() {
        return "ligando";
    }

    public String acelerar() {
        return "Acelerando";
    }

    public String frear() {
        return "Frear";
    }
}
