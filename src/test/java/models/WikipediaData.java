package models;

import lombok.Getter;

@Getter
public class WikipediaData {
    private String searchName;
    private String fileName;
    private String filePath;
    private String resourcePath;

    public String getSearchName() {
        return searchName;
    }
    public String getFileName() {
        return fileName;
    }
    public String getFilePath() {
        return filePath;
    }
    public String getResourcePath() {
        return resourcePath;
    }
}
