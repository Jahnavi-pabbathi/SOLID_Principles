package DependencyInversion;

public class DataAccessLayer {
    public void AddCustomer(String name){
        //High level class (DataAccessLayer) shd not depend on LowLevel class FileLogger
        //if we want to replace file logging to database logging we have to instantiate other class
        //to overcome this we use dependency inversion
        FileLogger logger = new FileLogger();
        logger.log("customer added : "+name);
    }
}
