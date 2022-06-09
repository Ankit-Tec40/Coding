fun main() {
    var str: String? = null
    var str2: String? = "May be declare nullable string"
    var len1:  Int = str ?.length ?: -1
    var len2:  Int = str2 ?.length ?:  -1
}