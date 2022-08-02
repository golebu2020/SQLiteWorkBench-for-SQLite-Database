package main_window;

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
       public static URL RUN_CODE_CELL_URL = null;
       public static URL TEXT_AREA_NUMBER_URL = null;
       public static URL APP_ICON_URL = null;
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
              try {
                     DIALOG_URL = new File("src/main/java/views/dialog.fxml").toURI().toURL();
                     HISTORY_LIST_CELL_URL = new File("src/main/java/views/history_list_cell.fxml").toURI().toURL();
                     MAIN_WINDOW_URL = new File("src/main/java/views/main_window.fxml").toURI().toURL();
                     NEW_SPLASH_URL = new File("src/main/java/views/new_splash.fxml").toURI().toURL();
                     RUN_CODE_CELL_URL = new File("src/main/java/views/run_code_cell.fxml").toURI().toURL();
                     TEXT_AREA_NUMBER_URL = new File("src/main/java/views/text_area_number.fxml").toURI().toURL();
                     APP_ICON_URL = new File("src/main/java/resources/app_icon.PNG").toURI().toURL();
                     DATABASE_ICON_URL = new File("src/main/java/resources/database.png").toURI().toURL();
                     TABLE_ICON_URL = new File("src/main/java/resources/table.png").toURI().toURL();
                     COLUMN_ICON_URL = new File("src/main/java/resources/vertical.png").toURI().toURL();
                     DELETE_ICON_URL = new File("src/main/java/resources/delete.png").toURI().toURL();
                     FOLDER_OPEN_ICON_URL = new File("src/main/java/resources/folder_open.png").toURI().toURL();
                     RUN_CODE_ICON_URL = new File("src/main/java/resources/runcode.png").toURI().toURL();
                     TICK_ICON_URL = new File("src/main/java/resources/tick.png").toURI().toURL();
                     CROSS_ICON_URL = new File("src/main/java/resources/cross.png").toURI().toURL();
                     BLACK_THEME_URL = new File("src/main/java/resources/blacktheme.css").toURI().toURL();
                     WHITE_THEME_URL = new File("src/main/java/resources/application.css").toURI().toURL();

              } catch (MalformedURLException e) {
                     e.printStackTrace();
              }
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
