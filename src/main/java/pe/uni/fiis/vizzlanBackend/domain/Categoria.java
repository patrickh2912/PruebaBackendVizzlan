package pe.uni.fiis.vizzlanBackend.domain;

public class Categoria {
    private int idCategoriaProductos;
    private String descripcion;

    public int getIdCategoriaProductos() {
        return idCategoriaProductos;
    }

    public void setIdCategoriaProductos(int idCategoriaProductos) {
        this.idCategoriaProductos = idCategoriaProductos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
