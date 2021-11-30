package pe.uni.fiis.vizzlanBackend.util;
import pe.uni.fiis.vizzlanBackend.domain.Usuario;
import pe.uni.fiis.vizzlanBackend.dto.UsuarioRequest;
public class DemoUtil {

    public static Usuario mapToUsuario(UsuarioRequest request) {
        Usuario response = new Usuario();
        response.setCuenta(request.getCuenta());
        response.setContrasenia(request.getContrasenia());
        return response;
    }
}