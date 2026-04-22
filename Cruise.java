public class Cruise {
    
    private int passengers;
    private int price;

    public Cruise(int passengers, int price) {
        this.passengers = passengers;
        this.price = price;
    }   

    public void setPrice(int price) {
        this.price = price;
    }

    public void checkResponse(String response) {
        if (response.indexOf("cruise") >= 0) {
            passengers++;
        }
    }

    public int calculateRevenue() {
        if (passengers > 300) {
            price = price - 500;
        }
        else if (passengers >= 200) {
            price = price - 350;
        }
        return passengers * price;
    }

    public static void main(String[] args) {
        Cruise cr = new Cruise(78, 4000);
        
        cr.setPrice(5000);
        cr.checkResponse("world cruise");
        cr.checkResponse("ship trip");
        
        System.out.println(cr.calculateRevenue());

        Cruise cr1 = new Cruise(200, 2000);
        System.out.println(cr1.calculateRevenue());

        Cruise cr2 = new Cruise(397, 6000);
        System.out.println(cr2.calculateRevenue());
    }
}
