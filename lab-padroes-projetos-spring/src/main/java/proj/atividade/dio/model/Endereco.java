package proj.atividade.dio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Atributos desta classe foram gerados automaticamente pelo site jsonschema2pojo.org
 * usando o JSON de retorno da API do ViaCEP.
 */
@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cep; // CEP do endereço, usado como chave primária
    
    private String logradouro; // Nome da rua ou avenida
    private String complemento; // Informações adicionais do endereço
    
    @Column(columnDefinition = "VARCHAR(255)")
    private String bairro; // Bairro do endereço
    
    private String localidade; // Cidade do endereço
    private String uf; // Unidade federativa (estado)
    private String ibge; // Código do município segundo o IBGE
    private String gia; // Código GIA (Guia de Informação e Apuração do ICMS)
    private String ddd; // Código de Discagem Direta à Distância (DDD)
    private String siafi; // Código SIAFI (Sistema Integrado de Administração Financeira)

    // Getters e Setters para cada atributo
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }
}

