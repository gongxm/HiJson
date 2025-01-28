/*
 * MainApp.java
 */

package hi.chyl.json;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

import java.awt.*;
import javax.swing.UIManager;

/**
 * The main class of the application.
 */
public class MainApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override
    protected void startup() {
        if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            try {
                // 使用Mac系统菜单栏
                System.setProperty("apple.laf.useScreenMenuBar", "true");
                // 设置Mac下的应用名称
                System.setProperty("apple.awt.application.name", "HiJson");
                // 使用Mac系统默认Look and Feel
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        show(new MainView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override
    protected void configureWindow(Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     *
     * @return the instance of MainApp
     */
    public static MainApp getApplication() {
        return Application.getInstance(MainApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(MainApp.class, args);
    }
}
