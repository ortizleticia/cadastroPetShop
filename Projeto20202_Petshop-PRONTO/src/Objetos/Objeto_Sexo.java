

package Objetos;


public class Objeto_Sexo {
    
    private int cd_sexo;
    private String ds_sexo;

    public int getCd_sexo() {
        return cd_sexo;
    }

    public void setCd_sexo(int cd_sexo) {
        this.cd_sexo = cd_sexo;
    }

    public String getDs_sexo() {
        return ds_sexo;
    }

    public void setDs_sexo(String ds_sexo) {
        this.ds_sexo = ds_sexo;
    }
   
 
    public boolean is_sexo_animal_VALIDO () {
        boolean saida = false;
        
        if(this.ds_sexo.length()<=200) {
            saida= true;
        }
        
        return saida;
        
    }
    
   
    
    
}
