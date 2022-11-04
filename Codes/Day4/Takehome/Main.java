package Day4.Takehome;

public class Main {
    public static void main(String[] args) {
        Bowler b1 = new Bowler();
        b1.name = "Sachin";
        b1.wickets = 10;
        b1.matches = 5;
        b1.balls_bowled = 750;
        b1.runs_conceded = 463;
        b1.computeBowlingAverage();
        b1.computeStrikeRate();
        b1.showstastics();

        Bowler b2 = new Bowler("Nikhil",67,15,1987,500);
        System.out.println();
        b2.computeBowlingAverage();
        b2.computeStrikeRate();
        b2.showstastics();
    }
}

class Bowler{
    String name;
    int wickets;
    int matches;
    int balls_bowled;
    int runs_conceded;

    public Bowler() {

    }

    public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    public void computeBowlingAverage(){
        if ((runs_conceded<=0||balls_bowled<=0)&&matches<=0){
            System.out.println("Error");
        } else if (wickets<0||matches<0||balls_bowled<0||runs_conceded<0) {
            System.out.println("Error");
        } else {
            float res = (float)runs_conceded/wickets;
            System.out.println(res);
        }

    }

    public void showstastics(){
        if ((runs_conceded<=0||balls_bowled<=0)&&matches<=0){
            System.out.println("Error");
        } else if (wickets<0||matches<0||balls_bowled<0||runs_conceded<0){
            System.out.println("Error");
        } else {
            System.out.println("name = "+name+",");
            System.out.println("wickets = "+wickets+",");
            System.out.println("matches = "+matches+",");
            System.out.println("balls_bowled = "+balls_bowled+",");
            System.out.println("runs_conceded = "+runs_conceded+",");
        }
    }
    public void computeStrikeRate(){
        if ((runs_conceded<=0||balls_bowled<=0)&&matches<=0){
            System.out.println("Error");
        } else if (wickets<0||matches<0||balls_bowled<0||runs_conceded<0){
            System.out.println("Error");
        } else {
            float res = (float) runs_conceded/balls_bowled;
            System.out.println(res);
        }
    }
}