package pe.uni.fiis.vizzlanBackend.service;

import pe.uni.fiis.vizzlanBackend.domain.Caracteristica;
import pe.uni.fiis.vizzlanBackend.domain.Categoria;
import pe.uni.fiis.vizzlanBackend.domain.Pedido;
import pe.uni.fiis.vizzlanBackend.domain.ProductoCaracteristica;
import pe.uni.fiis.vizzlanBackend.dto.ProductoCaracteristicaRequest;
import pe.uni.fiis.vizzlanBackend.dto.UsuarioRequest;
import pe.uni.fiis.vizzlanBackend.dto.UsuarioResponse;

import java.util.List;

public interface UsuarioService {
    UsuarioResponse loginUsuario(UsuarioRequest request);

    List<Pedido> obtenerPedidos();

    List<Caracteristica> obtenerCaracteristicas();

    List<Caracteristica> obtenerTipoCaracteristica();

    List<Categoria> obtenerCategoria();

    List<ProductoCaracteristica> obtenerProductos(ProductoCaracteristicaRequest request);
}
