public class Studente{
    private String nome;
    private String cognome;
    private String matricola;
    private int annoImmatricolazione;
    private int annoNascita;
    private CorsoUniversitario[] corsiFrequentati;
    
    //costruttore a parametri
    public Studente(String nome, String cognome, String matricola, int annoImmatricolazione, int annoNascita){
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.annoImmatricolazione = annoImmatricolazione;
        this.annoNascita = annoNascita;
        this.corsiFrequentati = new CorsoUniversitario[7];
    }
    
    //costruttore per input
    public Studente(){
        this.nome = Interazione.strput("inserisci il nome dello studente");
        this.cognome = Interazione.strput("inserisci il cognome dello studente");
        this.matricola = Interazione.strput("inserisci la matricola dello studente");
        this.annoImmatricolazione = Interazione.input("inserisci l'anno in cui si è immatricolato lo studente");
        this.annoNascita = Interazione.input("inserisci l'anno in cui è nato lo studente");
        this.corsiFrequentati = new CorsoUniversitario[7];
    }
    
    public String getCorsi(){
        String info = "";
        for(int i=0;i<7;i++){
            info = info.concat("\t"+corsiFrequentati[i].toString()+"\n");
        }
        return info;
    }
    
    //override di toString()
    public String toString(){
        String info = "nome:\t" + nome + "\n";
        info = "cognome:\t" + cognome + "\n";
        info = "matricola:\t" + matricola + "\n";
        info = "anno di immatricolazione:\t" + annoImmatricolazione + "\n";
        info = "anno di nascita:\t" + annoNascita + "\n";
        info = "corsi a cui sei iscritto:\t" + getCorsi() + "\n";
        return info;
    }
    
    //metodo per iscriversi ad un corso
    public String iscrizioneCorso(CorsoUniversitario corso){
        for(int i=0;i<7;i++){
            if(this.corsiFrequentati[i] == null){
                this.corsiFrequentati[i] = corso;
                return "ti sei iscritto a " + corso.getNome();
            }else if(corso.equals(this.corsiFrequentati[i])){
                return "il corso " + this.corsiFrequentati[i].getNome() + " è uguale al corso " + corso.getNome() + " per cui non ti ho iscritto a quello nuovo";
            }
        }
        return "non puoi iscriverti a " + corso.getNome() + "perchè hai già raggiunto il numero massimo di corsi alla quale puoi iscriverti";
    }
    
    //metodo per rimuovere un corso nel momento in cui si termina
    public String esameSuperato(CorsoUniversitario corso){
        for(int i=0;i<7;i++){
            if(corso.equals(this.corsiFrequentati[i])){
                int j=i;
                while(j<6){
                    this.corsiFrequentati[j] = this.corsiFrequentati[j++];
                }
                this.corsiFrequentati[j]=null;
                return "ho rimosso il corso " + corso.getNome() + " dall'elenco di corsi a cui sei iscritto";
            }
        }
        return "non ho trovato il corso " + corso.getNome() + "nell'elenco dei corsi a cui sei iscritto";
    }
}