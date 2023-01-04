package com.focus.Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;

public class TransactionsImportPage extends BaseEngine
{

	

	//*[@id="oTransImportVouchers"]
	@FindBy(xpath="//*[@id='oTransImportVouchers']")
	private static WebElement voucherTypeComboBox;
	
	
	
	

	
	
	 //Home Menu
		@FindBy (xpath="//*[@id='1']/div/span")
	    public static WebElement homeMenu;
		
	        //Masters Menu	
			@FindBy (xpath="//*[@id='1000']/span")
		    public static WebElement mastersMenu;
			
			    //Accounts 
				@FindBy (xpath="//a[@id='1104']//span[contains(text(),'Account')]")
				public static WebElement accounts;
		

		 //Utilities Menu		
		@FindBy (xpath="//*[@id='20']/span")
	    private static WebElement utilities;
	
		
	
		@FindBy (xpath="//input[@id='oTransImportVouchers']")
	    private static WebElement transImpVoucherTyeDrpdwn;
	
		@FindBy (xpath="//button[@id='btnTrnsImpBrowse']")
	    private static WebElement transImpFileNameBtn;
	
		@FindBy (xpath="//input[@id='txtTrnsImpFile']")
	    private static WebElement transImpFileNameTxt;
	
		@FindBy (xpath="//select[@id='ddlDAccInATrnsTagTo']")
	    private static WebElement transImpAccInTransTaggedDrpdwn;
	
		@FindBy (xpath="//select[@id='ddlDProInATrnsTagTo']")
	    private static WebElement transImpItemInTransTaggedDrpdwn;
	
		@FindBy (xpath="//select[@id='ddlTagsInTrnsTagTo']")
	    private static WebElement transImpTransInTaggedDrpdwn;
	
		@FindBy (xpath="//*[@id='RestoreControls']/ul/li/div[2]")
	    private static WebElement TransImpSaveTempleteBtn;
	
		@FindBy (xpath="//*[@id='RestoreControls']/ul/li/div[3]")
	    private static WebElement transImpImportBtn;
	
		@FindBy (xpath="//*[@id='RestoreControls']/ul/li/div[4]")
	    private static WebElement transImpCloseBtn;
	
		@FindBy (xpath="//*[@id='grdTransactionImport_body']/tr/td[2]")
	    private static List<WebElement> transImpGridFocusFieldColList;
		
		
		@FindBy (xpath="//*[@id='grdTransactionImport_body']/tr/td[3]")
	    private static List<WebElement> transImpGridDataBaseFieldColList;
	
		@FindBy (xpath="//*[@id='grdTransactionImport_body']/tr[4]/td[3]")
	    private static WebElement transImpgrid4RowCol3;
	
		@FindBy (xpath="//*[@id='ddlDatabaseField']")
	    private static WebElement gridDataBaseList;
		
		
		@FindBy(xpath="//div[contains(text(),'Inventory')]")
		private static WebElement  inventoryMenu; 
			
		@FindBy(xpath="//a[@id='137']//span[contains(text(),'Transactions')]")
		private static WebElement  inventoryTransactionsMenu; 
			
		@FindBy(xpath="//*[@id='139']/span")
		private static WebElement  inventoryTransactionsPurchasesMenu; 
		
		@FindBy(xpath="//*[@id='2010']/span")
		private static WebElement  requestForQuoteVoucher;
		
		@FindBy(xpath="//*[@id='2011']/span")
		private static WebElement  purchasesQuotationsVoucher;
			
		@FindBy(xpath="//*[@id='2012']/span")
		private static WebElement  purchasesOrdersVoucher;
	
		@FindBy(xpath="//*[@id='2013']/span")
		private static WebElement  materialReceiptNotesVoucher;
					
		@FindBy(xpath="//*[@id='140']/span")
		private static WebElement  inventoryTransactionsSalesMenu; 
				
		@FindBy(xpath="//*[@id='2018']/span")
		private static WebElement  salesQuotationsVoucher;
		
		@FindBy(xpath="//*[@id='2019']/span")
		private static WebElement  deliveryNotesVoucher;
		
		@FindBy(xpath="//*[@id='2022']/span")
		private static WebElement  posSalesVoucher;
		
		@FindBy(xpath="//*[@id='2045']/span")
		private static WebElement  productionOrdersVoucher;
		
