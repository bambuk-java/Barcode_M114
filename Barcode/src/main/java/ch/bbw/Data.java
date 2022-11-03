package ch.bbw;



public class Data {
    private char day1;
    private char day2;
    private char month1;
    private char month2;
    private char year1;
    private char year2;
    private int Id;
    private int Produkt;

    public Data (){}





    public char getDay1() {
        return day1;
    }

    public void setDay1(String date) {
        String day = date.substring(0,2);
        String abc="ABCDEFGHIJKLMNOPQRSTUVWXYZ+=*%&";
        char char1 = abc.charAt(Integer.parseInt(day)-1);
        this.day1 = char1;



    }

    public char getDay2() {
        return day2;
    }

    public void setDay2(String date) {
        String day = date.substring(0,2);
        String abc="ABCDEFGHIJKLMNOPQRSTUVWXYZ+=*%&";
        char char1 = abc.charAt(Integer.parseInt(day)-1);
        this.day2 = char1;
    }

    public char getMonth1() {
        return month1;
    }

    public void setMonth1(String date) {

        String month = date.substring(2,4);
        String abc="ABCDEFGHIJKL";
        char char1 = abc.charAt(Integer.parseInt(month)-1);
        this.month1 = char1;
    }

    public char getMonth2() {
        return month2;
    }

    public void setMonth2(String date) {
        String month = date.substring(2,4);
        String abc="ABCDEFGHIJKL";
        char char1 = abc.charAt(Integer.parseInt(month)-1);
        this.month2 = char1;
    }

    public char getYear1() {
        return year1;
    }

    public void setYear1(String date) {
        String year = date.substring(4,6);
        String abc="ABCDEFGHIJKLMNOPQRSTUVWXYZ+=*%&";
        char char1 = abc.charAt(Integer.parseInt(year)-1);
        this.year1 = char1;
    }

    public char getYear2() {
        return year2;
    }

    public void setYear2(String date) {
        String year = date.substring(4,6);
        String abc="ABCDEFGHIJKLMNOPQRSTUVWXYZ+=*%&";
        char char1 = abc.charAt(Integer.parseInt(year)-1);
        this.year2 = char1;
    }

    public int getId() {
        return Id;
    }


    public void setId (int intid) {
        this.Id = intid;
        intid ++;

    }
    public int getProdukt(){
        return Produkt;
    }

    public void setProdukt(int l){

        this.Produkt = l;

    }

    @Override
    public String toString() {
        return "Data{" +
                "day1=" + day1 +
                ", day2=" + day2 +
                ", month1=" + month1 +
                ", month2=" + month2 +
                ", year1=" + year1 +
                ", year2=" + year2 +
                ", Id=" + Id +
                ", Produkt=" + Produkt +
                '}';
    }


}
