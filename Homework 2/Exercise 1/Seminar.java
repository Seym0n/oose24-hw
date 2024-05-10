package hw2.a1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Seminar<T extends IStudent> {
    private String name;
    private String id;

    private LinkedList<T> participants;

    public Seminar(String name, String id) {
        this.name = name;
        this.id = id;
        this.participants = new LinkedList<T>();
    }

    public void addParticipant(T pParticipant) {
        this.participants.add(pParticipant);
    }

    public LinkedList<T> getParticipants() {
        return participants;
    }

    public LinkedList<T> getParticipantsFromStudyProgram(String subject){
        LinkedList<T> participantsStudyProgram = new LinkedList<T>();
        for(T participant : this.participants){
            if(participant.getSubject().equals(subject)){
                participantsStudyProgram.add(participant);
            }
        }
        return participantsStudyProgram;
    }

    public static void main(String[] args) {
        Seminar<PhD> phdStudents = new Seminar<PhD>("Doktorandenseminar", "");
        phdStudents.addParticipant(new PhD("Adrian", "Software Engineering"));
        phdStudents.addParticipant(new PhD("Alice", "Software Engineering"));
        phdStudents.addParticipant(new PhD("Bob", "Algorithmics"));
        phdStudents.addParticipant(new PhD("Charly", "Visual Analytics"));

        Seminar<Student> bachelorStudents = new Seminar<Student>("Seminar Software Engineering", "SSE");
        bachelorStudents.addParticipant(new Student("Zedrick", "Wirtschaftsinformatik"));
        bachelorStudents.addParticipant(new Student("Yvonne", "Wirtschaftsinformatik"));
        bachelorStudents.addParticipant(new Student("Wladislav", "Mathematik"));
        bachelorStudents.addParticipant(new Student("Xenia", "Informatik"));
        bachelorStudents.addParticipant(new Student("Udo", "Informatik"));

        System.out.println(phdStudents.getParticipantsFromStudyProgram("Software Engineering"));
        System.out.println();
        System.out.println(phdStudents.getParticipantsFromStudyProgram("Algorithmics"));
        System.out.println();
        System.out.println(phdStudents.getParticipantsFromStudyProgram("Visual Analytics"));
        System.out.println();

        System.out.println(bachelorStudents.getParticipantsFromStudyProgram("Wirtschaftsinformatik"));
        System.out.println();
        System.out.println(bachelorStudents.getParticipantsFromStudyProgram("Mathematik"));
        System.out.println();
        System.out.println(bachelorStudents.getParticipantsFromStudyProgram("Informatik"));
        System.out.println();
    }
}
