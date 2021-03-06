package br.com.senior.varejo.pedidos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CreateBulkPedidoInput {
    
    /**
     * Entities for bulk creation
     */
    public java.util.List<Pedido> entities;
    
    public CreateBulkPedidoInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public CreateBulkPedidoInput(java.util.List<Pedido> entities) {
        this.entities = entities;
    }
    
    public void validate() {
        validate(true);
    }
    
    public void validate(boolean required) {
        validate(null, required);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	PedidosValidator.validate(this, headers, required, validated);
    }
    @Override
    public int hashCode() {
        int ret = 1;
        if (entities != null) {
            ret = 31 * ret + entities.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateBulkPedidoInput)) {
            return false;
        }
        CreateBulkPedidoInput other = (CreateBulkPedidoInput) obj;
        if ((entities == null) != (other.entities == null)) {
            return false;
        }
        if ((entities != null) && !entities.equals(other.entities)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	toString(sb, new ArrayList<>());
    	return sb.toString();
    }
    
    void toString(StringBuilder sb, List<Object> appended) {
    	sb.append(getClass().getSimpleName()).append(" [");
    	if (appended.contains(this)) {
    		sb.append("<Previously appended object>").append(']');
    		return;
    	}
    	appended.add(this);
    	sb.append("entities=").append(entities == null ? "null" : entities);
    	sb.append(']');
    }
    
}
