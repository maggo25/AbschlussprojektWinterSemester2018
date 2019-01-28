import java.util.ArrayList;
import java.util.List;

public interface DAO {

    public LoggerEntry getLogEntry(int id);

    public List<LoggerEntry> getAllLogEvents();

    public void createLogEntry(LoggerEntry loggerEntry);

    public void updateLogEntry(LoggerEntry loggerEntry);

    public void deleteLogEntry(int id);


}
