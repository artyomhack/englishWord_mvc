import com.random.englishword.data.entity.EnglishWord;
import com.random.englishword.data.entity.RussianWord;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelTest {

    @Test
    public void getExcel() {

        HashMap<String, String> hashMap = new HashMap<>();
        EnglishWord englishWord = new EnglishWord(new ArrayList<>());
        RussianWord russianWord = new RussianWord(new ArrayList<>());
        String path = "C:\\__work\\project\\englishWord\\src\\test\\resources\\wor.xlsx";
        try {

            Workbook workbook = new XSSFWorkbook(path);
            Sheet sheet = workbook.getSheet("Sheet1");
            DataFormatter dataFormatter = new DataFormatter();

            Iterator<Sheet> sheetIterator = workbook.sheetIterator();
            while (sheetIterator.hasNext()) {
                Sheet sheet1 = sheetIterator.next();
                System.out.println("Sheet name:" + sheet1.getSheetName());
                System.out.println("--------------------");
                Iterator<Row> rowIterator = sheet1.rowIterator();
                while (rowIterator.hasNext()) {
                    Row row = rowIterator.next();
                    Iterator<Cell> cellIterator = row.cellIterator();
                    int i = -1;
                    while (cellIterator.hasNext()) {
                        i++;
                        Cell cell = cellIterator.next();
                        String cellValue = dataFormatter.formatCellValue(cell);
                        if (i == 0) {
                            englishWord.addWord(cellValue.toString());
                        }
                        else if (i == 1) {
                            russianWord.addWord(cellValue);
                        }
                    }
                }
            }

            for (int i = 0; i < englishWord.getEnglishWords().size() && i < russianWord.getRussianWords().size(); i++)
                hashMap.put(englishWord.getWord(i), russianWord.getWord(i));

            int n = 1000;
            String[] strings = new String[n];

            for(int i = 1; i < n; i++) {
                String t = englishWord.getRandomFromWords();
                strings[i-1] = t;
            }

            for (int i = 1; i < n; i++) {
                if (Objects.equals(strings[i], strings[i - 1])) {
                    System.out.println(strings[i] + " and " + strings[i-1]);
                }
            }

        } catch (IOException ignored) {
            ignored.printStackTrace();
        }

    }
}
