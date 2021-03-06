import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StreamsTest {

    @Test
    public void collect() {
        List<String> strings = Arrays.asList("1", "2", "3", "4");



//        assertEquals(strings, collect);
    }

    @Test
    public void streamOf() {
        String[] strings = {"Hei", "på", "deg"};



//        assertEquals(Arrays.asList("Hei", "på", "deg"), collect);
    }

    @Test
    public void foreach() {
        List<Oppgave> oppgaver = lagOppgaveListeMedId("1", "2", "3", "4");

        StringBuilder stringBuilder = new StringBuilder();



//        assertEquals("1234", stringBuilder.toString());
    }

    @Test
    public void map() {
        List<Oppgave> oppgaver = lagOppgaveListeMedId("1", "2", "3", "4");



//        assertEquals(Arrays.asList("1", "2", "3", "4"), collect);
    }

    @Test
    public void flatMap() {
        Oppgave oppgave1 = lagOppgaveMedUnderOppgaver("1");
        Oppgave oppgave2 = lagOppgaveMedUnderOppgaver();
        Oppgave oppgave3 = lagOppgaveMedUnderOppgaver("2", "3", "4");
        List<Oppgave> oppgaver = Arrays.asList(oppgave1, oppgave2, oppgave3);



//        assertEquals(Arrays.asList("1", "2", "3", "4"), collect);
    }

    @Test
    public void filter() {
        List<Oppgave> oppgaver = lagOppgaveListeMedPrioritet(3, 2);



//        assertEquals(2, collect.size());
//        assertTrue(collect.stream().allMatch(oppgave -> Oppgave.PRIORITET_HOY.equals(oppgave.getPrioritet())));
    }

    @Test
    public void sort() {
        List<String> strings = Arrays.asList("Hein", "Vegard", "Aksel");



//        assertEquals(Arrays.asList("Aksel", "Hein", "Vegard"), collect);
    }

    @Test
    public void sort2() {
        List<Oppgave> oppgaver = lagOppgaveListeMedAnsvarlig("Hein", "Vegard", "Aksel");



//        assertEquals(Arrays.asList("Aksel", "Hein", "Vegard"), collect.stream().map(Oppgave::getAnsvarligNavn).collect(Collectors.toList()));
    }

    @Test
    public void reduce() {
        List<Oppgave> oppgaver = lagOppgaveListeMedId("1", "2", "3", "4", "5");



//        assertEquals("12345", s);
    }

    @Test
    public void findAny() {
        List<Oppgave> oppgaver = lagOppgaveListeMedPrioritet(2, 5);

        //lazy


//        assertTrue(Oppgave.PRIORITET_HOY.equals(oppgave1.getPrioritet()));
    }

    @Test
    public void toMap() {
        List<Oppgave> oppgaver = lagOppgaveListeMedId("1", "2", "3");



//        assertTrue(collect.get("1") == oppgaver.get(0));
//        assertTrue(collect.get("2") == oppgaver.get(1));
//        assertTrue(collect.get("3") == oppgaver.get(2));
    }

    @Test
    public void groupingBy() {
        List<Oppgave> oppgaver = lagOppgaveListeMedAnsvarlig("Aksel", "Aksel", "Aksel", "Tia", "Jørund", "June", "June");



//        assertEquals(new Long(3), collect.get("Aksel"));
//        assertEquals(new Long(2), collect.get("June"));
//        assertEquals(new Long(1), collect.get("Jørund"));
//        assertEquals(new Long(1), collect.get("Tia"));
    }

    @Test
    public void joining() {
        List<Oppgave> oppgaver = lagOppgaveListeMedId("1", "3", "5", "7");



//        assertEquals("OppgaveIder: 1,3,5,7", collect);
    }

    private Oppgave lagOppgaveMedUnderOppgaver(String... underOppgaveIder) {
        Oppgave oppgave = new Oppgave();
        ArrayList<String> underOppgaver = new ArrayList<>();
        underOppgaver.addAll(Arrays.asList(underOppgaveIder));
        oppgave.setUnderOppgaver(underOppgaver);
        return oppgave;
    }

    private Oppgave lagOppgaveMedId(String id) {
        Oppgave oppgave = new Oppgave();
        oppgave.setOppgaveId(id);
        return oppgave;
    }

    private Oppgave lagOppgaveMedPrioritet(String prioritet) {
        Oppgave oppgave = new Oppgave();
        oppgave.setPrioritet(prioritet);
        return oppgave;
    }

    private Oppgave lagOppgaveMedAnsvarlig(String ansvarlig) {
        Oppgave oppgave = new Oppgave();
        oppgave.setAnsvarligNavn(ansvarlig);
        return oppgave;
    }

    private List<Oppgave> lagOppgaveListeMedAnsvarlig(String... ansvarlige) {
        ArrayList<Oppgave> oppgaver = new ArrayList<>();
        for (String ansvarlig : ansvarlige) {
            oppgaver.add(lagOppgaveMedAnsvarlig(ansvarlig));
        }
        return oppgaver;
    }

    private List<Oppgave> lagOppgaveListeMedId(String... ider) {
        ArrayList<Oppgave> oppgaver = new ArrayList<>();
        for (String id : ider) {
            oppgaver.add(lagOppgaveMedId(id));
        }
        return oppgaver;
    }

    private List<Oppgave> lagOppgaveListeMedPrioritet(int lavPrioritet, int hoyPrioritet) {
        ArrayList<Oppgave> oppgaver = new ArrayList<>();
        for (int i = 0; i < lavPrioritet; i++) {
            oppgaver.add(lagOppgaveMedPrioritet(Oppgave.PRIORITET_LAV));
        }
        for (int i = 0; i < hoyPrioritet; i++) {
            oppgaver.add(lagOppgaveMedPrioritet(Oppgave.PRIORITET_HOY));
        }
        return oppgaver;
    }

}
