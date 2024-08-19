object StringFormatter {
     
    def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name) 

    def main(args: Array[String]): Unit = {

        println(formatNames("Benny")(name => name.toUpperCase))

        println(formatNames("Niroshan")(name => name.substring(0,2).toUpperCase + name.substring(2).toLowerCase))

        println(formatNames("Saman")(name => name.toLowerCase))

        println( formatNames("Kumara")(name => 

            name.substring(0,1).toUpperCase + 
            name.substring(1, name.length - 1).toLowerCase +
            name.substring(name.length - 1).toUpperCase
            
        ))


    }
}