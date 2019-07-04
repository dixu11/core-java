package files.playground.csv.files.Files;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {

    public List<City> parser(List<String> lines){
        List<City> cities = new ArrayList<City>();
        for (String line : lines) {
            String[] splitLine = line.split(",");
            String ns = splitLine[3];
            String name = splitLine[8];
            String state = splitLine[9];
            City city = new City(ns, name, state);
            cities.add(city);
        }
        return cities;
    }
}
