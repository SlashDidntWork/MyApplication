package bean;

import java.util.List;

/**
 * Created by Windows 10 on 2016/12/9.
 */

public class Root {


    /**
     * lastDayUserBetTotalResult : null
     * lastDayThreeTop : [{"userId":815,"bet":6025000000,"rank":1,"username":"owen"},{"userId":762,"bet":1062460000,"rank":2,"username":"v19011"},{"userId":769,"bet":380200000,"rank":3,"username":"will010101"}]
     * todayRankAndBetTotal : [{"userId":707,"betTotal":5924000000,"rank":1,"level":6,"username":"sidney1"},{"userId":887,"betTotal":680060000,"rank":2,"level":0,"username":"will01010101"},{"userId":517,"betTotal":401900000,"rank":3,"level":6,"username":"ivan"},{"userId":815,"betTotal":200000000,"rank":4,"level":6,"username":"owen"},{"userId":769,"betTotal":120000000,"rank":5,"level":0,"username":"will010101"},{"userId":819,"betTotal":60000000,"rank":6,"level":0,"username":"testzii"},{"userId":892,"betTotal":20000000,"rank":7,"level":0,"username":"fdsafaff"}]
     * todayUserRank : null
     * activityId : 30
     * getBonusStatus : 3
     * first : true
     */

    private Object lastDayUserBetTotalResult;
    private Object todayUserRank;
    private int activityId;
    private int getBonusStatus;
    private boolean first;
    private List<LastDayThreeTopBean> lastDayThreeTop;
    private List<TodayRankAndBetTotalBean> todayRankAndBetTotal;

    public Object getLastDayUserBetTotalResult() {
        return lastDayUserBetTotalResult;
    }

    public void setLastDayUserBetTotalResult(Object lastDayUserBetTotalResult) {
        this.lastDayUserBetTotalResult = lastDayUserBetTotalResult;
    }

    public Object getTodayUserRank() {
        return todayUserRank;
    }

    public void setTodayUserRank(Object todayUserRank) {
        this.todayUserRank = todayUserRank;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getGetBonusStatus() {
        return getBonusStatus;
    }

    public void setGetBonusStatus(int getBonusStatus) {
        this.getBonusStatus = getBonusStatus;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public List<LastDayThreeTopBean> getLastDayThreeTop() {
        return lastDayThreeTop;
    }

    public void setLastDayThreeTop(List<LastDayThreeTopBean> lastDayThreeTop) {
        this.lastDayThreeTop = lastDayThreeTop;
    }

    public List<TodayRankAndBetTotalBean> getTodayRankAndBetTotal() {
        return todayRankAndBetTotal;
    }

    public void setTodayRankAndBetTotal(List<TodayRankAndBetTotalBean> todayRankAndBetTotal) {
        this.todayRankAndBetTotal = todayRankAndBetTotal;
    }

    public static class LastDayThreeTopBean {
        /**
         * userId : 815
         * bet : 6025000000
         * rank : 1
         * username : owen
         */

        private int userId;
        private long bet;
        private int rank;
        private String username;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public long getBet() {
            return bet;
        }

        public void setBet(long bet) {
            this.bet = bet;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }
    public static class TodayRankAndBetTotalBean {
        /**
         * userId : 707
         * betTotal : 5924000000
         * rank : 1
         * level : 6
         * username : sidney1
         */

        private int userId;
        private long betTotal;
        private int rank;
        private int level;
        private String username;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public long getBetTotal() {
            return betTotal;
        }

        public void setBetTotal(long betTotal) {
            this.betTotal = betTotal;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }
}
