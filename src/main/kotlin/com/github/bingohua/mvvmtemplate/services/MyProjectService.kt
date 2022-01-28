package com.github.bingohua.mvvmtemplate.services

import com.intellij.openapi.project.Project
import com.github.bingohua.mvvmtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
