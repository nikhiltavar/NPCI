package Day5.Takehome;

public class Testing {

    public static void main(String[] args) {
        Sports sports = new Sports();
        System.out.println(sports.getName());
        System.out.println(sports.getNumberOfTeamMembers());
        System.out.println();

        Sports soccer = new Soccer();
        System.out.println("The name of the sport is: " + soccer.getName());
        System.out.println(soccer.getNumberOfTeamMembers());

    }

}

class Sports{

    public String getName(){
        return "Sports";
    }

    public String getNumberOfTeamMembers(){
        return "Each team has n players in Sports";
    }
}

class Soccer extends Sports{

    @Override
    public String getName(){
        return "Soccer";
    }

    @Override
    public String getNumberOfTeamMembers(){
        return "In " + getName()+ ", each team has 11 players.";
    }
}