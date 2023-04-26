package com.example.demo_db.Repositorio;

import com.example.demo_db.Entidad.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repo_Productos extends JpaRepository<Productos,String> {
    List<Productos> findByCategoria(String cate);
}
