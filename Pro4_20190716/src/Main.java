import javax.swing.SwingUtilities;

public class Main {
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
			// MyFrameのインスタンスを生成する
			kadai frame= new kadai();
			}
		});
	}
}