package pgdp.searchengine.pagerepository;

import pgdp.searchengine.util.Date;

public class Document {
    private static int gesamtdocumentId;
    private int documentId;
    private String title;
    private String description;
    private String content;
    private Author author;
    private Date releaseDate, lastUpdateDate;

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", lastUpdateDate=" + lastUpdateDate +
                ", author=" + author +
                '}';
    }

    public String toPrintText() {
        return title + "\n" +
                author.toString() + "\n"
                + description + "\n"
                + lastUpdateDate.toString();
    }




    public Document(String title, String description, String content, Date releaseDate, Author author) {
        this.title = title;
        this.description = description;
        this.content = content;
        this.releaseDate = releaseDate;
        this.lastUpdateDate = releaseDate;
        this.author = author;
        this.documentId = gesamtdocumentId++;
    }

    public static void setGesamtdocumentId(int gesamtdocumentId) {
        Document.gesamtdocumentId = gesamtdocumentId;
    }

    public boolean equals(Document document) {
        return document.documentId == this.documentId;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public static int numberOfCreatedDocuments() {
        return gesamtdocumentId;
    }
}
