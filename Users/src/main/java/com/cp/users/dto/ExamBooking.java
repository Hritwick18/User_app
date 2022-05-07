package com.cp.users.dto;

import java.time.LocalDate;


/**
 * DTO class of Exam Booking It keeps details of all booking made by different
 * users
 * 
 */

public class ExamBooking {

//	variables
	private int bookingId;
	private int userId;
	private String examName;
	private int examVoucherNumber;
	private LocalDate examBookingDate = LocalDate.now();
	private boolean bookingStatus = true;

	// Default constructor
	public ExamBooking() {
		super();
	}

	// field constructor
	public ExamBooking(int userId, String examName, int examVoucherNumber) {
		super();
		this.userId = userId;
		this.examName = examName;
		this.examVoucherNumber = examVoucherNumber;
	}
	
	// getters and setters
	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getExamId() {
		return examName;
	}

	public void setExamId(String examName) {
		this.examName = examName;
	}

	public int getExamVoucherNumber() {
		return examVoucherNumber;
	}

	public void setExamVoucherNumber(int examVoucherNumber) {
		this.examVoucherNumber = examVoucherNumber;
	}

	public LocalDate getExamBookingDate() {
		return examBookingDate;
	}

	public void setExamBookingDate(LocalDate examBookingDate) {
		this.examBookingDate = examBookingDate;
	}

	public boolean isBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	// Overriding toString method
	@Override
	public String toString() {
		return "ExamBooking [bookingId=" + bookingId + ", userId=" + userId + ", examName=" + examName
				+ ", examVoucherNumber=" + examVoucherNumber + ", examBookingDate=" + examBookingDate
				+ ", bookingStatus=" + bookingStatus + "]";
	}

}
