package com.epam.rd.autocode.observer.git;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Branch {
    private final String name;
    private final List<Commit> commits;

    public Branch(final String name) {
        Objects.requireNonNull(name);
        this.name = name;
        this.commits = new ArrayList<>();
    }

    public void submit(List<Commit> newCommits) {
        this.commits.addAll(newCommits);
    }

    public List<Commit> getCommits() {
        return new ArrayList<>(commits);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Branch branch = (Branch) o;
        return name.equals(branch.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
