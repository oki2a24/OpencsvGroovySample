// https://mvnrepository.com/artifact/com.opencsv/opencsv
@Grapes(
    @Grab(group='com.opencsv', module='opencsv', version='4.1')
)

import com.opencsv.CSVWriter
import com.opencsv.bean.StatefulBeanToCsv
import com.opencsv.bean.StatefulBeanToCsvBuilder

List<Customer> customers = [
    new Customer(name: "試験太郎", age: "14"),
    new Customer(name: "試験\"\"花子", age: "15")
]

println "出力"
Writer writer = new FileWriter("output.csv")
StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer)
    .build()
beanToCsv.write(customers)
writer.close()
println "output.csv を確認して！"
