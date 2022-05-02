package PojoClasses.Me;

import java.util.List;

public class SelectedChilds {
    private String text;
    private List<Object> pages;
    private int year;

    public SelectedChilds(String text, List<Object> pages, int year) {
        this.text = text;
        this.pages = pages;
        this.year = year;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Object> getPages() {
        return pages;
    }

    public void setPages(List<Object> pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
