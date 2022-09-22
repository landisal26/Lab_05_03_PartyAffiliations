public class Main {
    public static void main(String[] args)
    {

        String party = "R";


        System.out.println("What is your political affilitation? ");


        if (party.equals("R"))
        {
            System.out.println("You get an Elephant");
        }

        if (party.equals("D"))
        {
            System.out.println("You get an Donkey");
        }
        if (party.equals("I"))
        {
            System.out.println("You Get the Human");
        }
        else
        {
            System.out.println("You selected other");
        }
    }
}