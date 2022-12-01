package dk.cphbusiness.tog.datastructures.opgave;

import java.util.ArrayList;
import java.util.Collection;

public class DirectoryImpl implements Directory{
    private ArrayList<DirectoryEntry> children;
    private String name;

    public DirectoryImpl(String name) {
        this.children = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void addChild(DirectoryEntry entry) {
        children.add(entry);
    }

    public void printDirectory(DirectoryEntry entry, int indents){
        StringBuilder sIndents = new StringBuilder();
        for (int i = 0; i < indents; i++){
            sIndents.append("   ");
        }
        if(entry.isFile()) {
            System.out.println(sIndents + "└" + "─" + entry.getName());
        }
        else {
            System.out.println(sIndents + "└" + "─" + entry.getName());
            if (((Collection<DirectoryEntry>)entry.asDirectory().getChildren()).size() == 0) {
                System.out.println(sIndents + "   " + "└" + "─");
            }
            for (DirectoryEntry e : entry.asDirectory().getChildren()) {
                printDirectory(e, indents + 1);
            }
        }
        }

    @Override
    public Iterable<DirectoryEntry> getChildren() {
        return children;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isDirectory() {
        return true;
    }

    @Override
    public boolean isFile() {
        return false;
    }

}
