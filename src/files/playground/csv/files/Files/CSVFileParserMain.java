package files.playground.csv.files.Files;
import java.util.List;

public class CSVFileParserMain {

    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        CSVParser csvParser = new CSVParser();
        List<String> file = readFile.readFile();
        List<City> cities = csvParser.parser(file);
        for (City city : cities) {
            System.out.println(city);
        }
    }
}
