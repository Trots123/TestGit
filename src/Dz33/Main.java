package Dz33;

public class Main {

        public static void main(String[] args) {
            Journal journal = new Journal();

            journal.addNote("Сьогоднішні плани", "Анна");
            journal.addNote("Завтра зустріч", "Марк");
            journal.addNote("План відпустки", "Ірина");

            System.out.println("Всі нотатки:");
            List<Note> allNotes = journal.getAllNotes();
            for (Note note : allNotes) {
                System.out.println(note);
            }

            System.out.println("\nНотатка №2:");
            Note note2 = journal.getNoteByIndex(1);
            System.out.println(note2);

            journal.updateNote(0, "Змінені плани на сьогодні");
            journal.deleteNote(2);

            System.out.println("\nОновлена нотатка №1:");
            Note updatedNote = journal.getNoteByIndex(0);
            System.out.println(updatedNote);

            System.out.println("\nВсі нотатки після змін:");
            List<Note> updatedNotes = journal.getAllNotes();
            for (Note note : updatedNotes) {
                System.out.println(note);
            }
        }
}
