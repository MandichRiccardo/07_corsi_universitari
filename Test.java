public class Test{
    public static void main(String args[]){
        Professore p1 = new Professore("Mario", "Rossi", "1990/08/30", true);
        Professore p2 = new Professore("Paolo", "Belli", "1980/09/03", true);
        Professore p3 = new Professore("Gino", "Bino", "1975/05/25", false);
        CorsoUniversitario c1 = new CorsoUniversitario("matematica 1", 1, 8, "matematica", 20, p1);
        CorsoUniversitario c2 = new CorsoUniversitario("matematica 1", 1, 8, "matematica", 20, p2);
        CorsoUniversitario c3 = new CorsoUniversitario("matematica 1", 1, 8, "matematica", 20, p3);
        CorsoUniversitario c4 = new CorsoUniversitario("fisica 1", 1, 8, "matematica", 20, p2);
        if(c1.equals(c2) && c2.equals(c3)){
            Interazione.output("i tre corsi di matematica 1 sono uguali");
        }else{
            if(c1.equals(c2)){
                Interazione.output("il primo e il secondo corso sono uguali");
            }
            if(c1.equals(c3)){
                Interazione.output("il primo e il terzo corso sono uguali");
            }
            if(c2.equals(c3)){
                Interazione.output("il secondo e il terzo corso sono uguali");
            }
        }
        //Interazione.output("primo esame:\n"+ c1);
        //Interazione.output("secondo esame:\n"+ c2);
        //Interazione.output("terzo esame:\n"+ c3);
        //Interazione.output("quarto esame:\n"+ c4);
        Studente s1 = new Studente("Riccardo", "Mandich", "RicMan20232006", 2023, 2006);
        Interazione.output(s1.iscrizioneCorso(c1));
        Interazione.output(s1.iscrizioneCorso(c2));
        Interazione.output(s1.iscrizioneCorso(c3));
        Interazione.output(s1.iscrizioneCorso(c4));
        Interazione.output(s1.esameSuperato(c1));
    }
}