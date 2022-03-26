package ProjectSwingSampleCode.src.lab_app;

import static ProjectSwingSampleCode.src.lab_app.BookClub.statusBar;


public interface MessageableWindow {
	public default void displayError(String msg) {
		statusBar.setForeground(Util.ERROR_MESSAGE_COLOR);
		statusBar.setText(msg);
	}
	
	public default void displayInfo(String msg) {
		statusBar.setForeground(Util.INFO_MESSAGE_COLOR);
		statusBar.setText(msg);
	}
	
	public void updateData();
}
