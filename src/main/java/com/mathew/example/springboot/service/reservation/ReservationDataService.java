package com.mathew.example.springboot.service.reservation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ReservationDataService implements ApplicationListener<ApplicationReadyEvent>{
	
	private static final int COUNT = 50;
	private static Map<Long, Reservation> reservationData = new HashMap<Long, Reservation>();
	
	private void populateData() {
		for (int ii = 1; ii <= COUNT; ii++) {
			
			Reservation res = new Reservation();
			res.setId(ii);
			res.setGuestId(ii);
			res.setRoomId(ii);
			String dateStr1 = "2018-09-";
			int mod = (ii % 10)+1;
			dateStr1 = dateStr1+mod;
			res.setReservationDate(DateTimeUtils.createDateFromDateString(dateStr1));
			reservationData.put(new Long(ii), res);
		}
	}
	
	public static void main(String[] args) {
		new ReservationDataService().populateData();
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		populateData();
		
	}

}
