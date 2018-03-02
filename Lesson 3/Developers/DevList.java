import java.util.Arrays;

public class DevList{

    private Developer[] juniorDeveloperList = new JuniorDeveloper[0];
    private int juniorListCount = 0;
    private Developer[] middleDeveloperList = new MiddleDeveloper[0];
    private int middleListCounter = 0;
    private Developer[] seniorDeveloperList = new SeniorDeveloper[0];
    private int seniorListCounter = 0;
    private Developer[] teamLeadDeveloperList = new TeamLeadDeveloper[0];
    private int teamLeadListCounter = 0;
    private Developer[] developerList = new Developer[0];
    private int developerListCount = 0;


    private void distribution(Developer d){

            if (d instanceof JuniorDeveloper){
                addJuniorList((JuniorDeveloper) d);
            }else if(d instanceof MiddleDeveloper){
                addMiddleList((MiddleDeveloper) d);
            }else if(d instanceof SeniorDeveloper){
                addSeniorList((SeniorDeveloper) d);
            }else if(d instanceof TeamLeadDeveloper){
                addTeamLeadList((TeamLeadDeveloper) d);
            }else System.out.println("Не ну вдруг там как-то что-то залетит :)");
    }

    private void addJuniorList(JuniorDeveloper jdvp){
        if(juniorListCount > juniorDeveloperList.length -1) {
            juniorDeveloperList = Arrays.copyOf(juniorDeveloperList, juniorDeveloperList.length + 1);
            juniorDeveloperList[juniorListCount] = jdvp;
            juniorListCount++;
        } else  juniorDeveloperList[juniorListCount++] = jdvp;
    }

    private void addMiddleList(MiddleDeveloper mdvp){
        if(middleListCounter > middleDeveloperList.length -1){
            middleDeveloperList = Arrays.copyOf(middleDeveloperList, middleDeveloperList.length +1);
            middleDeveloperList[middleListCounter] = mdvp;
            middleListCounter++;
        }else middleDeveloperList[middleListCounter++] = mdvp;
    }

    private void addSeniorList(SeniorDeveloper sdvp){
        if(seniorListCounter > seniorDeveloperList.length -1){
            seniorDeveloperList = Arrays.copyOf(seniorDeveloperList,seniorDeveloperList.length +1);
            seniorDeveloperList[seniorListCounter] = sdvp;
            seniorListCounter++;
        }else seniorDeveloperList[seniorListCounter++] = sdvp;
    }

    private void addTeamLeadList(TeamLeadDeveloper tldvp){
        if(teamLeadListCounter > teamLeadDeveloperList.length -1){
            teamLeadDeveloperList = Arrays.copyOf(teamLeadDeveloperList,teamLeadDeveloperList.length +1);
            teamLeadDeveloperList[teamLeadListCounter] = tldvp;
            teamLeadListCounter++;
        }else teamLeadDeveloperList[teamLeadListCounter++] = tldvp;
    }

    public void addList(Developer dvplst){
        if(developerListCount > developerList.length -1){
            developerList = Arrays.copyOf(developerList,developerList.length +1);
            developerList[developerListCount] = dvplst;
            developerListCount++;
            distribution(dvplst);
        }else developerList[developerListCount++] = dvplst;
    }

    public void printAll(){
        StringBuilder sb;
        for(Developer d: developerList){
            sb = new StringBuilder()
                    .append(d.getName())
                    .append(":")
                    .append(d.getBasicSalary())
                    .append("->")
                    .append(d.getSalary());
            System.out.println(sb.toString());
        }
    }

    public void getSenior(){
        for(Developer d: developerList){
            if(d.getSalary() > 1500 && d instanceof SeniorDeveloper){
                printDeveloper(d);
            }
        }
    }

    private void printDeveloper(Developer dvl){
        StringBuilder sb;
        sb = new StringBuilder()
                .append(dvl.getName())
                .append(":")
                .append(dvl.getBasicSalary())
                .append("->")
                .append(dvl.getSalary());
        System.out.println(sb.toString());
    }
}
