class EconomyClassTicket implements Ticket{
	private int seatNo;
	private float price;
	private char location;//Aisle,Window,Middle
	private Flight f;
	private boolean booked = false;

	public EconomyClassTicket(Flight f,int seatNo,float price){
		this.f = f;
		this.seatNo = seatNo;
		this.price = price;
		setLocation();
	}


	public void bookTicket(){
		booked = true;
	} 
	
	public Flight getFlight(){
		return f;
	}

	public boolean isAvailable(){
		return booked == false;
	}

	public void setAvailable(){
		booked = false;
	}

	public int getSeatNo(){
		return seatNo;
	}

	public float getPrice(){
		return price;
	}


	private void setLocation(){
		switch( (seatNo-1) % 3){
			case 0 : location = 'W'; break;
			case 1 : location = 'M'; break;
			case 2 : location = 'A'; break;
			default: location = '\0'; 
		}
	}


	public String toString(){
		return " FROM           : " + f.getSource() + "\t\t\t" + "DEPARTURE : " + f.getDeparture() + "\n" +
			   " DESTINATION    : " + f.getDestination() + "\t\t\t" + "ARRIVAL: " + f.getArrival() + "\n\n" +
			   " --------------------------------------------------------------------------------\n\n" +
			   " CLASS          : Economy" + "\n" + 
			   " SEAT NO        : " + seatNo + " " + location + "\n" +
			   " PRICE          : " + price;
	}

}