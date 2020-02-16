package me.schlaubi.jsondoc.core

import jdk.javadoc.doclet.Doclet
import jdk.javadoc.doclet.DocletEnvironment
import jdk.javadoc.doclet.Reporter
import java.util.*
import javax.lang.model.SourceVersion
import javax.lang.model.util.ElementFilter
import javax.tools.Diagnostic

class JsonDoc : Doclet {

    private lateinit var locale: Locale
    private lateinit var reporter: Reporter
    private val configuration: JsonDocConfiguration = JsonDocConfiguration(this)

    override fun init(locale: Locale, reporter: Reporter) {
        reporter.print(Diagnostic.Kind.NOTE, "JsonDoc was initialized using $locale")
        this.locale = locale
        this.reporter = reporter
    }

    override fun run(environment: DocletEnvironment): Boolean {

    }

    override fun getName(): String = "jsondoc"

    override fun getSupportedSourceVersion(): SourceVersion = SourceVersion.latest()

    override fun getSupportedOptions(): MutableSet<out Doclet.Option> = mutableSetOf()
}