// Hotel Booking - short code (CO1 to CO6)
class Room {                                     // CO4: class
    int number;
    double price;
    double charge(int nights) {                  // CO3: return value
        return price * nights;
    }
}

class DeluxeRoom extends Room {
    double charge(int nights) {                  // CO4: method overriding
        return price * nights + 500;
    }
}

public class HotelBookingManager {
    public static void main(String[] args) {
        // CO1: datatypes, variables, arithmetic and relational operators
        String guest = "Ravi";
        int nights = 3;
        double price = 2500.50;
        double total = price * nights;
        boolean canBook = nights > 0;
        System.out.println(guest + " can book: " + canBook + ", bill: " + total);
        // CO2: if-else ladder
        int discount;
        if (nights >= 7) discount = 20;
        else if (nights >= 3) discount = 5;
        else discount = 0;
        System.out.println("Discount: " + discount + "%");
        // CO2: for loop with break
        for (int room = 101; room <= 105; room++) {
            if (room == 104) break;
            System.out.println("Checking room " + room);
        }
        // CO3: 1D array
        double[] prices = {2000, 2500, 3000};
        System.out.println("Cheapest room: Rs. " + prices[0]);
        // CO4: class and object, method overriding
        Room r1 = new Room();
        r1.price = 2000;
        Room r2 = new DeluxeRoom();
        r2.price = 3000;
        System.out.println("Normal room, 2 nights: " + r1.charge(2));
        System.out.println("Deluxe room, 2 nights: " + r2.charge(2));
        // CO5: string methods
        String name = "  ravi kumar ".trim().toUpperCase();
        System.out.println(name + ", length " + name.length());
        System.out.println("Has KUMAR: " + name.contains("KUMAR"));
        // CO6: exception handling
        try {
            System.out.println(prices[5]);
        } catch (Exception e) {
            System.out.println("Room not found");
        }
    }
}
