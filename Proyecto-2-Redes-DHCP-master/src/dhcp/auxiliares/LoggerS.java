package auxiliares;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Esta clase implementa el logger para el servidor DHCP
 *
 * @author 
 * @version 1.0
 */
public class LoggerS
{

    private static Logger logger = Logger.getLogger("MyLog");

    private static File log4jfile = new File("C:\\Users\\camil\\OneDrive - Pontificia Universidad Javeriana\\UNIVERSIDAD\\TERCER SEMESTRE\\COMUNICACIONES Y REDES\\PROYECTO\\-Redes-DHCP-master\\Proyecto-2-Redes-DHCP-master\\src\\dhcp\\archivos\\log.log");

    /**
     * @param mensaje
     */
    public static void mensaje(String mensaje)
    {
        try
        {
            FileHandler fh = new FileHandler(log4jfile.getAbsolutePath(), true);
            logger.addHandler(fh);

            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            logger.info("\n" + mensaje);

            fh.close();

        }
        catch (SecurityException | IOException e)
        {
            e.printStackTrace();
        }
    }
}