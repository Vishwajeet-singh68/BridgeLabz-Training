package streamapi;

import java.util.*;
import java.util.stream.Collectors;

class Claim {
    int claimId;
    String claimType;
    double claimAmount;

    public Claim(int claimId, String claimType, double claimAmount) {
        this.claimId = claimId;
        this.claimType = claimType;
        this.claimAmount = claimAmount;
    }
}

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = new ArrayList<>();

        claims.add(new Claim(101, "Health", 45000));
        claims.add(new Claim(102, "Vehicle", 120000));
        claims.add(new Claim(103, "Health", 30000));
        claims.add(new Claim(104, "Life", 250000));
        claims.add(new Claim(105, "Vehicle", 85000));
        claims.add(new Claim(106, "Property", 175000));
        claims.add(new Claim(107, "Life", 300000));
        claims.add(new Claim(108, "Health", 52000));
        claims.add(new Claim(109, "Property", 95000));
        claims.add(new Claim(110, "Vehicle", 60000));

        Map<String, Double> groupedCollection = claims.stream().collect(Collectors.groupingBy(c->c.claimType, Collectors.averagingDouble(c->c.claimAmount)));
        
        
        for(String s:groupedCollection.keySet()) {
        	System.out.println(s+" : "+groupedCollection.get(s));
        }
    }
}
