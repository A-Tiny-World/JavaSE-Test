package org.example;

public class Book {
    private String fdId;
    private String fdName;

    public Book() {
    }

    public Book(String fdId, String fdName) {
        this.fdId = fdId;
        this.fdName = fdName;
    }

    /*
     * @author chenzhihui
     * @return fdId
     */
    public String getFdId() {
        return fdId;
    }

    /*
     * @author chenzhihui
     * @param  fdId
     */
    public void setFdId(String fdId) {
        this.fdId = fdId;
    }

    /*
     * @author chenzhihui
     * @return fdName
     */
    public String getFdName() {
        return fdName;
    }

    /*
     * @author chenzhihui
     * @param  fdName
     */
    public void setFdName(String fdName) {
        this.fdName = fdName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "fdId='" + fdId + '\'' +
                ", fdName='" + fdName + '\'' +
                '}';
    }
}
