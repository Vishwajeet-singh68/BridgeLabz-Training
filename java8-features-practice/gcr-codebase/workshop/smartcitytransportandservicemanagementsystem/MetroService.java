package smartcitytransportandservicemanagementsystem;

class MetroService implements TransportService {
	
    private String route; 
    private double fare; 
    private String departure;
    
    public MetroService(String r, double f, String d) { 
    	route=r; 
    	fare=f; 
    	departure=d; 
    }
    
    @Override
    public String getName() { 
    	return "Metro"; 
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
