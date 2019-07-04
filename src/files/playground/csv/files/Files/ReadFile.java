package files.playground.csv.files.Files;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFile {

    public List<String> readFile() {
        String fileName = "cities.csv";
        try {
            return Files.lines(Paths.get(fileName))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
