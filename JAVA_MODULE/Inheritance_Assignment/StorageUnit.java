class StorageUnit{
    double capacity;
    String location;

    StorageUnit(){// Default constructor
        this.capacity=5000.0;
        this.location="Default Location";
    }

    StorageUnit(double capacity,String location){ // parameterized constructor
        this.capacity=capacity;
        this.location=location;
    }

    double getCapacity(){
        return capacity;
    }

    void setCapacity(double capacity){
        this.capacity=capacity;
    }

    String getLocation(){
        return location;
    }

    void setLocation(String location){
        this.location=location;
    }

    void display(){
        System.out.println("Capacity:"+this.capacity);
        System.out.println("Location:"+this.location);
    }
}// storageUnit class ends here

class ColdStorage extends StorageUnit{
    double temperature;

    ColdStorage(){ // Default  constructor
        super();
        this.temperature=-5.0;
    }

    ColdStorage(double capacity,String location,double temperature){ // parameterized constructor
        super(capacity,location);
        this.temperature=temperature;
    }

    double getTemperature(){
        return temperature;
    }

    void setTemperature(double temperature){
        this.temperature=temperature;
    }

    void display(){
        super.display();
        System.out.println("Temperature:"+this.temperature);
    }
}// cold Storage class ends here

class GrainWarehouse extends StorageUnit{
    String grainType;

    GrainWarehouse(){ // Default constructor
        super();
        this.grainType="Wheat";
    }

    GrainWarehouse(double capacity,String location,String grainType){ // parameterized constructor
        super(capacity,location);
        this.grainType=grainType;
    }

    String getGrainType(){
        return grainType;
    }

    void setGrainType(String grainType){
        this.grainType=grainType;
    }

    void display(){
        super.display();
        System.out.println("Grain Type:"+this.grainType);
    }
}// GrainWarehouse class ends here

class SeedStorage extends StorageUnit{
    int seedBags;

    SeedStorage(){ // Default constructor
        super();
        this.seedBags=100;
    }

    SeedStorage(double capacity,String location,int seedBags){  // parameterized constructor
        super(capacity,location);
        this.seedBags=seedBags;
    }

    int getSeedBags(){
        return seedBags;
    }

    void setSeedBags(int seedBags){
        this.seedBags=seedBags;
    }

    void display(){
        super.display();
        System.out.println("Number of Seed Bags:"+this.seedBags);
    }
}// SeedStorage class  here


class RegisterStorage{
    public static void main(String[] args){
        ColdStorage c1=new ColdStorage();
        c1.display();
        System.out.println("\n\n");
        
        
        ColdStorage c2=new ColdStorage(8000.0,"Pune",-10.5);
        c2.display();
        System.out.println("\n\n");
        
        
        GrainWarehouse g1=new GrainWarehouse();
        g1.display();
        System.out.println("\n\n");
        
        GrainWarehouse g2=new GrainWarehouse(10000.0,"Nashik","Rice");
        g2.display();
        System.out.println("\n\n");
        
        SeedStorage s1=new SeedStorage();
        s1.display();
        System.out.println("\n\n");
        
        SeedStorage s2=new SeedStorage(3000.0,"Nagpur",250);
        s2.display();
    }
}
