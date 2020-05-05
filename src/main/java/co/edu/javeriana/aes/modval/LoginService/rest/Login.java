package co.edu.javeriana.aes.modval.NewService.rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.LocalDate;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Login implements Serializable {

    private String user;
    private String passw;
    private Boolean valido;

    public Login() {
    }

    public Login(String user, String passw, Boolean valido) {
        this.user = user;
        this.passw = passw;
        this.valido = valido;
      
    }

    public String getUser() {
        return user;
    }

    public String getPasw() {
        return passw;
    }
    
    public Boolean getValido() {
        return valido;
    }

}
