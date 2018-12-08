package br.com.senior.varejo.pedidos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExportItemInput {
    
    public ExportConfig config;
    
    public ExportItemInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ExportItemInput(ExportConfig config) {
        this.config = config;
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
        if (config != null) {
            ret = 31 * ret + config.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExportItemInput)) {
            return false;
        }
        ExportItemInput other = (ExportItemInput) obj;
        if ((config == null) != (other.config == null)) {
            return false;
        }
        if ((config != null) && !config.equals(other.config)) {
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
    	sb.append("config=<");
    	if (config == null) {
    		sb.append("null");
    	} else {
    		config.toString(sb, appended);
    	}
    	sb.append('>');
    	sb.append(']');
    }
    
}
