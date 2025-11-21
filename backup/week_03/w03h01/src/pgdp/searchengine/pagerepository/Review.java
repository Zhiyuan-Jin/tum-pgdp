package pgdp.searchengine.pagerepository;



import pgdp.searchengine.util.Date;

public class Review {
    private static int gesamtpostId;
    private int postId;
    private String title;
    private String content;
    private int rating;
    private Date postDate;
    private Author reviewer;
    private Document reviewedDocument;

    public Review(String title, String content, Date postDate, Author reviewer, Document reviewedDocument, int rating) {
        this.title = title;
        this.content = content;
        this.postDate = postDate;
        this.reviewer = reviewer;
        this.reviewedDocument = reviewedDocument;
        this.rating = rating;
        this.postId=gesamtpostId++;
    }

    public static void setGesamtpostId(int gesamtpostId) {
        Review.gesamtpostId = gesamtpostId;
    }

    public static int numberOfCreatedReviews(){
        return  gesamtpostId;
    }

    public boolean equals(Review review){
        return review.postId==this.postId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public Author getReviewer() {
        return reviewer;
    }

    public void setReviewer(Author reviewer) {
        this.reviewer = reviewer;
    }

    public Document getReviewedDocument() {
        return reviewedDocument;
    }

    public void setReviewedDocument(Document reviewedDocument) {
        this.reviewedDocument = reviewedDocument;
    }

    public String toPrintText() {
        return reviewedDocument.toString() + "\n"
                + rating + "\n"
                + title + "\n"
                + content + "\n"
                + postDate.toString() + "\n"
                + reviewer.toString();
    }
    @Override
    public String toString() {
        return title + " (" + rating + ") - " + reviewedDocument.toString();
    }

}
