public enum DaysOfWeek {

    MONDAY("пон"),
    TUESDAY("вт"),
    WEDNESDAY("ср"),
    THUSDAU("чт"),
    FRIDAY("пт"),
    SATURDAY("сб"),
    SUNDAY("вс");
    String ruName;
    DaysOfWeek(String ruName){
        this.ruName = ruName;
    }
    public String getRuName(){
        return ruName;
    }
//    public String toString(){
//        return "День недели :" + ruName;
//    }
}