		@FindBy(xpath="//*[@id='2017']/span")
		private static WebElement  salesOrdersVoucher;
							
		@FindBy(xpath="//a[@id='2033']//span[contains(text(),'Stocks')]")
		private static WebElement  inventoryTransactionsStocksMenu; 
				
		@FindBy(xpath="//span[contains(text(),'Shortages in Stock')]")
		private static WebElement  shortagesInStockVoucher;
		
		@FindBy(xpath="//span[contains(text(),'Excesses in Stocks')]")
		private static WebElement  excessesInStocksVoucher;
			
		@FindBy(xpath="//span[contains(text(),'Stock Transfers')]")
		private static WebElement  stockTransfersVoucher;
		
		@FindBy(xpath="//a[@id='2037']//span[contains(text(),'Opening Stocks')]")
		private static WebElement  openingStocksVoucher;
		
		@FindBy(xpath="//a[@id='2049']//span[contains(text(),'Opening Stocks New')]")
		private static WebElement  openingStocksNewVoucher;
		
		@FindBy(xpath="//*[@id='2038']/span")
		private static WebElement  materialRequisitionVoucher;
				
	
		
		
		@FindBy (xpath="//*[@id='grdTransactionImport_body']/tr[5]/td[3]")
	    private static WebElement transImpgrid5RowCol3;
		
		
		
		@FindBy (xpath="//*[@id='grdTransactionImport_body']/tr[*]/td[2]")
	    private static List<WebElement> MappingGridFieldsList;
		
		@FindBy (xpath="//*[@id='grdTransactionImport_body']/tr[*]/td[3]")
	    private static List<WebElement> MappingGridDatabaseFieldsList;
		
		
		@FindBy (xpath="//*[@id='grdTransactionImport_body']/tr[13]/td[3]")
	    private static WebElement transImpgrid13RowCol3;
		
		
		@FindBy (xpath="//*[@id='grdTransactionImport_body']/tr[14]/td[3]")
	    private static WebElement transImpgrid14RowCol3;
		//*[@id="grdTransactionImport_body"]/tr[*]/td[2]


		 @FindBy (xpath="//*[@id='128']/span")
		 private static WebElement transactionImport;
		 

		 
			@FindBy (xpath="//tbody[@id='tblBodyTransRender']/tr/td[2]/input")
			private static List<WebElement> grid_CheckBoxList;
			
