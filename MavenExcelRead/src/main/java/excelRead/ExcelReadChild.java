package excelRead;

import java.io.IOException;

public class ExcelReadChild {

	public static void main(String[] args) throws IOException {
	 System.out.println(ExcelReadParent.getStringData(1, 0));
	 System.out.println(ExcelReadParent.getIntegerData(1, 1));
	 System.out.println(ExcelReadParent.getFloatData(2, 1));

	}

}
