public class HotelSimple {

    // Method (CO3): returns total bill
    static double calculateBill(double price, int nights) {
        return price * nights;
    }

    public static void main(String[] args) {

        // CO1: variables, constants, literals, operators
        final double GST = 0.12;
        String hotelName = "Grand Stay";
        int roomNumber = 101;
        double price = 2500;
        int nights = 3;
        boolean available = true;

        double bill = calculateBill(price, nights);
        bill = bill + (bill * GST);

        System.out.println(hotelName + " - Room " + roomNumber);
        System.out.println("Total Bill: " + bill);

        // CO2: if-else
        if (available) {
            System.out.println("Room is available");
        } else {
            System.out.println("Room is booked");
        }

        // CO3: array + loop (sum, average, count)
        double[] roomPrices = {2000, 2500, 3000, 3500};
        double total = 0;
        int count = 0;

        for (int i = 0; i < roomPrices.length; i++) {
            total += roomPrices[i];
            if (roomPrices[i] > 2500) {
                count++;
            }
        }

        System.out.println("Total: " + total);
        System.out.println("Average: " + (total / roomPrices.length));
        System.out.println("Rooms above 2500: " + count);
    }
}



//OUTPUT
//Grand Stay - Room 101
//Total Bill: 8400.0
//Room is available
//Total: 11000.0
//Average: 2750.0
//Rooms above 2500: 2
