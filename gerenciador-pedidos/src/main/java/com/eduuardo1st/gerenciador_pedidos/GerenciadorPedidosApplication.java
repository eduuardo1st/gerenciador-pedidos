package com.eduuardo1st.gerenciador_pedidos;

import com.eduuardo1st.gerenciador_pedidos.model.Categoria;
import com.eduuardo1st.gerenciador_pedidos.model.Pedido;
import com.eduuardo1st.gerenciador_pedidos.model.Produto;
import com.eduuardo1st.gerenciador_pedidos.repository.CategoriaRepository;
import com.eduuardo1st.gerenciador_pedidos.repository.PedidoRepository;
import com.eduuardo1st.gerenciador_pedidos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class GerenciadorPedidosApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository cRepository;
    @Autowired
    private ProdutoRepository pRepository;
    @Autowired
    private PedidoRepository pedidoRepository;


	public static void main(String[] args) {
		SpringApplication.run(GerenciadorPedidosApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {


        Categoria categoria = new Categoria("Frios");
        Produto produto = new Produto("Carne", 50.0);
        Pedido pedido = new Pedido(LocalDate.now());

        pRepository.save(produto);
        pedidoRepository.save(pedido);
    }
}
