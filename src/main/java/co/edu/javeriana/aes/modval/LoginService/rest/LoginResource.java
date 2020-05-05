package co.edu.javeriana.aes.modval.NewService.rest;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;


@Path("/login")
public class LoginResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Boolean loginRest(@QueryParam("user") String user, @QueryParam("passw") String passw ) {
    	Boolean valido = false;
        if (!user.startsWith("user")) {
            throw new IllegalArgumentException("Login Invalido");
        }
        if(user.equals("user1") && passw.equals("123")) {
        	valido=true; }
        if(user.equals("user2") && passw.equals("234")) {
        	valido=true; }
        if(user.equals("user3") && passw.equals("345")) {
        	valido=true; }

        return valido;
    }
    /*
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Login loginRest(@QueryParam("user") String user ) {
    	Boolean valido = false;
        if (!user.startsWith("user")) {
            throw new IllegalArgumentException("Login Invalido");
        }
        if(user.equals("user1")) {
        	valido=true; }
        if(user.equals("user2")) {
        	valido=true; }
        if(user.equals("user3")) {
        	valido=true; }

        return new Login(user, "123", valido);
    }*/

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Boolean loginPost(Login login) {
    	Boolean valido = false;
        if (!login.getUser().startsWith("user")) {
            throw new IllegalArgumentException("Login Invalido");
        }
        String valor;
        if(login.getUser().toString().equals("user1") && login.getPasw().toString().equals("123")) {
        	valido=true;}
        if(login.getUser().toString().equals("user2") && login.getPasw().toString().equals("234")) {
        	valido=true;}
        if(login.getUser().toString().equals("user3") && login.getPasw().toString().equals("345")) {
        	valido=true; }

        return valido;
    }

    
}
