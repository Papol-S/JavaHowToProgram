package Lesson8.Exercise8_17;

public class Player {
    private String name = " ";
    private enum PlayerPriority {FIRST,SECOND};
    public PlayerPriority playerPriority;

    public Player(String name) {
        setPlayer(name);
    }

    public void setPlayer (String name) {
        this.name = name;
    }
    public void setPlayerPriority (int priority) {
        if (priority == 0) {
            playerPriority = PlayerPriority.FIRST;
        }
        else
            playerPriority = PlayerPriority.SECOND;
    }

    public PlayerPriority getPlayerPriority() {
        return playerPriority;
    }
}
