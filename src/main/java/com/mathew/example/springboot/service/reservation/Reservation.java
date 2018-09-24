package com.mathew.example.springboot.service.reservation;

import java.io.Serializable;
import java.util.Date;

public class Reservation implements Serializable{
	
	private long id;
    private long roomId;
    private long guestId;
    private Date reservationDate;

    public Reservation(){
        super();
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public long getGuestId() {
		return guestId;
	}

	public void setGuestId(long guestId) {
		this.guestId = guestId;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", roomId=" + roomId + ", guestId=" + guestId + ", reservationDate="
				+ reservationDate + "]";
	}	
}
