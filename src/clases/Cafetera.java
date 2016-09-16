/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lenovo
 */
public class Cafetera {
    private int capacidadMaxima;
    private int capacidadActual;
    
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.capacidadActual = 0;
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
        if (this.capacidadActual > this.capacidadMaxima) {
            this.capacidadActual = this.capacidadMaxima;
           
        } 
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void LlenarCafetera(){
    this.capacidadActual = this.capacidadMaxima;
}

     public void ServirTaza(int a, int b){
       int c;
       c = (a * b) + this.getCapacidadActual();
       if (this.capacidadActual < 0) {
           this.capacidadActual = 0;
       }
       
   }

     public void Vaciar(){
       this.capacidadActual = 0;
   }

   public void AgregarCafe(int d){
        int c;
        if (d > getCapacidadMaxima()) {
            this.capacidadActual = this.capacidadMaxima;
        } else {
            c = getCapacidadActual() + d;
            if (c > getCapacidadMaxima()) {
                
            } else {
                this.capacidadActual = c;
            }
            
        }
        
    }
}
