package pe.uni.fiis.vizzlanBackend.dto;

import pe.uni.fiis.vizzlanBackend.domain.Usuario;

public class UsuarioResponse {
    private Usuario usuario;
    private String error;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
