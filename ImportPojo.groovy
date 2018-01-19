// https://mvnrepository.com/artifact/com.opencsv/opencsv
@Grapes(
    @Grab(group='com.opencsv', module='opencsv', version='4.1')
)

import com.opencsv.CSVReader
import com.opencsv.bean.CsvToBeanBuilder

println "入力"
List<Customer> customers = new CsvToBeanBuilder(new FileReader("input.csv"))
    .withSeparator(',' as char)
    .withQuoteChar('"' as char)
    // \ をエスケープ文字に指定したが、" もエスケープ文字になっている
    .withEscapeChar('\\' as char)
    .withType(Customer.class).build().parse()

customers.eachWithIndex { record,i ->
    println "${i}行目----------"
    println "name[${record.name}]"
    println "age[${record.age}]"
}
