package DependencyInversion.DependencyInversionCorrection;

public class DataAccessLayer {
    private ILogger logger;
    public DataAccessLayer(ILogger logger){
        this.logger=logger;
    }
    public void AddCustomer(String name){
        logger.log("customer added: "+name);
    }
}
