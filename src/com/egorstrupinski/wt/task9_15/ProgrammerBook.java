package com.egorstrupinski.wt.task9_15;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Override
    public String toString() {
        return "ProgrammerBook (" +
                "language= " + language + '|' +
                ", level= " + level +
                ')';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Book)) return false;
        if (!this.getClass().equals(obj.getClass())) return false;
        ProgrammerBook book = (ProgrammerBook) obj;
        if (level != book.level) return false;
        return !this.language.equals(book.language);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 17 * result + language.hashCode();
        result = 17 * result + level;
        return result;
    }
}
