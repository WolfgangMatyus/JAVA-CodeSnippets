package CodeSnippets.Export;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


class Content{
    String text1 = "abc";
    String text2 = "def";
    String text3 = "ghi";

    List contents = new LinkedList();

    public List getContents(){
        return contents;
    }

    public void addContent(String text){
        contents.add(text);
    }

}

public class Export {

    public static int export(Collection<Content> contents, String filename) {
        int n = 0;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Content d : contents) {
                writer.write(d.toString());
                writer.newLine();
                n++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return n;
    }


    public static void main(String[] args) {
        Content contents = new Content();

        Set contentsSet = new HashSet();
        for(String con : contents)
            contentsSet.add(con);

        contents.addContent("abc");
        contents.addContent("def");
        contents.addContent("ghi");

        Collections.sort(contentsSet);

        export(contentsSet, "deliveries_on_route.txt");
    }
}
