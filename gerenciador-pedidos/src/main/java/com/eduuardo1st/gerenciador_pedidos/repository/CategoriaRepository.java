package com.eduuardo1st.gerenciador_pedidos.repository;

import com.eduuardo1st.gerenciador_pedidos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
