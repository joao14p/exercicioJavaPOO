package projetovideos;

public class ProjetoVideos {
    public static void main(String[] args) {
        
    Video v[] = new Video[3];
    v[0] = new Video("Aula 01 de POO");
    v[1] = new Video("Aula 12 de PHP");
    v[2] = new Video("Aula 10 de HTML5");
    
    Gafanhotos g[] = new Gafanhotos[2];
    g[0] = new Gafanhotos("juba", 0, "Jubileu","M", 22);
    g[1] = new Gafanhotos("Creuzita", 0, "Creuza", "F", 12);
    
    Visualizacao vis = new Visualizacao(g[0], v[2]);
        System.out.println(vis.toString());
    
    }
    
}
