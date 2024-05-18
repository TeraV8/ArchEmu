package io.terav.archemu;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Main {
    public static void main(String[] args) {
        final Options definedOptions = setupOptions();
        final CommandLineParser parser = new DefaultParser();
        try {
            CommandLine line = parser.parse(definedOptions, args);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    private static Options setupOptions() {
        return new Options().addOption("?", "help", false, "Displays this usage text");
    }
}
