/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Reportes {
    
    private int IdUsuario;
    private int IdLibro;
    private int FechaEntrada;
    private int FechaSalida;

    public Reportes() {
    }

    public Reportes(int IdUsuario, int IdLibro, int FechaEntrada, int FechaSalida) {
        this.IdUsuario = IdUsuario;
        this.IdLibro = IdLibro;
        this.FechaEntrada = FechaEntrada;
        this.FechaSalida = FechaSalida;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public int getIdLibro() {
        return IdLibro;
    }

    public void setIdLibro(int IdLibro) {
        this.IdLibro = IdLibro;
    }

    public int getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(int FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public int getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(int FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    @Override
    public String toString() {
        return "Reportes{" + "IdUsuario=" + IdUsuario + ", IdLibro=" + IdLibro + ", FechaEntrada=" + FechaEntrada + ", FechaSalida=" + FechaSalida + '}';
    }
    
    public void Actualizar(){
        
        
    }
    
}
