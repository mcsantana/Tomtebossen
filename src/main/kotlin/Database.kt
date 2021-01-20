/**
 * created by Mimi Santana
 * Date: 2021-01-20
 * Time: 13:22
 * Project: Inlämning_Tomtebossen
 * Copyright: MIT
 */
class Database {

    val hierarchy = mutableMapOf<String, String>(
        "bladlusen" to "myran",
        "myran" to "räven",
        "gråsuggan" to "räven",
        "skumtomten" to "trötter",
        "dammråttan" to "skumtomten",
        "räven" to "butter",
        "haren" to "butter",
        "nyckelpigan" to "butter",
        "rådjuret" to "butter",
        "blyger" to "glader",
        "trötter" to "glader",
        "tröger" to "glader",
        "butter" to "tomten",
        "glader" to "tomten",
        "tomten" to ""
    )
    val listWithSubordinates = mutableListOf<String>()


    tailrec fun getListWithBossesTo(nisse: String): List<String> {
        if (nisse == "") {
            println("slut på nissar")
        } else if (!hierarchy.contains(nisse)){
            println("Denna nisse finns inte")
        } else{
            var result = hierarchy.getValue(nisse).toString()
            listWithSubordinates.add(result)


            getListWithBossesTo(result)
        }

        return listWithSubordinates
    }


}


