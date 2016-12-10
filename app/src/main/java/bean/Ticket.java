package bean;

import java.util.List;

/**
 * Created by Windows 10 on 2016/12/9.
 */

public class Ticket {

    /**
     * ticketId : 1
     * planId : 20161209-070
     * leftSecond : 18
     * totalSecond : 600
     * lastOpenId : 20161209-069
     * lastOpenNum : 9,4,8,3,4
     * openVideoUrl : ["http://video.shishicai.cn/cqssc/"]
     * nextPlanId : 20161209-071
     * nextTotalSecond : 600
     * sale : true
     * lastOrgOpenNum : null
     */

    private int ticketId;
    private String planId;
    private int leftSecond;
    private int totalSecond;
    private String lastOpenId;
    private String lastOpenNum;
    private String nextPlanId;
    private int nextTotalSecond;
    private boolean sale;
    private Object lastOrgOpenNum;
    private List<String> openVideoUrl;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public int getLeftSecond() {
        return leftSecond;
    }

    public void setLeftSecond(int leftSecond) {
        this.leftSecond = leftSecond;
    }

    public int getTotalSecond() {
        return totalSecond;
    }

    public void setTotalSecond(int totalSecond) {
        this.totalSecond = totalSecond;
    }

    public String getLastOpenId() {
        return lastOpenId;
    }

    public void setLastOpenId(String lastOpenId) {
        this.lastOpenId = lastOpenId;
    }

    public String getLastOpenNum() {
        return lastOpenNum;
    }

    public void setLastOpenNum(String lastOpenNum) {
        this.lastOpenNum = lastOpenNum;
    }

    public String getNextPlanId() {
        return nextPlanId;
    }

    public void setNextPlanId(String nextPlanId) {
        this.nextPlanId = nextPlanId;
    }

    public int getNextTotalSecond() {
        return nextTotalSecond;
    }

    public void setNextTotalSecond(int nextTotalSecond) {
        this.nextTotalSecond = nextTotalSecond;
    }

    public boolean isSale() {
        return sale;
    }

    public void setSale(boolean sale) {
        this.sale = sale;
    }

    public Object getLastOrgOpenNum() {
        return lastOrgOpenNum;
    }

    public void setLastOrgOpenNum(Object lastOrgOpenNum) {
        this.lastOrgOpenNum = lastOrgOpenNum;
    }

    public List<String> getOpenVideoUrl() {
        return openVideoUrl;
    }

    public void setOpenVideoUrl(List<String> openVideoUrl) {
        this.openVideoUrl = openVideoUrl;
    }
}
