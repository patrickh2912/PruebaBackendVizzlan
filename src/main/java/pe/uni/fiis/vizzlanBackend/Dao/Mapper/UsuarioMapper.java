package pe.uni.fiis.vizzlanBackend.Dao.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import pe.uni.fiis.vizzlanBackend.domain.Usuario;
public class UsuarioMapper implements RowMapper<Usuario> {
    @Override
    public Usuario mapRow(ResultSet resultSet, int i) throws SQLException {
        Usuario response = new Usuario();
        response.setCuenta(resultSet.getString("cuenta"));
        response.setContrasenia(resultSet.getString("contrasenia"));
        return response;
    }
}
