package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

fun main() {
    val doc: Document =
        Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
            .get()
    println(doc.title())

    val quotes: Elements = doc.select(".sc-14uz67c-0.ccmjFA")

    for (quote in quotes) {
        println("\n${quote.text()}")

    }
}
