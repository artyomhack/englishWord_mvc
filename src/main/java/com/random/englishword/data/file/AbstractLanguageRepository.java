package com.random.englishword.data.file;

import com.random.englishword.data.entity.AbstractLanguageWord;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractLanguageRepository<Language extends AbstractLanguageWord<String>>
        implements LanguageRepository {

    private final Language language;

    protected AbstractLanguageRepository(Language language) {
        this.language = language;
    }


    @Override
    public List<String> fetchAll() {
        create(language, "src/main/resources/wor.xlsx");

        return language.getWords();
    }

    private void create(Language language, String pathFileExcel) {
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
                        if (i == 0) language = mapToWord(cellValue);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    abstract Language mapToWord(String cell);
}
