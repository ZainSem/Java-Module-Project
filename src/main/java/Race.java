public class Race {

    String winner = "";
    int range = 0;

    public String race(int speed, String name){
        int currentRange = 24 * speed;
        if(currentRange > range){
            range = currentRange;
            winner = name;
        }
        return winner;
    }

}
