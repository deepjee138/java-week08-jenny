package methodoverriding2;

public class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i=new ICICI();
        AXIS a= new AXIS();
        System.out.println("SBI rate of Interest:"+s.getRatOfInterest());
        System.out.println("ICICI rate of Interest:"+i.getRatOfInterest());
        System.out.println("AXIS rate of Interest:"+a.getRatOfInterest());

    }
}
