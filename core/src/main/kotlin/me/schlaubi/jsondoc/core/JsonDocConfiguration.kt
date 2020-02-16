package me.schlaubi.jsondoc.core

import com.sun.source.util.DocTreePath
import jdk.javadoc.doclet.Doclet
import jdk.javadoc.internal.doclets.toolkit.BaseConfiguration
import jdk.javadoc.internal.doclets.toolkit.Messages
import jdk.javadoc.internal.doclets.toolkit.Resources
import jdk.javadoc.internal.doclets.toolkit.WriterFactory
import java.util.*
import javax.lang.model.element.Element
import javax.tools.JavaFileManager
import javax.tools.JavaFileObject

class JsonDocConfiguration(doclet: Doclet) : BaseConfiguration(doclet) {
    override fun getLocale(): Locale = Locale.ENGLISH

    override fun getDocletVersion(): String = "1.0.0"

    override fun showMessage(path: DocTreePath?, key: String?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showMessage(e: Element?, key: String?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun finishOptionSettings(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMessages(): Messages {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getOverviewPath(): JavaFileObject {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getWriterFactory(): WriterFactory {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFileManager(): JavaFileManager {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getResources(): Resources {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}