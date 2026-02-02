package smartcitytransportandservicemanagementsystem;

class TaxiService implements TransportService {
	
    private String route; 
    private double fare; 
    private String departure;
    
    public TaxiService(String r, double f, String d) { 
    	route=r; 
    	fare=f; 
    	departure=d; 
    }
    
    @Override
    public String getName() { 
    	return "Taxi"; 
    }
    @Override
    public double getFare() { 
    	return fare; 
    }
    @Override
    public String getRoute() { 
    	return route; 
    }
    @Override
    public String getDepartureTime() { 
    	return departure; 
    }
}
