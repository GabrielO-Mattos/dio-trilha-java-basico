import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Cliente extends Exception {

    /* Variaveis */
    private String nome;
    private String cpf;
    private String cnpj;
    private LocalDate dataNascimentoDate;
    private String telefone;
    private String tipoDePessoa;
    private static Set<String> cpfs_cnpjs = new HashSet<>();


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

    @Override
    public String toString() {
        return "Cliente [nome: " + getNome() + ", cpf: " + getCpf() + ", cnpj: " + getCnpj() + ", dataNascimentoDate: "
                + getDataNascimentoDate() + ", telefone: " + getTelefone() + ", tipoDePessoa: " + getTipoDePessoa() + "]";
    }
    


    /* Construtor */
    public Cliente(String nome, String cpf_cnpj, String tipoDePessoa) {
        if(tipoDePessoa.equals("Juridica")) {
            if (cpfs_cnpjs.contains(cpf_cnpj)) {
                throw new DuplicidadeDocumentoException("CNPJ já cadastrado: " + cpf_cnpj);
            } else {
                cpfs_cnpjs.add(cpf_cnpj);
                this.cnpj = cpf_cnpj;
            }
        } else {
            if (cpfs_cnpjs.contains(cpf_cnpj)) {
                throw new DuplicidadeDocumentoException("CNPJ já cadastrado: " + cpf_cnpj);
            } else {
                cpfs_cnpjs.add(cpf_cnpj);
                this.cpf = cpf_cnpj;
            }
        }
        this.nome = nome;
        this.tipoDePessoa = tipoDePessoa;
    }



}
