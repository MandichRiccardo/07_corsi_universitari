public class CorsoSuperiori extends Corso {
    private String tipo;
    private String indirizzo;
    
    public CorsoSuperiori(Professore docente){
        super(docente);
        tipo = Interazione.strput("di che tipo è questo corso?");
        indirizzo = Interazione.strput("di che indirizzo è questo corso?");
    }
    
    public CorsoSuperiori(  String nome, int annoDiCorso, int oreSettimanali, String tipo, String indirizzo, Professore docente){
        super(nome, annoDiCorso, oreSettimanali, docente);
        this.tipo = tipo;
        this.indirizzo = indirizzo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    
    public void setIndirizzo(String crediti){
        this.indirizzo = indirizzo;
    }
    public String getIndirizzo(){
        return indirizzo;
    }
    
    public String toString(){
        String info = "";
        info += super.toString();
        info += "\tipo del corso:\t\t\t\t"+tipo+"\n";
        info += "\tindirizzo del corso:\t\t\t\t"+indirizzo+"\n";
        return info;
    }
}