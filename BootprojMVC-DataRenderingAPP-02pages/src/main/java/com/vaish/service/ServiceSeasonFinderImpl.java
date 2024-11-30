package com.vaish.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class ServiceSeasonFinderImpl implements ISeasonFinder {

	@Override
	public String findSeason() {
		LocalDate ld= LocalDate.now();
		int month=ld.getMonthValue();
		
		if(month >3 && month <5) {
			return "summer season";
		}
			else if(month > 6 && month <9) {
				return "RainySeason";
			}
				else
					return "Winter Season";
			}
}
