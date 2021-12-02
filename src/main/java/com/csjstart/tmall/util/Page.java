package com.csjstart.tmall.util;

/**
 * @Author: chenchenstart
 * @CreateTime: 2021/5/21 - 10:52
 * @Description:
 */
public class Page {
    int start;//开始页数
    int count;//每页个数
    int total;//总个数
    String param;//参数

    public static final int defaultCount = 5;//默认每页显示5条

    public Page() {
        count = defaultCount;
    }

    public Page(int start) {
        count = defaultCount;
    }

    public Page(int start, int count) {
        super();
        this.start = start;
        this.count = count;
    }

    public boolean isHasPreviouse() {
        if (start == 0) {
            return false;
        }
        return true;
    }

    public boolean isHasNext() {
        if (start == getLast()) {
            return false;
        }
        return true;
    }

    //获取总页数
    public int getTotalPage() {
        //假设总数是50，能被5整除，那么就有10页。假设总数是51，不能够被5整除，那么还需加1页
        int totalPage = (total % count == 0) ? (total / count) : ((total / count) + 1);
        totalPage = (totalPage == 0) ? 1 : totalPage;
        return totalPage;
    }

    //获取最后一页的开始项
    public int getLast() {
        //假设总数是50，能被5整除，那么最后一页的开始项就是45。假设总数是51，不能够被5整除，那么最后一页的开始项就是50
        int last = (total % count == 0) ? (total - count) : (total - (total % count));
        last = last < 0 ? 0 : last;
        return last;
    }

    @Override
    public String toString() {
        return "Page [start=" + start +
                ", count=" + count +
                ", total=" + total +
                ", getStart()=" + getStart() +
                ", getCount()=" + getCount() +
                ", isHasPrevious()=" + isHasPreviouse() +
                ", isHasNext()=" + isHasNext() +
                ", getTotalPage()=" + getTotalPage() +
                ", getLast()=" + getLast() +
                "]";
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}