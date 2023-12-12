public class Corso{
    protected String nome;
    protected int annoDiCorso;
    protected int oreSettimanali;
    protected Professore docente;
    
    public Corso(Professore docente){
        nome = Interazione.strput("qual'è il nome di questo esame?");
        annoDiCorso = Interazione.input("di che anno è questo esame?");
        oreSettimanali = Interazione.input("quante ore ha ogni settimana il corso di questo esame?");
        this.docente = docente;
    }
    
    public Corso(String nome, int annoDiCorso, int oreSettimanali, Professore docente){
        this.nome = nome;
        this.annoDiCorso = annoDiCorso;
        this.oreSettimanali = oreSettimanali;
        this.docente = docente;
    }
    
    public Corso(Corso c){
        this.nome = c.nome;
        this.annoDiCorso = c.annoDiCorso;
        this.oreSettimanali = c.oreSettimanali;
        this.docente = c.docente;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setAnno(int anno){
        annoDiCorso = anno;
    }
    public int getAnno(){
        return annoDiCorso;
    }
    
    public void setOre(int oreSettimanali){
        this.oreSettimanali = oreSettimanali;
    }
    public int getOre(){
        return oreSettimanali;
    }
    
    public void setProfessore(Professore docente){
        this.docente = docente;
    }
    public Professore getProfessore(){
        return docente;
    }
    
    public String toString(){
        String info = "\tnome:\t\t\t\t\t\t\t"+nome+"\n";
        info += "\tanno del corso:\t\t\t\t\t"+annoDiCorso+"\n";
        info += "\tore di corso alla settimana:\t"+oreSettimanali+"\n";
        info += "\tdocente del corso:\n"+docente+"\n";
        return info;
    }
}