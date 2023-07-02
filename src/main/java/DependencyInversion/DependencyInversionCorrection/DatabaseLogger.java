package DependencyInversion.DependencyInversionCorrection;

public class DatabaseLogger implements ILogger{
    @Override
    public void log(String message) {
        //write data to database
    }
}
