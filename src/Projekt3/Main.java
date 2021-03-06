package Projekt3;

import Projekt3.Parsers.HtmlParser;
import Projekt3.Parsers.JsonParser;

import java.io.File;
import java.util.HashMap;

public class Main {
    public static void main(String [] args){

        File folder = new File(args[0]);

        JsonParser jsonParser = new JsonParser();
        HtmlParser htmlParser = new HtmlParser();

        HashMap<String, Judgment> judgments = new HashMap<>();

        judgments.putAll(jsonParser.parser(folder));
        judgments.putAll(htmlParser.parse(folder));

        CommandLine cl = new CommandLine();
        cl.commadLine(judgments);



    }
}
