package pe.uni.fiis.vizzlanBackend.Dao;

import java.util.List;
import pe.uni.fiis.vizzlanBackend.domain.Caracteristica;
import pe.uni.fiis.vizzlanBackend.domain.Categoria;
import pe.uni.fiis.vizzlanBackend.domain.Pedido;
import pe.uni.fiis.vizzlanBackend.domain.ProductoCaracteristica;
import pe.uni.fiis.vizzlanBackend.domain.Usuario;
import pe.uni.fiis.vizzlanBackend.dto.ProductoCaracteristicaRequest;
public interface UsuarioDao {
    Usuario loginUsuario(Usuario request);

    List<Pedido> obtenerPedidos();

    List<Caracteristica> obtenerCaracteristicas();

    List<Caracteristica> obtenerTipoCaracteristica();

    List<Categoria> obtenerCategoria();

    List<ProductoCaracteristica> obtenerProductos(ProductoCaracteristicaRequest request);
}