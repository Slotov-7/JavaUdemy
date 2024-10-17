package excecao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Reservation {
    private final Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkin, Date checkout){
        if(!checkout.after(checkin)) {
            throw new ReservationExcepition("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public long duration(){
        long diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    public void updateDates(Date checkin, Date checkout) {

        Date now = new Date();
        if(checkin.before(now) || checkout.before(now)){
            throw new ReservationExcepition("Reservation dates for update must be future dates ");
        }
        if(!checkout.after(checkin)) {
            throw new ReservationExcepition("Check-out date must be after check-in date");
        }
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber +
                ", check-in : " + simpleDateFormat.format(checkin) +
                ", check-out" + simpleDateFormat.format(checkout) + ", "
                + duration() + "Nigths";
    }
}
