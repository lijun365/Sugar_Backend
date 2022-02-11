package org.freefly.simplesugarmark.common;

public class PageVO {
    private int total;
    private int curPage;
    private int pageSize;
    private int startPos;

    public PageVO() {
    }

    public PageVO(int curPage, int pageSize) {
        this.curPage = curPage;
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "PageVO{" +
                "total=" + total +
                ", curPage=" + curPage +
                ", pageSize=" + pageSize +
                ", startPos=" + startPos +
                '}';
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStartPos() {
        return (curPage-1)*pageSize;
    }

    public void setStartPos(int startPos) {
        this.startPos = startPos;
    }
}
