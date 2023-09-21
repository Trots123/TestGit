package Dz33;
import java.util.ArrayList;
import java.util.List;

public class NJOR {
    private List<Note> notes;

    public Journal() {
        notes = new ArrayList<>();
    }

    // Додавання нової нотатки
    public void addNote(String text, String author) {
        Note note = new Note(text, author);
        notes.add(note);
    }

    // Видалення нотатки за індексом
    public void deleteNote(int index) {
        if (index >= 0 && index < notes.size()) {
            notes.remove(index);
        }
    }

    // Оновлення нотатки за індексом
    public void updateNote(int index, String newText) {
        if (index >= 0 && index < notes.size()) {
            Note note = notes.get(index);
            note.setText(newText);
        }
    }

    // Отримання всіх нотаток
    public List<Note> getAllNotes() {
        return notes;
    }

    // Отримання нотатки за індексом
    public Note getNoteByIndex(int index) {
        if (index >= 0 && index < notes.size()) {
            return notes.get(index);
        }
        return null;
    }

    // Отримання кількості нотаток у щоденнику
    public int getNoteCount() {
        return notes.size();
    }
}

