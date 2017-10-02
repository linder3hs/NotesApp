package com.linder.notesapp.repositorie;

import com.linder.notesapp.model.Note;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Alumno on 2/10/2017.
 */

public class NoteRepository {

    private static final String TAG = NoteRepository.class.getSimpleName();

    private static List<Note> notes = new ArrayList<>();

    public static List<Note> getNotes() {
        return notes;
    }

    private static long sequence = 1;

    public static Note add(Note note){
        note.setId(sequence++);
        notes.add(0, note);
        return note;
    }

    public static Note get(Long id){
        for (Note note : notes) {
            if(note.getId().equals(id))
                return note;
        }
        return null;
    }

    public static Note remove(Long id){
        for(Iterator<Note> i = notes.iterator(); i.hasNext();) {
            Note note = i.next();
            if(note.getId().equals(id)) {
                i.remove();
                return note;
            }
        }
        return null;
    }

}
