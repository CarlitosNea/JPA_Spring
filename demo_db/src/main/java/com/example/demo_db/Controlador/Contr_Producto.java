package com.example.demo_db.Controlador;

import com.example.demo_db.Entidad.Productos;
import com.example.demo_db.Servicio.Serv_Productos;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Contr_Producto {
    private Serv_Productos servicioP;

    public Contr_Producto(Serv_Productos servicioP) {
        this.servicioP = servicioP;
    }

    @GetMapping("/mostrar")
    public List<Productos> listarProductos(){
        return servicioP.mostrar();
    }

    @GetMapping("/buscarCod/{codigo}")
    public Productos cod(@PathVariable("codigo")String codigo){
        return servicioP.buscarCod(codigo);
    }

    @GetMapping("/buscarCate/{cate}")
    public List<Productos> cate(@PathVariable("cate")String cate){
        return servicioP.buscarCate(cate);
    }

    @PostMapping("/insertar")
    public String insertar(@RequestBody Productos p){
        return servicioP.insertar(p);
    }

    @PostMapping("/actualizar")
    public String actualizar(@RequestBody Productos p){
        return servicioP.actualizar(p);
    }

    @DeleteMapping("/eliminar/{codigo}")
    public String eliminar(@PathVariable("codigo")String codigo){
        return servicioP.eliminar(codigo);
    }

}
