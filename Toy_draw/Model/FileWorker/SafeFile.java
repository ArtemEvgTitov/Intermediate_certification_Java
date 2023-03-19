package Toy_draw.Model.FileWorker;

import java.io.*;

public class SafeFile {
    
    public static void safeFile(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ReadFile.fileName)))
        {
            oos.writeObject(ReadFile.allToys);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
