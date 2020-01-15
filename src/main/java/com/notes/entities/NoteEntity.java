package com.notes.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "note", schema = "notes", catalog = "postgres")
public class NoteEntity {
    private long noteId;
    private String noteDescription;

    @Id
    @Column(name = "note_id")
    public long getNoteId() {
        return noteId;
    }

    public void setNoteId(long noteId) {
        this.noteId = noteId;
    }

    @Basic
    @Column(name = "note_description")
    public String getNoteDescription() {
        return noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteEntity that = (NoteEntity) o;
        return noteId == that.noteId &&
                Objects.equals(noteDescription, that.noteDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noteId, noteDescription);
    }
}
