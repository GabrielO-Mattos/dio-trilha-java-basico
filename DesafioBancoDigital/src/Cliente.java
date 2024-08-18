import java.time.LocalDate;

public class Cliente {

    private String nome;
    private String cpf;
    private String cnpj;
    private LocalDate dataNascimentoDate;
    private String telefone;
    private String tipoDePessoa;

    /* Get's and Set's */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public LocalDate getDataNascimentoDate() {
        return dataNascimentoDate;
    }
    public void setDataNascimentoDate(LocalDate dataNascimentoDate) {
        this.dataNascimentoDate = dataNascimentoDate;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTipoDePessoa() {
        return tipoDePessoa;
    }
    public void setTipoDePessoa(String tipoDePessoa) {
        this.tipoDePessoa = tipoDePessoa;
    }
    

    /* Construtor */
    public Cliente(String nome, String cpf_cnpj, String tipoDePessoa) {
        this.nome = nome;
        this.tipoDePessoa = tipoDePessoa;

        if(tipoDePessoa.equals("Juridica")) {
            this.cnpj = cpf_cnpj;
        } else {
            this.cpf = cpf_cnpj;
        }
    }



}
