package selenium;

public class lerningSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "https://www.facebook.com/nopCommerce";
		
		WorkingWithChrome wc = new WorkingWithChrome();
		
		wc.openChrome();
		
		wc.getTitle(url);
		
		wc.closeBrowser();
	}

}
