import java.util.List;

class Oppgave {

    static final String PRIORITET_HOY = "HOY";
    static final String PRIORITET_LAV = "LAV";
    private String oppgaveId;
    private String ansvarligNavn;
    private String prioritet;
    private List<String> underOppgaver;

    String getOppgaveId() {
        return oppgaveId;
    }

    void setOppgaveId(String oppgaveId) {
        this.oppgaveId = oppgaveId;
    }

    String getAnsvarligNavn() {
        return ansvarligNavn;
    }

    void setAnsvarligNavn(String ansvarligNavn) {
        this.ansvarligNavn = ansvarligNavn;
    }

    String getPrioritet() {
        return prioritet;
    }

    void setPrioritet(String prioritet) {
        this.prioritet = prioritet;
    }

    List<String> getUnderOppgaver() {
        return underOppgaver;
    }

    void setUnderOppgaver(List<String> underOppgaver) {
        this.underOppgaver = underOppgaver;
    }
}
