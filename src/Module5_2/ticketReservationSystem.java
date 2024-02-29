package Module5_2;

public class ticketReservationSystem {
    private int availableSeats;

    public ticketReservationSystem(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized boolean bookSeat(int custId, int numberOfSeats){
        if (availableSeats >= numberOfSeats) {
            System.out.println("Customer " + custId + " reserved " + numberOfSeats + " tickets.");
            availableSeats = availableSeats - numberOfSeats;
            return true;
        } else {
            System.out.println("Customer " + custId + " couldn't reserve " + numberOfSeats + " tickets.");
            return false;
        }
    }

    public static void main(String[] args) {
        final ticketReservationSystem ticketReservationSystem = new ticketReservationSystem(20);

        // Määrittele tehtävä, joka suoritetaan erillisessä säikeessä
        // Tämä simuloi asiakasta joka yrittää varata paikan
        Runnable task = () -> {
            int customerId = Integer.parseInt(Thread.currentThread().getName());
            int seatsToReserve = (customerId % 5) + 1; // Simulaatioon miltä väliltä asiakas varaa lippuja
            ticketReservationSystem.bookSeat(customerId, seatsToReserve); // Yrittää varata lippuja
        };

        // Luo ja käynnistää 15 säiettä joista jokainen edustaa asiakasta
        // Jokainen säie suorittaa yllä määritellyn tehtävän
        for (int i = 1; i <= 15; i++) {
            Thread customerThread = new Thread(task, String.valueOf(i));
            customerThread.start();
        }
    }
}