package com.example.demo_db.Servicio;

import com.example.demo_db.Entidad.Productos;
import com.example.demo_db.Repositorio.Repo_Productos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Serv_Productos {

    private Repo_Productos repositorio;

    public Serv_Productos(Repo_Productos repositorio) {
        this.repositorio = repositorio;
    }

    public List<Productos> mostrar(){
        return repositorio.findAll();
    }


    public Productos buscarCod(String codigo){
        if (repositorio.findById(codigo).isPresent())
            return repositorio.findById(codigo).get();
        else
            return null;
    }


    public List<Productos> buscarCate(String cate){
        return repositorio.findByCategoria(cate);
    }


    public String insertar(Productos p){
        if (repositorio.findById(p.getCodigo()).isPresent())
            return "El producto ya existe";
        else{
            repositorio.save(p);
            return "Registrado exitosamente";
        }
    }


    public String eliminar(String codigo){
        if (repositorio.findById(codigo).isPresent()){
            repositorio.deleteById(codigo);
            return "Eliminado exitosamente";
        }
        else
            return "El producto no existe";
    }


    public String actualizar(Productos p){
        if (repositorio.findById(p.getCodigo()).isPresent()){
            repositorio.save(p);
            return "Actualizado exitosamente";
        }
        else
            return "El producto no existe";
    }

}
