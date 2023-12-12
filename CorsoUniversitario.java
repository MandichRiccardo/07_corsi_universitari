public class CorsoUniversitario extends Corso {
    private String facolta;
    private int crediti;
    
    public CorsoUniversitario(Professore docente){
        super(docente);
        facolta = Interazione.strput("di che facoltà è questo corso?");
        crediti = Interazione.input("quanti crediti dà questo esame?");
    }
    
    public CorsoUniversitario(  String nome, int annoDiCorso, int oreSettimanali, String facolta, int crediti, Professore docente){
        super(nome, annoDiCorso, oreSettimanali, docente);
        this.facolta = facolta;
        this.crediti = crediti;
    }
    
    public void setFacolta(String facolta){
        this.facolta = facolta;
    }
    public String getFacolta(){
        return facolta;
    }
    
    public void setCrediti(int crediti){
        this.crediti = crediti;
    }
    public int getCrediti(){
        return crediti;
    }
    
    public String toString(){
        String info = "";
        info += super.toString();
        info += "\tfacolta del corso:\t\t\t\t"+facolta+"\n";
        info += "\tcrediti del corso:\t\t\t\t"+crediti+"\n";
        return info;
    }
}