			@FindBy (xpath="//tbody[@id='tblBodyTransRender']/tr/td[5]")
			private static List<WebElement> grid_VoucherNoList;
			
		 
		 
		 
		 @FindBy (xpath="//select[@id='ddlDatabaseField']")
		 private static WebElement selectFieldsDropdown;
		 
		 
		 public static boolean checkImportingOpeningStocksVoucher() throws IOException, InterruptedException
		 {
				Thread.sleep(4000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
				utilities.click();
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
				transactionImport.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
				voucherTypeComboBox.click();
				voucherTypeComboBox.sendKeys("Opening Stocks");
				Thread.sleep(2000);
				voucherTypeComboBox.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
				transImpFileNameBtn.click();
				
				Thread.sleep(5000);
		  		
		  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\TransImportOpeningStocks.exe");

		  		Thread.sleep(5000);
		  		
		  		
		  		/*int count = MappingGridFieldsList.size();
				
				Select externalField = new Select(selectFieldsDropdown);
				
				for (int i = 0; i < count; i++) 
				{
					String data = MappingGridFieldsList.get(i).getText();
					
					if (data.equalsIgnoreCase("DocNo")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("DocNo");
					}
					
					if (data.equalsIgnoreCase("Date")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Date");
					}
					
					if (data.equalsIgnoreCase("Warehouse")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Warehouse");
					}
					
					if (data.equalsIgnoreCase("Item")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Item");
					}
					
					if (data.equalsIgnoreCase("Unit")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Units");
					}
					
					if (data.equalsIgnoreCase("Quantity")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Quantity");
					}
					
					if (data.equalsIgnoreCase("Rate")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Rate");
					}
					
					if (data.equalsIgnoreCase("Gross")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Gross");
					}
					
					
					if (data.equalsIgnoreCase("Batch")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Batch");
					}
					
					if (data.equalsIgnoreCase("Bins")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Bins");
					}
					
					if (data.equalsIgnoreCase("ExpDate")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Exp Date");
					}
					
					if (data.equalsIgnoreCase("RMA")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("RMA");
					}
				}*/
				
				Thread.sleep(2000);
		  		
		  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
		  		transImpImportBtn.click();
		  		
		  		
		  		getWaitForAlert();
		  		
		  		String actAlertText = getAlert().getText();
		  		String expAlertText1 = "1 Vouchers imported successfully";
		  		
		  		String expAlertText2 = "Vouchers imported : 1";
		  		
		  		

		  		System.err.println(" actAlertText "+actAlertText);
		  		
		  		getAlert().accept();
		  		
		  		
		  		if (actAlertText.startsWith(expAlertText1) && actAlertText.endsWith(expAlertText2))
		  		{
					return true;
				} 
		  		else
		  		{
		  			return false;
				}	
		  		
			}
		 
		 	public static boolean checkImportedOpeningStocksVoucher() throws InterruptedException
		 	{
		 		Thread.sleep(3000);
		 		getDriver().navigate().refresh();
		 		Thread.sleep(3000);
		 		
		 		checkImportedVoucher(inventoryMenu, inventoryTransactionsMenu, inventoryTransactionsStocksMenu, openingStocksVoucher, "1");
		 		
		 		return true;

		 	}
		 
		 
		 	public static boolean checkTransactionImportForExcessInStocks() throws IOException, InterruptedException
		 	{

				Thread.sleep(4000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
				utilities.click();
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
				transactionImport.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
				voucherTypeComboBox.click();
				voucherTypeComboBox.sendKeys("Excesses in Stocks");
				Thread.sleep(2000);
				voucherTypeComboBox.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
				transImpFileNameBtn.click();
				
				Thread.sleep(5000);
		  		
		  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\TransImportExcessInStocks.exe");

		  		Thread.sleep(5000);
		  		
		  		
		  		int count = MappingGridFieldsList.size();
				
				Select externalField = new Select(selectFieldsDropdown);
				
				for (int i = 0; i < count; i++) 
				{
					String data = MappingGridFieldsList.get(i).getText();
					
					if (data.equalsIgnoreCase("DocNo")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("DocNo");
					}
					
					if (data.equalsIgnoreCase("Date")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Date");
					}
					
					if (data.equalsIgnoreCase("Warehouse")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Warehouse");
					}
					
					if (data.equalsIgnoreCase("Item")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Item");
					}
					
					if (data.equalsIgnoreCase("Unit")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Units");
					}
					
					if (data.equalsIgnoreCase("Quantity")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Quantity");
					}
					
					if (data.equalsIgnoreCase("Rate")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Rate");
					}
					
					if (data.equalsIgnoreCase("Gross")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Gross");
					}
					
					
					if (data.equalsIgnoreCase("Batch")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Batch");
					}
					
					if (data.equalsIgnoreCase("Bins")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Bins");
					}
					
					if (data.equalsIgnoreCase("ExpiryDate")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Exp Date");
					}
					
					if (data.equalsIgnoreCase("RMA")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("RMA");
					}
				}
				
				Thread.sleep(2000);
		  		
		  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
		  		transImpImportBtn.click();
		  		
		  		
		  		getWaitForAlert();
		  		
		  		String actAlertText = getAlert().getText();
		  		String expAlertText1 = "1 Vouchers imported successfully";
		  		
		  		String expAlertText2 = "Vouchers imported : 1";
		  		
		  		

		  		System.err.println(" actAlertText "+actAlertText);
		  		
		  		getAlert().accept();
		  		
		  		
		  		if (actAlertText.startsWith(expAlertText1) && actAlertText.endsWith(expAlertText2))
		  		{
					return true;
				} 
		  		else
		  		{
		  			return false;
				}	
		  		
			
		 	}
		 
		 	public static boolean checkImportedExcessInStockVoucher() throws InterruptedException
		 	{
		 		Thread.sleep(2000);
		 		getDriver().navigate().refresh();
		 		Thread.sleep(3000);

		 		
		 		checkImportedVoucher(inventoryMenu, inventoryTransactionsMenu, inventoryTransactionsStocksMenu, excessesInStocksVoucher, "1");
		 		
		 		return true;
		 	}
		 	
		 	public static boolean checkImportingShortagesInStocks() throws InterruptedException, IOException
		 	{
				Thread.sleep(4000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
				utilities.click();
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
				transactionImport.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
				voucherTypeComboBox.click();
				voucherTypeComboBox.sendKeys("Excesses in Stocks");
				Thread.sleep(2000);
				voucherTypeComboBox.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
				transImpFileNameBtn.click();
				
				Thread.sleep(5000);
		  		
		  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\TransImportShortagesInStocks.exe");

		  		Thread.sleep(5000);
		  		
		  		
		  		int count = MappingGridFieldsList.size();
				
				Select externalField = new Select(selectFieldsDropdown);
				
				for (int i = 0; i < count; i++) 
				{
					String data = MappingGridFieldsList.get(i).getText();
					
					if (data.equalsIgnoreCase("DocNo")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("DocNo");
					}
					
					if (data.equalsIgnoreCase("Date")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Date");
					}
					
					if (data.equalsIgnoreCase("Warehouse")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Warehouse");
					}
					
					if (data.equalsIgnoreCase("Item")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Item");
					}
					
					if (data.equalsIgnoreCase("Unit")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Units");
					}
					
					if (data.equalsIgnoreCase("Quantity")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Quantity");
					}
					
					if (data.equalsIgnoreCase("Rate")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Rate");
					}
					
					if (data.equalsIgnoreCase("Gross")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Gross");
					}
					
					
					if (data.equalsIgnoreCase("Batch")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Batch");
					}
					
					if (data.equalsIgnoreCase("Bins")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Bins");
					}
					
					if (data.equalsIgnoreCase("ExpiryDate")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Exp Date");
					}
					
					if (data.equalsIgnoreCase("RMA")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("RMA");
					}
				}
				
				Thread.sleep(2000);
		  		
		  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
		  		transImpImportBtn.click();
		  		
		  		
		  		getWaitForAlert();
		  		
		  		String actAlertText = getAlert().getText();
		  		String expAlertText1 = "1 Vouchers imported successfully";
		  		
		  		String expAlertText2 = "Vouchers imported : 1";
		  		
		  		

		  		System.err.println(" actAlertText "+actAlertText);
		  		
		  		getAlert().accept();
		  		
		  		
		  		if (actAlertText.startsWith(expAlertText1) && actAlertText.endsWith(expAlertText2))
		  		{
					return true;
				} 
		  		else
		  		{
		  			return false;
				}	
		  	
		 	}
		 
		 
		 	
		 	public static boolean checkImportedShortagesInStocksVoucher() throws InterruptedException
		 	{

		 		Thread.sleep(2000);
		 		getDriver().navigate().refresh();
		 		Thread.sleep(3000);

		 		
		 		checkImportedVoucher(inventoryMenu, inventoryTransactionsMenu, inventoryTransactionsStocksMenu, excessesInStocksVoucher, "1");
		 		
		 		return true;
		 	}
		 
		 	public static boolean checkImportingMaterialRequisitionVoucher() throws IOException, InterruptedException
		 	{

				Thread.sleep(4000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
				utilities.click();
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
				transactionImport.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
				voucherTypeComboBox.click();
				voucherTypeComboBox.sendKeys("Material Requisition");
				Thread.sleep(2000);
				voucherTypeComboBox.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
				transImpFileNameBtn.click();
				
				Thread.sleep(5000);
		  		
		  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\TransImportMaterialReqisition.exe");

		  		Thread.sleep(5000);
		  		
		  		
		  		int count = MappingGridFieldsList.size();
				
				Select externalField = new Select(selectFieldsDropdown);
				
				for (int i = 0; i < count; i++) 
				{
					String data = MappingGridFieldsList.get(i).getText();
					
					if (data.equalsIgnoreCase("DocNo")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("DocNo");
					}
					
					if (data.equalsIgnoreCase("Date")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Date");
					}
					
					if (data.equalsIgnoreCase("Department")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Department");
					}
					
					if (data.equalsIgnoreCase("Item")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Item");
					}
					
					if (data.equalsIgnoreCase("Unit")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Units");
					}
					
					if (data.equalsIgnoreCase("Quantity")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Quantity");
					}
					
					if (data.equalsIgnoreCase("Rate")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Rate");
					}
					
					if (data.equalsIgnoreCase("Gross")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Gross");
					}
					
					/*//No batch bin items was not given in the excel so commented
					if (data.equalsIgnoreCase("Batch")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Batch");
					}
					
					if (data.equalsIgnoreCase("Bins")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Bins");
					}
					
					if (data.equalsIgnoreCase("ExpiryDate")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Exp Date");
					}
					
					if (data.equalsIgnoreCase("RMA")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("RMA");
					}*/
				}
				
				Thread.sleep(2000);
		  		
		  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
		  		transImpImportBtn.click();
		  		
		  		
		  		getWaitForAlert();
		  		
		  		String actAlertText = getAlert().getText();
		  		String expAlertText1 = "1 Vouchers imported successfully";
		  		
		  		String expAlertText2 = "Vouchers imported : 1";
		  		
		  		

		  		System.err.println(" actAlertText "+actAlertText);
		  		
		  		getAlert().accept();
		  		
		  		
		  		if (actAlertText.startsWith(expAlertText1) && actAlertText.endsWith(expAlertText2))
		  		{
					return true;
				} 
		  		else
		  		{
		  			return false;
				}	
		  	
		 	
		 		
		 	}
		 
		 	
		 	public static boolean checkImportedMaterialReqVoucher() throws InterruptedException
		 	{


		 		Thread.sleep(2000);
		 		getDriver().navigate().refresh();
		 		Thread.sleep(3000);

		 		
		 		checkImportedVoucher(inventoryMenu, inventoryTransactionsMenu, inventoryTransactionsStocksMenu, materialRequisitionVoucher, "1");
		 		return true;
		 	
		 	}
		 	
		 	public static boolean checkImportingPurchaseOrdersVoucher() throws InterruptedException, IOException
		 	{
				Thread.sleep(4000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
				utilities.click();
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
				transactionImport.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
				voucherTypeComboBox.click();
				voucherTypeComboBox.sendKeys("Purchases Orders");
				Thread.sleep(2000);
				voucherTypeComboBox.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
				transImpFileNameBtn.click();
				
				Thread.sleep(5000);
		  		
		  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\TransImportPurchaseOrder.exe");

		  		Thread.sleep(5000);
		  		
		  		
		  		int count = MappingGridFieldsList.size();
				
				Select externalField = new Select(selectFieldsDropdown);
				
				for (int i = 0; i < count; i++) 
				{
					String data = MappingGridFieldsList.get(i).getText();
					
					if (data.equalsIgnoreCase("DocNo")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("DocNo");
					}
					
					if (data.equalsIgnoreCase("Date")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Date");
					}
					
					if (data.equalsIgnoreCase("	PurchaseAc")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("	PurchaseAC");
					}
					
					if (data.equalsIgnoreCase("VendorAC")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Vendor Ac");
					}
					
					
					if (data.equalsIgnoreCase("Department")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Department");
					}
					
					if (data.equalsIgnoreCase("Item")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Item");
					}
					
					if (data.equalsIgnoreCase("Unit")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Units");
					}
					
					if (data.equalsIgnoreCase("Quantity")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Quantity");
					}
					
					if (data.equalsIgnoreCase("Rate")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Rate");
					}
					
					if (data.equalsIgnoreCase("Gross")) 
					{
						MappingGridDatabaseFieldsList.get(i).click();
						externalField.selectByVisibleText("Gross");
					}
					
				}
				
				Thread.sleep(2000);
		  		
		  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
		  		transImpImportBtn.click();
		  		
		  		
		  		getWaitForAlert();
		  		
		  		String actAlertText = getAlert().getText();
		  		String expAlertText1 = "1 Vouchers imported successfully";
		  		
		  		String expAlertText2 = "Vouchers imported : 1";
		  		
		  		

		  		System.err.println(" actAlertText "+actAlertText);
		  		
		  		getAlert().accept();
		  		
		  		
		  		if (actAlertText.startsWith(expAlertText1) && actAlertText.endsWith(expAlertText2))
		  		{
					return true;
				} 
		  		else
		  		{
		  			return false;
				}	
		 	}
		 	
		 	
		 	public static boolean checkImportedPurchaseOrdersVoucher() throws InterruptedException
		 	{
		 		Thread.sleep(2000);
		 		getDriver().navigate().refresh();
		 		Thread.sleep(3000);

		 		
		 		checkImportedVoucher(inventoryMenu, inventoryTransactionsMenu, inventoryTransactionsPurchasesMenu, purchasesOrdersVoucher, "1");
		 	
		 		return true;
		 	}
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
			public TransactionsImportPage(WebDriver driver) 
			{
				
				  PageFactory.initElements(driver, this);
			}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}
