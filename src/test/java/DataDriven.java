import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class DataDriven {
	
	//Identify Testcases coloumn by scanning the entire 1st row
	//Once coloumn is identified then entire testcase coloumn to identify purchase testcase row
	//After you grab purchase testcase row = pull all the data of that row and feed into test

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:\\Users\\Jyotsana\\Documents\\Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);   //this is a class in apache poi
		int sheets = wb.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(wb.getSheetName(i).equalsIgnoreCase("TestData"))
			{
				XSSFSheet sheet = wb.getSheetAt(i);
				
				//Identify Testcases coloumn by scanning the entire 1st row
			}
			
		}
	}

}
