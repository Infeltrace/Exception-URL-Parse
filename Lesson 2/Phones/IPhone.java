public class IPhone extends Phone {

    public IPhone(){
        touch = true;
        hasWiFi = true;
        screenSize = 3;
        name = "iPhone";
        sim = new SimCard(this);
    }

}
