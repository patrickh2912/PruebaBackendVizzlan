package pe.uni.fiis.vizzlanBackend.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.uni.fiis.vizzlanBackend.domain.Caracteristica;
import pe.uni.fiis.vizzlanBackend.domain.Categoria;
import pe.uni.fiis.vizzlanBackend.domain.Pedido;
import pe.uni.fiis.vizzlanBackend.domain.ProductoCaracteristica;
import pe.uni.fiis.vizzlanBackend.dto.ProductoCaracteristicaRequest;
import pe.uni.fiis.vizzlanBackend.dto.UsuarioRequest;
import pe.uni.fiis.vizzlanBackend.dto.UsuarioResponse;
import pe.uni.fiis.vizzlanBackend.service.UsuarioService;

@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 9600L)
@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @PostMapping(value = "/usuarios",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public UsuarioResponse loginUsuario(@RequestBody UsuarioRequest request) {
        UsuarioResponse response = this.usuarioService.loginUsuario(request);
        if (response.getUsuario() == null) {
            response.setError(" Usuario no encontrado ");
        }

        return response;
    }

    @GetMapping(value = "/obtenerPedidos",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pedido> obtenerPedidos() {
        return this.usuarioService.obtenerPedidos();
    }

    @GetMapping(value="/obtenerCaracteristicas",produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Caracteristica> obtenerCaracteristicas() {
        return this.usuarioService.obtenerCaracteristicas();
    }

    @GetMapping(value="/obtenerTipoCaracteristicas",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Caracteristica> obtenerTipoCaracteristica() {
        return this.usuarioService.obtenerTipoCaracteristica();
    }

    @GetMapping(value = "/obtenerCategoria",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Categoria> obtenerCategoria() {
        return this.usuarioService.obtenerCategoria();
    }

    @PostMapping(value="/obtenerProductosCaracteristica",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductoCaracteristica> obtenerProductos(@RequestBody ProductoCaracteristicaRequest request) {
        return this.usuarioService.obtenerProductos(request);
    }
}

