fun main() {
    val url = readln()
//    val url = "https://target.com/index.html?port=8080&cookie=&host=localhost"
    val urlList: List<String> = url.substringAfter('?').split("&")
    for (s in urlList) {
        if (s[s.length - 1] == '=') {
            println("${s.substringBefore('=')} : not found")
        } else println("${s.substringBefore('=')} : ${s.substringAfter('=')}")
    }
    for (s in urlList) if (s.contains("pass")) {
        println("password : ${url.substringAfter("pass=").substringBefore("&")}")
    }
}
