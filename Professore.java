public class Professore{
    String nome;
    String cognome;
    String dataNascita;
    boolean ordinario;              //true == ordinario, false == associato;
    
    public Professore(String nome, String cognome, String dataNascita, boolean ordinario){
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.ordinario = ordinario;
    }
    
    public Professore(){
        this.nome = Interazione.strput("qual'è il nome del professore?");
        this.cognome = Interazione.strput("qual'è il cognome del professore?");
        this.dataNascita = Interazione.strput("in che giorno è nato il professore?");
        this.ordinario = Interazione.boolput("è un professore ordinario?\t(altrimenti lo considero associato)");
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataNascita() {
        return this.dataNascita;
    }
    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public boolean isOrdinario() {
        return this.ordinario;
    }
    public void setOrdinario(boolean ordinario) {
        this.ordinario = ordinario;
    }

    public String toString(){
        String info = "\t\tnome:\t\t\t\t\t\t"+nome+"\n";
        info += "\t\tcognome:\t\t\t\t\t"+cognome+"\n";
        info += "\t\tdata di nascita:\t\t\t"+dataNascita+"\n";
        if(ordinario){
            info += "\t\tquesto professore è\t\t\tordinario\n";
        }else{
            info += "\t\tquesto professore è\t\t\tassociato\n";
        }
        return info;
    }
}