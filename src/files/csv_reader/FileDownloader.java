package files.csv_reader;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileDownloader {
    public static void main(String[] args) throws IOException {
        download("https://stooq.pl/q/l/?s=goog.us&f=sd2t2ohlcv&h&e=csv","GOOG.csv");
        download("https://stooq.pl/q/l/?s=pzu&f=sd2t2ohlcv&h&e=csv", "PZU.csv");
        download("https://stooq.pl/q/l/?s=pkn&f=sd2t2ohlcv&h&e=csv","PKN.csv");
    }

    public static void download(String url, String fileName) throws IOException {
        try (InputStream in = URI.create(url).toURL().openStream()) {
            Files.copy(in, Paths.get(fileName));
        }
    }
}
