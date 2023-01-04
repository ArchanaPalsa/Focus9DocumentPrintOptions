package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.LoginPage;
import com.focus.Pages.TransactionsImportPage;
import com.focus.Pages.VoucherPrintOptionsPage;
import com.focus.base.BaseEngine;

public class TransactionsImportTest extends BaseEngine
{
	
	VoucherPrintOptionsPage VPO;
	private static LoginPage lp;
	
	public static TransactionsImportPage TIP;
	
	 @Test(priority=4)
	  public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	  
		  lp=new LoginPage(getDriver());
		  Assert.assertEquals(LoginPage.checkLogin(), true);
	  }
	 
	 @Test(priority=7)
	  public void checkImportingOpeningStocksVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	  
		 TIP=new TransactionsImportPage(getDriver());
		  Assert.assertEquals(TIP.checkImportingOpeningStocksVoucher(), true);
	  }
	
	 
	 
	 @Test(priority=8)
	  public void checkImportedOpeningStocksVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	  
		 TIP=new TransactionsImportPage(getDriver());
		  Assert.assertEquals(TIP.checkImportedOpeningStocksVoucher(), true);
	  }
	 
	 @Test(priority=9)
	  public void checkTransactionImportForExcessInStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	  
		 TIP=new TransactionsImportPage(getDriver());
		  Assert.assertEquals(TIP.checkTransactionImportForExcessInStocks(), true);
	  }
	 
	 @Test(priority=11)
	  public void checkImportedExcessInStockVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	  
		 TIP=new TransactionsImportPage(getDriver());
		  Assert.assertEquals(TIP.checkImportedExcessInStockVoucher(), true);
	  }
	 
	 @Test(priority=13)
	  public void checkImportingShortagesInStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	  
		 TIP=new TransactionsImportPage(getDriver());
		  Assert.assertEquals(TIP.checkImportingShortagesInStocks(), true);
	  }
	 
	 @Test(priority=15)
	  public void checkImportedShortagesInStocksVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	  
		 TIP=new TransactionsImportPage(getDriver());
		  Assert.assertEquals(TIP.checkImportedShortagesInStocksVoucher(), true);
	  }
	 
	 @Test(priority=18)
	  public void checkImportingMaterialRequisitionVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	  
		 TIP=new TransactionsImportPage(getDriver());
		  Assert.assertEquals(TIP.checkImportingMaterialRequisitionVoucher(), true);
	  }
	
	 
	 @Test(priority=20)
	  public void checkImportedMaterialReqVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	  
		 TIP=new TransactionsImportPage(getDriver());
		  Assert.assertEquals(TIP.checkImportedMaterialReqVoucher(), true);
	  }
	
	 @Test(priority=22)
	  public void checkImportingPurchaseOrdersVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	  
		 TIP=new TransactionsImportPage(getDriver());
		  Assert.assertEquals(TIP.checkImportingPurchaseOrdersVoucher(), true);
	  }
	
	 
	 @Test(priority=25)
	  public void checkImportedPurchaseOrdersVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	  
		 TIP=new TransactionsImportPage(getDriver());
		  Assert.assertEquals(TIP.checkImportedPurchaseOrdersVoucher(), true);
	  }
	 
	 
	 
	 
	 
	 
	
	 
	 
	
	
}
