package com.github.moonchaserchen.hwideaplugin.services

import com.github.moonchaserchen.hwideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
