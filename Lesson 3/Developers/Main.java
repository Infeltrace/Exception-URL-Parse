public class Main {

    public static void main(String[] args) {

        DevList list = new DevList();

        list.addList(new JuniorDeveloper("Dimon",500,0));
        list.addList(new JuniorDeveloper("Vovan", 500, 1));
        list.addList(new MiddleDeveloper("Chelick", 700,3));
        list.addList(new MiddleDeveloper("New Chelik", 700, 4));
        list.addList(new SeniorDeveloper("Petr", 1300, 3));
        list.addList(new SeniorDeveloper("Kolunya", 1200, 4));
        list.addList(new TeamLeadDeveloper("Valera", 3000, 7));

        list.printAll();

    }

    public static void instance(){
        Developer d = new JuniorDeveloper("Pavluha", 700,1);
        if(d instanceof JuniorDeveloper) System.out.println("Junior");
        else if(d instanceof SeniorDeveloper) System.out.println("Senior");
        else System.out.println("TeamLead");
    }
}
