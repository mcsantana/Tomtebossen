fun main(args: Array<String>) {

    val database = Database()

    val resultList: List<String> = database.getListWithBossesTo("bladlusen")
    resultList.stream().forEach({e-> println(e)})

}