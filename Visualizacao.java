package projetovideos;

public class Visualizacao {
    
    private Gafanhotos expectador;
    private Video filme;

    @Override
    public String toString() {
        return "Visualizacao{" + "expectador=" + expectador + ", filme=" + filme + '}';
    }

    public Visualizacao(Gafanhotos expectador, Video filme) {
        this.expectador = expectador;
        this.filme = filme;
        this.expectador.setTotAssistid(this.expectador.getTotAssistid() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar(){
        this.filme.setAvaliacao(5f);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        int total = 0;
        if(porc<= 20){
            total = 3;
        } else if(porc <= 50){
            total = 5;
        } else if(porc <= 90){
            total = 8;
        } else {
            total = 10;
        }
        this.filme.setAvaliacao(total);
    }
    
    public Gafanhotos getExpectador() {
        return expectador;
    }

    public void setExpectador(Gafanhotos expectador) {
        this.expectador = expectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
}

