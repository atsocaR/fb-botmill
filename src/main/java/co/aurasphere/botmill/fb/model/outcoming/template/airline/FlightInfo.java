/*
 * MIT License
 *
 * Copyright (c) 2016 BotMill.io
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package co.aurasphere.botmill.fb.model.outcoming.template.airline;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.google.gson.annotations.SerializedName;

/**
 * The Class FlightInfo.
 */
public class FlightInfo implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The flight number. */
	@NotBlank
	@SerializedName("flight_number")
	private String flightNumber;

	/** The departure airport. */
	@Valid
	@NotNull
	@SerializedName("departure_airport")
	private Airport departureAirport;

	/** The arrival airport. */
	@Valid
	@NotNull
	@SerializedName("arrival_airport")
	private Airport arrivalAirport;

	/** The flight schedule. */
	@Valid
	@NotNull
	@SerializedName("flight_schedule")
	private FlightSchedule flightSchedule;

	/**
	 * Instantiates a new flight info.
	 *
	 * @param flightNumber
	 *            the flight number
	 */
	public FlightInfo(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * Gets the flight number.
	 *
	 * @return the flight number
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * Sets the flight number.
	 *
	 * @param flightNumber
	 *            the new flight number
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * Gets the departure airport.
	 *
	 * @return the departure airport
	 */
	public Airport getDepartureAirport() {
		return departureAirport;
	}

	/**
	 * Sets the departure airport.
	 *
	 * @param departureAirport
	 *            the new departure airport
	 */
	public void setDepartureAirport(Airport departureAirport) {
		this.departureAirport = departureAirport;
	}

	/**
	 * Gets the arrival airport.
	 *
	 * @return the arrival airport
	 */
	public Airport getArrivalAirport() {
		return arrivalAirport;
	}

	/**
	 * Sets the arrival airport.
	 *
	 * @param arrivalAirport
	 *            the new arrival airport
	 */
	public void setArrivalAirport(Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	/**
	 * Gets the flight schedule.
	 *
	 * @return the flight schedule
	 */
	public FlightSchedule getFlightSchedule() {
		return flightSchedule;
	}

	/**
	 * Sets the flight schedule.
	 *
	 * @param flightSchedule
	 *            the new flight schedule
	 */
	public void setFlightSchedule(FlightSchedule flightSchedule) {
		this.flightSchedule = flightSchedule;
	}

}
