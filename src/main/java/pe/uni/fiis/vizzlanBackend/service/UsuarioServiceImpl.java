package pe.uni.fiis.vizzlanBackend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.uni.fiis.vizzlanBackend.Dao.UsuarioDao;
import pe.uni.fiis.vizzlanBackend.domain.Caracteristica;
import pe.uni.fiis.vizzlanBackend.domain.Categoria;
import pe.uni.fiis.vizzlanBackend.domain.Pedido;
import pe.uni.fiis.vizzlanBackend.domain.ProductoCaracteristica;
import pe.uni.fiis.vizzlanBackend.domain.Usuario;
import pe.uni.fiis.vizzlanBackend.dto.ProductoCaracteristicaRequest;
import pe.uni.fiis.vizzlanBackend.dto.UsuarioRequest;
import pe.uni.fiis.vizzlanBackend.dto.UsuarioResponse;
import pe.uni.fiis.vizzlanBackend.util.DemoUtil;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioDao usuarioDao;
    public UsuarioResponse loginUsuario(UsuarioRequest request) {
        Usuario usuario = this.usuarioDao.loginUsuario(DemoUtil.mapToUsuario(request));
        UsuarioResponse response = new UsuarioResponse();
        response.setUsuario(usuario);
        return response;
    }
    @Override
    public List<Pedido> obtenerPedidos() {
        return this.usuarioDao.obtenerPedidos();
    }
    @Override
    public List<Caracteristica> obtenerCaracteristicas() {
        return this.usuarioDao.obtenerCaracteristicas();
    }
    @Override
    public List<Caracteristica> obtenerTipoCaracteristica() {
        return this.usuarioDao.obtenerTipoCaracteristica();
    }
    @Override
    public List<Categoria> obtenerCategoria() {
        return this.usuarioDao.obtenerCategoria();
    }
    @Override
    public List<ProductoCaracteristica> obtenerProductos(ProductoCaracteristicaRequest request) {
        return this.usuarioDao.obtenerProductos(request);
    }
}