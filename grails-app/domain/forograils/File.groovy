package forograils

class File {

    String fileType
    Byte[] content
    Double size

    static belongsTo = [file:File]

    static constraints = {
        content(maxSize: 10000000)
        fileType(matches: "[a-zA-Z]+/[a-zA-Z]+")
    }
}
