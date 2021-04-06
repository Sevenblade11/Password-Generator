package file;

import java.io.File;

public class DirectoryManager {

    private String userPath;
    private File passGenDir;

    public DirectoryManager(){
        userPath = System.getProperty("user.home") + File.separator + "Documents" +File.separator + "Password Generator";
        passGenDir = new File(userPath);
    }

    public boolean checkExists(){
        return passGenDir.exists();
    }

    public void createDir(){
        if(checkExists())
            System.out.println("[Directory Manager]: Password folder exists. Skipping creation...");
        else if(passGenDir.mkdirs())
            System.out.println("[Directory Manager]: Unable to find Password folder. Creating...");
        else
            System.out.println("[Directory Manager]: Could not create or find Password folder.");
    }
}
