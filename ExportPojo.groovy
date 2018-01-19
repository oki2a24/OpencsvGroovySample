// https://mvnrepository.com/artifact/com.opencsv/opencsv
@Grapes(
    @Grab(group='com.opencsv', module='opencsv', version='4.1')
)

import com.opencsv.CSVWriter
import com.opencsv.bean.StatefulBeanToCsv
import com.opencsv.bean.StatefulBeanToCsvBuilder

//List<MyUser> myUsers = [
//    new MyUser(name: "Sundar Pichai ♥", email: "sundar.pichai@gmail.com", phoneNo: "+1-1111111111", country: "India"),
//    new MyUser(name: "Satya Nadella", email: "satya.nadella@outlook.com", phoneNo: "+1-1111111112", country: "India")
//]

List<Customer> customers = [
    new Customer(name: "試験太郎", age: "14"),
    new Customer(name: "試験\"\"花子", age: "15")
]

println "出力"
Writer writer = new FileWriter("output.csv")
StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer)
    //.withQuotechar(CSVWriter.DEFAULT_QUOTE_CHARACTER)
    .build()
//beanToCsv.write(myUsers)
beanToCsv.write(customers)
writer.close()
println "output.csv を確認して！"
