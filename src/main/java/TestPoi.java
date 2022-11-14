import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022/10/31
 */
public class TestPoi {
    public static void main(String[] args) throws IOException {

        List<Student> studentList = new ArrayList<>();
        Student student = new Student("小章", "男", 11);
        Student student1 = new Student("小多", "男", 12);
        Student student2 = new Student("小空", "女", 13);
        Student student3 = new Student("小去", "女", 14);
        Student student4 = new Student("小哦", "男", 15);
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        Workbook wb = new HSSFWorkbook();
        Sheet sheet = wb.createSheet();
        for (int i = 0; i < studentList.size(); i++) {
            Student stu = studentList.get(i);
            Row row = sheet.createRow(i);
            row.createCell(0).setCellValue(stu.getName());
            row.createCell(1).setCellValue(stu.getAge());
            row.createCell(2).setCellValue(stu.getSex());
        }
        OutputStream out = new FileOutputStream("student.xls");
        wb.write(out);
        out.close();
        wb.close();


    }
}
