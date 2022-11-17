package backend;


public class Librarian implements Record{
    
    private final String username;
    private final String password;

    public Librarian(String username,String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUserName() {
        return username;
    }
    
    public String getPassWord() {
        return password;
    }
    
    @Override
    public String lineRepresentation() {
        return username+","+password;
    }

    @Override
    public String getSearchKey() {
        return username;
    }

    @Override
    public String getpassword() {
        return password;
    }
}