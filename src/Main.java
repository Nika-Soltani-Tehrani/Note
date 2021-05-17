import java.io.*;


public class Main {

    public static void main(String[] args) {


        FileUtils fileUtils = new FileUtils();

        fileUtils.fileWriter("Hello");
        fileUtils.fileWriterOutputStream("Hi");
        Note note1 = new Note("note1","First note","12-2-2019");
        fileUtils.fileWriterObj(note1);
        File file1 = new File("./WS_7/Hello_new file");
        File file2 = new File("./WS_7/Note{title='note1', date='12-2-2019'}");
        fileUtils.fileReader(file1);
        fileUtils.fileReaderInputStream(file1);
        System.out.println(fileUtils.fileReaderObj(file2));




    }

}


