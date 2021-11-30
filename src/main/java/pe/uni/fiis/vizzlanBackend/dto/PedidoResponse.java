package pe.uni.fiis.vizzlanBackend.dto;

import pe.uni.fiis.vizzlanBackend.domain.Pedido;

import java.util.List;

public class PedidoResponse {
    private List<Pedido> list;

    public List<Pedido> getList() {
        return this.list;
    }

    public void setList(List<Pedido> list) {
        this.list = list;
    }
}
