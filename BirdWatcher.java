
class BirdWatcher {

    int[] birdsPerDay = {2, 5, 0, 7, 4, 1};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
    }

    public int[] getLastWeek() {

        return birdsPerDay;

//        int[] lastWeeksCounts = {0, 2, 5, 3, 7, 8, 4};
//        return lastWeeksCounts;
    }

    public int getToday() {

        int today = birdsPerDay[5];
        return today;
//        int[] weekCount = getLastWeek();
        //        int today = weekCount[5];
        //        return today;
    }

    public void incrementTodaysCount() {

        int today = birdsPerDay[5] + 1;

//        int[] weekCount = getLastWeek();
//        int incrementToday = weekCount[5] + 1;
    }

    public boolean hasDayWithoutBirds() {

//        boolean DayWithoutBirds = true;
//        for (int i = 0; i < birdsPerDay.length; i++) {
//            switch (i) {
//                case 0:
//                    DayWithoutBirds = true;
//                    break;
//                default:
//                    DayWithoutBirds = false;
//            }
//        }
//        return DayWithoutBirds;
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
    }

}
