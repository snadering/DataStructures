package dk.cphbusiness.tog.datastructures.opgave.examples;

import dk.cphbusiness.tog.datastructures.opgave.DirectoryEntry;
import dk.cphbusiness.tog.datastructures.opgave.DirectoryImpl;
import dk.cphbusiness.tog.datastructures.opgave.File;
import dk.cphbusiness.tog.datastructures.opgave.FileImpl;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {




        DirectoryImpl root = new DirectoryImpl("Root");

        DirectoryImpl users = new DirectoryImpl("Users");

        DirectoryImpl sanderroust = new DirectoryImpl("sanderroust");

        DirectoryImpl downloads = new DirectoryImpl("Downloads");
        File steam = new FileImpl("Steam.dmg", "bla bla bla");
        File discord = new FileImpl("Discord.dmg", "bla bla bla");
        downloads.addChild(steam);
        downloads.addChild(discord);

        DirectoryImpl recent = new DirectoryImpl("Recent");

        DirectoryImpl documents = new DirectoryImpl("Documents");
        File document1 = new FileImpl("Ansøgning.pdf", "bla bla bla");
        File document2 = new FileImpl("Visual Studio Code", "bla bla bla");
        File document3 = new FileImpl("Sublime Text", "bla bla bla");
        documents.addChild(document1);
        documents.addChild(document2);
        documents.addChild(document3);

        DirectoryImpl desktop = new DirectoryImpl("Desktop");
        File file1 = new FileImpl("Screenshot42", "bla bla bla");
        File file2 = new FileImpl("Screenshot43", "bla bla bla");
        desktop.addChild(file1);
        desktop.addChild(file2);

        sanderroust.addChild(desktop);
        sanderroust.addChild(recent);
        sanderroust.addChild(downloads);
        sanderroust.addChild(documents);
        users.addChild(sanderroust);
        root.addChild(users);

        root.printDirectory(root, 0);

    }

}
