package main_window;

import controllers.MainController;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

public class HelperClass {

       public static final String openRecentTable = "openRecentTable";
       public static final String menuInfoDatabase = "menuInfo.db";
       public static final String sqlMaster = "SELECT name FROM sqlite_master WHERE type='table';";

       //CommandHistoryDatabaseHelper
       public static final String commandHistoryDatabase = "commandHistory.db";
       public static final String commandHistoryTable = "commandHistoryTable";

       public static final String connectedDBHistory = "connectedDBHistory.db";
       public static final String connectedDBHistoryTable = "connectedDBHistoryTable";


       public static final String INSERT = "Insert"+ " operation successful!";
       public static final String DELETE = "Delete"+ " operation successful!";
       public static final String UPDATE = "Update"+ " operation successful!";
       public static final String ALTER= "Alter"+ " operation successful!";
       public static final String CREATE = "Create"+ " operation successful!";
       public static final String DROP = "Drop"+ " operation successful!";
       public static final String SELECT= "Select"+ " operation successful!";
       public static final String[] KEYWORDS = new String[] {
               "SELECT", "select","FROM", "from",
               "WHILE", "while", "INSERT", "insert",
               "UPDATE", "update", "DELETE", "delete",
               "ALTER", "alter", "DROP", "drop",
               "CREATE", "create", "table", "TABLE",
               "COLUMN", "column", "rows", "ROWS", "INTEGER", "integer", "INT", "int",
               "primary", "PRIMARY", "KEY", "key", "TEXT", "text", "NOT", "not", "OR",
               "and", "AND", "INTO", "into", "VALUES", "values"
       };
       private static final String KEYWORD_PATTERN = "\\b(" + String.join("|", HelperClass.KEYWORDS) + ")\\b";
       private static final String PAREN_PATTERN = "\\(|\\)";
       private static final String BRACE_PATTERN = "\\{|\\}";
       private static final String BRACKET_PATTERN = "\\[|\\]";
       private static final String SEMICOLON_PATTERN = "\\;";
       private static final String STRING_PATTERN = "\"([^\"\\\\]|\\\\.)*\"";
       private static final String COMMENT_PATTERN = "//[^\n]*" + "|" + "/\\*(.|\\R)*?\\*/";

       public static final Pattern PATTERN = Pattern.compile(
               "(?<KEYWORD>" + KEYWORD_PATTERN + ")"
                       + "|(?<PAREN>" + PAREN_PATTERN + ")"
                       + "|(?<BRACE>" + BRACE_PATTERN + ")"
                       + "|(?<BRACKET>" + BRACKET_PATTERN + ")"
                       + "|(?<SEMICOLON>" + SEMICOLON_PATTERN + ")"
                       + "|(?<STRING>" + STRING_PATTERN + ")"
                       + "|(?<COMMENT>" + COMMENT_PATTERN + ")"
       );
       //URL url = new File("src/main/java/views/new_splash.fxml").toURI().toURL();
       // URL url = new File("src/main/java/views/new_splash.fxml").toURI().toURL();
       public static URL DIALOG_URL = null;
       public static URL HISTORY_LIST_CELL_URL = null;
       public static URL MAIN_WINDOW_URL = null;
       public static URL NEW_SPLASH_URL = null;
       public static URL TEXT_AREA_NUMBER_URL = null;
       public static URL DATABASE_ICON_URL = null;
       public static URL TABLE_ICON_URL = null;
       public static URL COLUMN_ICON_URL = null;
       public static URL DELETE_ICON_URL = null;
       public static URL FOLDER_OPEN_ICON_URL = null;
       public static URL RUN_CODE_ICON_URL = null;
       public static URL TICK_ICON_URL = null;
       public static URL CROSS_ICON_URL = null;
       public static URL BLACK_THEME_URL = null;
       public static URL  WHITE_THEME_URL = null;
       static {
              //getClass().getClassLoader().getResource("views/new_splash.fxml")
              DIALOG_URL = MainController.class.getClassLoader().getResource("views/dialog.fxml");
              HISTORY_LIST_CELL_URL = MainController.class.getClassLoader().getResource("views/history_list_cell.fxml");
              MAIN_WINDOW_URL = MainController.class.getClassLoader().getResource("views/main_window.fxml");
              NEW_SPLASH_URL = Splash.class.getClassLoader().getResource("views/new_splash.fxml");
              TEXT_AREA_NUMBER_URL = MainController.class.getClassLoader().getResource("views/text_area_number.fxml");
              DATABASE_ICON_URL = MainController.class.getClassLoader().getResource("assets/database.png");
              TABLE_ICON_URL = MainController.class.getClassLoader().getResource("assets/table.png");
              COLUMN_ICON_URL = MainController.class.getClassLoader().getResource("assets/vertical.png");
              DELETE_ICON_URL = MainController.class.getClassLoader().getResource("assets/delete.png");
              FOLDER_OPEN_ICON_URL = MainController.class.getClassLoader().getResource("assets/folder_open.png");
              RUN_CODE_ICON_URL =MainController.class.getClassLoader().getResource("assets/runcode.png");
              TICK_ICON_URL = MainController.class.getClassLoader().getResource("assets/tick.png");
              CROSS_ICON_URL = MainController.class.getClassLoader().getResource("assets/cross.png");
              BLACK_THEME_URL = MainController.class.getClassLoader().getResource("assets/blacktheme.css");
              WHITE_THEME_URL = MainController.class.getClassLoader().getResource("assets/application.css");

       }



       public static String getDB_DRIVER() {
           String DB_DRIVER = "org.sqlite.JDBC";
           return DB_DRIVER;
       }
       public static String getCONN_STRING(File dbName){
           return "jdbc:sqlite:" + "\\" + String.valueOf(dbName);
       }
       public static String getCONN_STRING(String dbName){
           return "jdbc:sqlite:" + dbName;
       }

}
