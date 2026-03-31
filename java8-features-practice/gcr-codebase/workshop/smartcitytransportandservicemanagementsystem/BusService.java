package smartcitytransportandservicemanagementsystem;

class BusService implements TransportService {
	
    private String route; 
    private double fare; 
    private String departure;
    
    public BusService(String r, double f, String d) { 
    	route=r; 
    	fare=f; 
    	departure=d; 
    }
    
    @Override
    public String getName() { 
    	return "Bus"; 
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
