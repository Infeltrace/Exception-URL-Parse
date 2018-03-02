public class SamsungS4 extends Phone {

    public SamsungS4(){
        touch = true;
        hasWiFi = true;
        screenSize = 5;
        name = "SamsungS4";
        sim = new SimCard(this);
    }

}
