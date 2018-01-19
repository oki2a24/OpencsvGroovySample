import com.opencsv.bean.CsvBindByName

public class Customer {
    @CsvBindByName(column = "氏名")
    String name

    @CsvBindByName(column = "年齢")
    String age
}
