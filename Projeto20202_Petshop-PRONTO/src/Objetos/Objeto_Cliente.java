
package Objetos;


public class Objeto_Cliente {
    
    private int cd_cliente;
    private int cd_sexo;
    private String nm_cliente;
    private String dt_nascimento;
    private String nr_cpf;
    //campo FK
    private String ds_sexo;

    public int getCd_cliente() {
        return cd_cliente;
    }

    public void setCd_cliente(int cd_cliente) {
        this.cd_cliente = cd_cliente;
    }

    public int getCd_sexo() {
        return cd_sexo;
    }

    public void setCd_sexo(int cd_sexo) {
        this.cd_sexo = cd_sexo;
    }

    public String getNm_cliente() {
        return nm_cliente;
    }

    public void setNm_cliente(String nm_cliente) {
        this.nm_cliente = nm_cliente;
    }

    public String getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getNr_cpf() {
        return nr_cpf;
    }

    public void setNr_cpf(String nr_cpf) {
        this.nr_cpf = nr_cpf;
    }

    public String getDs_sexo() {
        return ds_sexo;
    }

    public void setDs_sexo(String ds_sexo) {
        this.ds_sexo = ds_sexo;
    }
    
     public boolean is_Nm_Cliente_Valido () {
        boolean saida=false;
        if(this.nm_cliente.length()<=100) {
             saida=true;
        }
        return saida;
    }
     
     public boolean is_Nasc_Cliente_Valido () {
        boolean saida=false;
        if(this.dt_nascimento.length()<=15) {
             saida=true;
        }
        return saida;
    }
     
     public boolean is_CPF_Cliente_Valido () {
        boolean saida=false;
        if(this.nr_cpf.length()<=30) {
             saida=true;
        }
        return saida;
    }
    
}
