package classwork;

public enum Region {
    NE("Ajegunle", "Ikeja", "Abuja"),
    SE("VI", "BI", "IK"),
    SW("Mushin", "Ketu", "Okoko", "Ipaja"),
    NC("Ibadan", "Ekiti", "Ijebu"),
    SS("Sabo", "Bariga", "Somolu"),
    NW("Challenge", "Molete", "Mowe");

    private String[] states;

    Region(String... states){
        this.states = states;
    }
}
