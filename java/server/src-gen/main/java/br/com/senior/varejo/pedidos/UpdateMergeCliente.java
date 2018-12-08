/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Cliente entity.
 */
@CommandDescription(name="updateMergeCliente", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeCliente", responsePrimitive="updateMergeClienteResponse")
public interface UpdateMergeCliente extends MessageHandler {
    
    public Cliente updateMergeCliente(Cliente toUpdateMerge);
    
}
