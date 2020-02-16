package me.schlaubi.jsondoc.shared.entites

import javax.lang.model.element.ElementKind

data class ClassDoc(
        val kind: ElementKind,
        val qualifiedName: String,
        val simpleName: String,
        val module: String,
        val packageName: String,
        val typeParameters: Any,
        val superclasses: Any,
        val implementaions: Any,
        val modifiers: Any
) {
}