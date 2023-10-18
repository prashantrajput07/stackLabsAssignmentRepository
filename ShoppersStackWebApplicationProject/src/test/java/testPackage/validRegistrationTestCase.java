package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListener;
import genericPackage.Flib;
import pagePackage.SignupPage;
@Listeners(CustomeListener.class)

public class validRegistrationTestCase extends BaseTest {
  @Test
  public void validTest1() throws EncryptedDocumentException, IOException, InterruptedException {
	  
	  Flib flib = new Flib();
	  
	  Thread.sleep(10000);
	  SignupPage sp = new SignupPage(driver);
	  sp.performRegistration(flib.readExcelData(EXCEL_PATH, SHEET_NAME,1,0),flib.readExcelData(EXCEL_PATH, SHEET_NAME,1,1),flib.readExcelData(EXCEL_PATH, SHEET_NAME, 1,2),flib.readExcelData(EXCEL_PATH, SHEET_NAME, 1,3),flib.readExcelData(EXCEL_PATH, SHEET_NAME,1,4));
	  
  }
}
