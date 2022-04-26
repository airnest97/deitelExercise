package classwork;

public enum People {
    WORM("Amaka"),
    DEJI(),
    BUNMI("Love", "Wale");
    private String[] boyFriendName;

    People (String name){
        boyFriendName = new String[1];
        boyFriendName[0] = name;
    }

    People(String... names){
        boyFriendName = names;
    }

    public String[] getBoyFriendName() {
        return boyFriendName;
    }

    public void greetBoyFriend(){
        for (String boyFriend:
             boyFriendName) {
            System.out.println("Hello " + boyFriend);
        }
    }

    public String toString(){
        return switch (this) {
            case DEJI -> "DEJI";
            case WORM -> "Worm";
            case BUNMI -> "King Bumi";
            default -> null;
        };
    }
}
