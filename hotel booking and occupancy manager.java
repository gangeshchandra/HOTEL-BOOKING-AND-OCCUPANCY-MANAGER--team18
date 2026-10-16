class Room {
int number;
double price;

double charge(int nights) {
return price * nights;
}
}

class DeluxeRoom extends Room {
@Override
double charge(int nights) {
return price * nights + 500;
}
}

public class HotelBookingManager {
public static void main(String[] args) {

String guest = "Ravi";
int nights = 3;
double price = 2500.50;

double total = price * nights;
boolean canBook = nights > 0;

System.out.println("=== HOTEL BOOKING ===");
System.out.println("Guest: " + guest);
System.out.println("Nights: " + nights);
System.out.println("Can Book: " + canBook);
System.out.println("Base Bill: Rs. " + total);

int discount;

if (nights >= 7)
discount = 20;
else if (nights >= 3)
discount = 5;
else
discount = 0;

double discountAmount = total * discount / 100;
double finalBill = total - discountAmount;

System.out.println("Discount: " + discount + "%");
System.out.println("Discount Amount: Rs. " + discountAmount);
System.out.println("Final Bill: Rs. " + finalBill);

System.out.println("\n=== ROOM CHECK ===");

for (int room = 101; room <= 105; room++) {
if (room == 104)
break;

System.out.println("Checking Room " + room);
}

double[] prices = {2000, 2500, 3000};

System.out.println(" ROOM PRICES ");
for (int i = 0; i < prices.length; i++) {
System.out.println("Room " + (i + 1) + ": Rs. " + prices[i]);
}

System.out.println("Cheapest Room: Rs. " + prices[0]);

Room r1 = new Room();
r1.number = 101;
r1.price = 2000;

Room r2 = new DeluxeRoom();
r2.number = 102;
r2.price = 3000;

System.out.println(" BOOKING CHARGES ");
System.out.println("Normal Room, 2 Nights: Rs. " + r1.charge(2));
System.out.println("Deluxe Room, 2 Nights: Rs. " + r2.charge(2));

String name = " ravi kumar ".trim().toUpperCase();

System.out.println(" GUEST DETAILS ");
System.out.println("Name: " + name);
System.out.println("Length: " + name.length());
System.out.println("Has KUMAR: " + name.contains("KUMAR"));

System.out.println("EXCEPTION HANDLING ");

try {
System.out.println("Room Price: Rs. " + prices[5]);
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Room not found!");
}

System.out.println("Booking completed successfully!");
}
}
