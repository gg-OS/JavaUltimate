package orm.aluno;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Alunos")
public class Aluno {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String email;
	private String CPF;
	private String dataNascimento;
	private String naturalidade;
	private String endereco;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("\n\nid:").append(id);
	    sb.append(",\nnome:").append(nome);
	    sb.append(",\nemail:").append(email);
	    sb.append(",\nCPF:").append(CPF);
	    sb.append(",\ndataNascimento:").append(dataNascimento);
	    sb.append(",\nnaturalidade:").append(naturalidade);
	    sb.append(",\nendereco:").append(endereco);
	    return sb.toString();
	}

	

}
