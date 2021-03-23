package projetovideos;

public class Video implements AcoesVideo{
    private String titulo;
    private float avaliacao;
    private long views;
    private int curtidas;
    private boolean reproduzindo;
    
    @Override
    public void play(){
        if(this.getReproduzindo() == false){
            this.setReproduzindo(true);
        } else{
            System.out.println("Já está reproduzindo!");
        }
    }
    @Override
    public void pause(){
        if (this.getReproduzindo() == true){
            this.setReproduzindo(false);
        } else{
            System.out.println("Já está pausado!");
        }
    }
    @Override
    public void like(){
        this.setCurtidas(this.getCurtidas()+ 1);
    }

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + 
                ", views=" + views + ", curtidas=" + curtidas + 
                ", reproduzindo=" + reproduzindo + '}';
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao) / this.views);
        
        this.avaliacao = nova;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
}

