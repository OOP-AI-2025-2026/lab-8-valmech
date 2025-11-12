package ua.opnu;

class BookInfo implements Comparable<BookInfo> {

    private String name;
    private String writer;
    private int votes;
    private double totalScore;

    public BookInfo(String name, String writer, int votes, double totalScore) {
        this.name = name;
        this.writer = writer;
        this.votes = votes;
        this.totalScore = totalScore;
    }

    public double getAverage() {
        return votes == 0 ? 0.0 : totalScore / votes;
    }

    @Override
    public int compareTo(BookInfo o) {
        int cmp = Double.compare(o.getAverage(), this.getAverage());
        if (cmp == 0) {
            return this.name.compareTo(o.name);
        }
        return cmp;
    }

    @Override
    public String toString() {
        return name + " (" + getAverage() + ")";
    }
}
