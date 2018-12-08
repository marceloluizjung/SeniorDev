/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

import br.com.senior.custom.CustomEntity;
import br.com.senior.custom.odata.entity.ODataEntity;

@Entity
@ODataEntity(id = "cliente")
@Table(name="cliente")
public class ClienteEntity extends CustomEntity {
	
	private static final long serialVersionUID = 1L;

	/**
	 * Chave primaria
	 */
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	/**
	 * Nome do cliente
	 */
	@Column(name = "nome")
	private String nome;
	
	/**
	 * Data de nascimento
	 */
	@Column(name = "data_nascimento")
	private java.time.LocalDate dataNascimento;
	
	/**
	 * Tem credito habilitado
	 */
	@Column(name = "credito_habilitado")
	private Boolean creditoHabilitado;
	
	/**
	 * CPF do cliente
	 */
	@Column(name = "cpf")
	private String cpf;
	
	/**
	 * id da foto
	 */
	@Column(name = "id_foto")
	private String idFoto;
	
	@Override
	public java.util.UUID getPk() {
		return this.id;
	}
	
	@Override
	public String getServiceEntityName() {
		return "cliente";
	}
	
	public java.util.UUID getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public java.time.LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public Boolean getCreditoHabilitado() {
		return creditoHabilitado;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getIdFoto() {
		return idFoto;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDataNascimento(java.time.LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void setCreditoHabilitado(Boolean creditoHabilitado) {
		this.creditoHabilitado = creditoHabilitado;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setIdFoto(String idFoto) {
		this.idFoto = idFoto;
	}
	
	@Override
	public int hashCode() {
	    int ret = 1;
	    if (id != null) {
	        ret = 31 * ret + id.hashCode();
	    }
	    return ret;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (!(obj instanceof ClienteEntity)) {
	        return false;
	    }
	    ClienteEntity other = (ClienteEntity) obj;
	    if ((id == null) != (other.id == null)) {
	        return false;
	    }
	    if ((id != null) && !id.equals(other.id)) {
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
		sb.append("id=").append(id == null ? "null" : id).append(", ");
		sb.append("nome=").append(nome == null ? "null" : nome).append(", ");
		sb.append("dataNascimento=").append(dataNascimento == null ? "null" : dataNascimento).append(", ");
		sb.append("creditoHabilitado=").append(creditoHabilitado == null ? "null" : creditoHabilitado).append(", ");
		sb.append("cpf=").append(cpf == null ? "null" : cpf).append(", ");
		sb.append("idFoto=").append(idFoto == null ? "null" : idFoto);
		sb.append(']');
	}
	
}
