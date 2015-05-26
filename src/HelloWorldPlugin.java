/**
 * Created by jessi on 12.05.2015.
 */

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorldPlugin extends JavaPlugin
{
    public static Logger log = Logger.getLogger("Minecraft");

    public void OnLoad()
    {
        log.info("[HelloWorldPlugin] Loaded...");
    }

    public void OnEnable()
    {
        log.info("[HelloWorldPlugin] Starting up...");
    }

    public void OnDisable()
    {
        log.info("[HelloWorldPlugin] Shutting down...");
    }
}
