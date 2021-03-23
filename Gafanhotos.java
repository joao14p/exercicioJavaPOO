package projetovideos;

public class Gafanhotos extends Pessoa {
    private String login;
    private long totAssistid;
    
    public void viuMaisUm(){
        this.setTotAssistid(this.getTotAssistid() + 1);
    }

    public Gafanhotos(String login, long totAssistid, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistid = 0;
    }

    @Override
    public String toString() {
        return "Gafanhotos{" + "login=" + login + ", totAssistid=" + totAssistid + '}';
    }

    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getTotAssistid() {
        return totAssistid;
    }

    public void setTotAssistid(long totAssistid) {
        this.totAssistid = totAssistid;
    }
    
}

